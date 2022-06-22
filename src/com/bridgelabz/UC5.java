package com.bridgelabz;

public class UC5 {

    public static void main(String[] args) {
        final int DAYS_PER_MONTH = 20;
        final int EMP_IS_FULL_TIME = 1;
        final int EMP_IS_PART_TIME = 2;
        final int WAGES_PER_HRS = 20;
        int empFullHrs = 8;
        int empHalfHrs = 4;

        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        if(empCheck == EMP_IS_FULL_TIME)
        {
            int empWages = WAGES_PER_HRS * empFullHrs * DAYS_PER_MONTH;
            System.out.println("full timer employee wages per month: " + empWages);
        }
        else if (empCheck == EMP_IS_PART_TIME)
        {
            int empWages = WAGES_PER_HRS * empHalfHrs * DAYS_PER_MONTH;
            System.out.println("part timer employee wages per month: " + empWages);
        }
        else
        {
            System.out.println("no employee is present");
        }

    }
}
