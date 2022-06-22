package com.bridgelabz;

import java.util.Random;

public class UC1 {
    static final int EMP_IS_FULL_TIME = 1;
    static final int EMP_IS_PART_TIME = 2;
    static final int WAGES_PER_HRS = 20;
    static final int DAY_PER_MONTH = 20;
    static final int HRS_PER_MONTH = 100;


    public static void main(String[] args) {
        int empHrs = 0;
        int empWages = 0;
        int wagesPerMonth = 0;
        int totalHrs = 0;
        int totalDays = 0;

        while (totalHrs<=HRS_PER_MONTH && totalDays<DAY_PER_MONTH ) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case EMP_IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("employee is full timer");
                    break;
                case EMP_IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("employee is part timer");
                    break;
                default:
                    empHrs = empHrs;
                    System.out.println("employee is absent");
                    break;
            }
            empWages = empHrs * WAGES_PER_HRS;
            System.out.println("daily employee wages is " + empWages);
            break;
        }
        wagesPerMonth = empWages * DAY_PER_MONTH;
        System.out.println("monthly employee wage is " + wagesPerMonth);
    }
}