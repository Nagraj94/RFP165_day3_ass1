package com.bridgelabz;

public class UC3 {
    public static void main(String[] args) {
        int EMP_IS_FULL_TIME = 1;
        int EMP_IS_PART_TIME = 2;
        int WAGES_PER_HRS = 20;
        int FULL_DAY_HRS = 8;
        int HALF_DAY_HRS = 4;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if(empCheck == EMP_IS_FULL_TIME )
        {
            int dailyFullWages = WAGES_PER_HRS * FULL_DAY_HRS;
            System.out.println("daily wages for full timer: " + dailyFullWages);
        }
        else
        {
            int dailyHalfWages = WAGES_PER_HRS * HALF_DAY_HRS;
            System.out.println("daily wages for half timer: " + dailyHalfWages);
        }
    }
}
