package com.bridgelabz;

import java.util.Random;

public class UC1 {
    public static void main(String[] args) {
        int EMP_IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random()*10) % 2;
        if(EMP_IS_FULL_TIME == empCheck)
        {
            System.out.println("employee is present");
        }
        else
        {
            System.out.println("employee is absent");
        }
    }
}
