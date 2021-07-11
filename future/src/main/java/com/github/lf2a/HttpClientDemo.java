package com.github.lf2a;

import java.util.concurrent.Callable;

/**
 * <h1>HttpClientDemo.java</h1>
 * ---
 *
 * @author Luiz Filipy
 * @version 1.0
 * @since 11/04/2021
 */
public class HttpClientDemo implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        Thread.sleep(5000);
        return true;
    }
}
