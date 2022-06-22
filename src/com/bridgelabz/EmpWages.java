package com.bridgelabz;

public class EmpWages {

    public static void main(String[] args) {
        int EMP_IS_FULL_TIME = 1;
        int empCheck = (int)Math.floor(Math.random()*10)%2;
        if (empCheck==EMP_IS_FULL_TIME)
        {
            System.out.println("employee is present");
        }
        else
        {
            System.out.println("employee is absent");
        }
    }
}
