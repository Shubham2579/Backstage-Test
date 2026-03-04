package com.example;

import static spark.Spark.*;

public class UserServiceApplication {

    public static void main(String[] args) {

        port(8080);

        get("/users", (req, res) -> {
            res.type("application/json");
            return "[{\"id\":1,\"name\":\"Alice\"},{\"id\":2,\"name\":\"Bob\"}]";
        });
    }
}