package com.desabisc.records.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeRecordMain {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord  = new EmployeeRecord("Abi", 12345);
        log.info("employeeRecord: {}", employeeRecord);

        log.info("name: {}", employeeRecord.name());
        log.info("number: {}", employeeRecord.employeeNumber());
    }
}