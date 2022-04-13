package com.training.intial;
import java.util.Scanner;
public class Month {
    
  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num_DaysInMonth = 0; 
        String MonthName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthName = "January";
                num_DaysInMonth = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    num_DaysInMonth = 29;
                } else {
                    num_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthName = "March";
                num_DaysInMonth = 31;
                break;
            case 4:
                MonthName = "April";
                num_DaysInMonth = 30;
                break;
            case 5:
                MonthName = "May";
                num_DaysInMonth = 31;
                break;
            case 6:
                MonthName = "June";
                num_DaysInMonth = 30;
                break;
            case 7:
                MonthName = "July";
                num_DaysInMonth = 31;
                break;
            case 8:
                MonthName = "August";
                num_DaysInMonth = 31;
                break;
            case 9:
                MonthName = "September";
                num_DaysInMonth = 30;
                break;
            case 10:
                MonthName = "October";
                num_DaysInMonth = 31;
                break;
            case 11:
                MonthName = "November";
                num_DaysInMonth = 30;
                break;
            case 12:
                MonthName = "December";
                num_DaysInMonth = 31;
        }
        System.out.print(MonthName + " " + year + " has " + num_DaysInMonth + " days\n");
    }
}