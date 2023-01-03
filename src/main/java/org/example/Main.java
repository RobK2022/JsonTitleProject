package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {


        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";

        // Added new gson object
        Gson gson = new Gson();

        Car car = gson.fromJson(json, Car.class);
        System.out.println(car.getBrand());


    }
}