package com.bridgelabz;

import java.util.Random;

public class UC1 {
    static final int EMP_IS_FULL_TIME = 1;
    static final int EMP_IS_PART_TIME = 2;
    static final int WAGES_PER_HRS = 20;


    public static void main(String[] args) {
        int empHrs = 0;
        int empWages = 0;

        double empCheck = Math.floor(Math.random()*10) % 3;
        if(empCheck == EMP_IS_FULL_TIME )
        {
            empHrs =8;
            System.out.println("Full time employee is present");
            empWages = WAGES_PER_HRS * empHrs;
            System.out.println("daily wages of employee is: " + empWages);
        }
        else if (empCheck == EMP_IS_PART_TIME)
        {
            empHrs =4;
            System.out.println("Part time employee is present");
            empWages = WAGES_PER_HRS * empHrs;
            System.out.println("daily wages of employee is: " + empWages);
        } else
        {
            System.out.println("employee is absent");
        }
    }
}
