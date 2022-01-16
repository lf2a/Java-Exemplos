package com.github.lf2a;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class App {
    public static void main(String[] args) throws Exception {
        new App().detectFileChange("path-to-directory");
    }

    public void detectFileChange(String file) throws Exception {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get(file);
        WatchKey watchKey = path.register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY,
                StandardWatchEventKinds.ENTRY_DELETE);

        WatchKey key;
        while ((key = watchService.take()) != null) {
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event kind:" + event.kind() + ". File affected: " + event.context());
            }

            key.reset();
        }
    }
}
