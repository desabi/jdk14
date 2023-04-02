package com.desabisc.switchexpression;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        String movie = "Lord Of The Rings";
        determineBestRole(movie);

        movie = "Lord Of The Rings 2";
        determineBestRoleSE(movie);
    }

    private static void determineBestRole(String movie) {
        String bestRole = "";
        switch (movie) {
            case "Lord Of The Rings":
                bestRole = "Frodo";
                break;
            case "Lord Of The Rings 2":
                bestRole = "Aragorn";
                break;
            case "Lord Of The Rings 3":
                bestRole = "Sam";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + movie);
        }
        log.info(bestRole);
    }

    private static void determineBestRoleSE(String movie){
        String bestRole = switch (movie){
            case "Lord Of The Rings" -> "Frodo";
            case "Lord Of The Rings 2" -> "Aragorn";
            case "Lord Of The Rings 3" -> {
                // mas acciones
                yield "Sam";
            }
            default -> throw new IllegalStateException("Unexpected value: " + movie);
        };
        log.info(bestRole);
    }
}
