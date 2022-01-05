package com.lf2a.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            // object mapper
            ObjectMapper objectMapper = new ObjectMapper();

            // read json file
            Student student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);

            // print
            System.out.printf("First Name: %s\n", student.getFirstName());
            System.out.printf("Last Name: %s\n", student.getLastName());

            System.out.println(student);


            Address address = student.getAddress();
            System.out.println(address);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
