package com.desabisc.instanceofpm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PatternMatching {
    public static void main(String[] args) {
        foo();
        bar();
    }

    // before java 14
    private static void foo() {
        Object obj = "String object";
        if (obj instanceof String) {
            String str = (String) obj;
            log.info("String validado: {}", str);
        }
    }

    // with java 14
    private static void bar() {
        Object obj = "String object";
        if (obj instanceof String str) {
            log.info("String validado: {}", str);
        }
    }
}
