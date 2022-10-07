package baiTap1;

import java.util.Scanner;

public class NextDayCalculator {
    static int date;
    static int month;
    static int year;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("1. Display the next day");
            System.out.println("2. Exit");
            System.out.println("Your choice is: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the day: ");
                    System.out.println("Date: ");
                    date = Integer.parseInt(scanner.nextLine());
                    if (date < 1 || date > 31) {
                        System.err.println("This date is NOT exist! Please try again");
                        break;
                    }
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    if (month < 1 || month > 12) {
                        System.err.println("This month is NOT exist! Please try again");
                        break;
                    }
                    if (date == 31) {
                        if (month==2 || month == 4 || month == 6 || month==9||month==11) {
                            System.err.println("This date is NOT exist! Please try again");
                            break;
                        }
                    }
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    if (year < 0) {
                        System.err.println("This year is NOT exist! Please try again");
                        break;
                    }
                    if (!(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                        if (date==29&&month==2) {
                            System.err.println("This date is NOT exist! Please try again");
                            break;
                        }
                    }
                    System.out.printf("Today is: %d/ %d/ %d\n", date, month, year);
                    NextDayCalculator.calNextDay(date, month, year);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Please choose 1 or 2");
            }
        } while (true);
    }

    public static String calNextDay(int date,int month,int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            if (date == 28 && month == 2) {
                return "The next day is 29/ 2/ " + year;
//                System.out.printf("The next day is 29/ 2/ %d\n", year);
            } else if (date == 29 && month == 2) {
                return "The next day is 1/ 3/ " + year;
//                System.out.printf("The next day is 1/ 3/ %d\n", year);
            }
        } else {
            if (date == 31 & month == 12) {
                return "The next day is 1/ 1/ " + (year + 1);
//                System.out.printf("The next day is 1/ 1/ %d\n", year + 1);
            } else if (date == 30) {
                switch (month) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return "The next day is 1/ " + (month + 1) + "/ " + year;
//                        System.out.printf("The next day is 1/ %d/ %d\n", month + 1, year);
//                    break;
                    default:
                        return "The next day is 31/ " + month + "/ " + year;
//                        System.out.printf("The next day is 31/ %d/ %d\n", month, year);
                }
            } else if (date == 31) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        return "The next day is 1/ " + (month + 1) + "/ " + year;
//                        System.out.printf("The next day is 1/ %d/ %d\n", month + 1, year);
                }
            } else if (date == 28 && month == 2) {
                return "The next day is 1/ 3/ " + year;
//                System.out.printf("The next day is 1/ 3/ %d\n", year);
            } else {
                return "The next day is " + (date + 1) + "/ " + month + "/ " + year;
//                System.out.printf("The next day is %d/ %d/ %d\n", date+1,month, year);
            }
        }
        return "";
    }
}
