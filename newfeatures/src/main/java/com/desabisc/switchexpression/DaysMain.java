package com.desabisc.switchexpression;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaysMain {
    public static void main(String[] args) {
        printDay("");
        printDay("W");
        printDay("S");
        printDay("X");
    }

    private static void printDay(String day) {
        String daySelected = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if (day.isEmpty()) {
                    yield "Please insert a valid day";
                } else {
                    yield "Looks like a Sunday";
                }
            }
        };
        log.info("Day Selected: {}", daySelected);
    }
}
