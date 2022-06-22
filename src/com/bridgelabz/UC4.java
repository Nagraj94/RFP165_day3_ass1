package com.bridgelabz;

public class UC4 {
    public static void main(String[] args) {
        final int EMP_IS_FULL_TIME = 1;
        final int EMP_IS_PART_TIME = 2;
        final int WAGES_PER_HRS = 20;

        int empHrs = 0;
        int empWage = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck)
        {
            case EMP_IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Employee is full time");
                break;
            case EMP_IS_PART_TIME:
                empHrs = 4;
                System.out.println("Employee is part time");
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * WAGES_PER_HRS;
        System.out.println("Employee total wages is: " + empWage);
    }
}
