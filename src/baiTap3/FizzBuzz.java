package baiTap3;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = Integer.parseInt(scanner.nextLine());
        FizzBuzz.traslate(number);
    }

      public static String traslate(int number) {
        if (number >0){
            if (number%3==0 && number%5==0){
                return "FizzBuzz";
            } else if (number%3==0) {
                return "Fizz";
            } else if (number%5==0) {
                return "Buzz";
            } else {
                return number+"";
            }
        } else{
            return "Out of ability";
        }
    }

    public static String spellNumber(int number) {
        String units = "";
        String dozens = "";
        int numberSpellDozensFrom10To19 = number%10;
        int numberSpellDozensFrom20To99 = number/10;
        if (number>0 && number<100){
            String strNumber = number+"";
            if (number == 53 || number == 35) {
                return "FizzBuzz";
            }
            for (int i = 0; i < strNumber.length(); i++) {
                if (strNumber.charAt(i)=='3') {
                    return "Fizz";
                }
            }
            for (int i = 0; i < strNumber.length(); i++) {
                    if (strNumber.charAt(i) == '5') {
                        return "Buzz";
                    }
                }

                if (number < 10) {
                    switch (number) {
                        case 1:
                            return "One";
                        case 2:
                            return "Two";
                        case 3:
                            return "Three";
                        case 4:
                            return "Four";
                        case 5:
                            return "Five";
                        case 6:
                            return "Six";
                        case 7:
                            return "Seven";
                        case 8:
                            return "Eight";
                        case 9:
                            return "Nine";
                    }
                } else if (number >= 10 && number < 20) {
                    switch (numberSpellDozensFrom10To19) {
                        case 0:
                            return "Ten";
                        case 1:
                            return "Eleven";
                        case 2:
                            return "Twelve";
                        case 3:
                            return "Thirteen";
                        case 4:
                            return "Fourteen";
                        case 5:
                            return "Fifteen";
                        case 6:
                            return  "Sixteen";
                        case 7:
                            return "Seventeen";
                        case 8:
                            return "Eighteen";
                        case 9:
                            return "Nineteen";
                    }
                } else if (number >= 20 && number < 100) {
                        switch (numberSpellDozensFrom10To19) {
                            case 1:
                                units = "One";
                                break;
                            case 2:
                                units = "Two";
                                break;
                            case 3:
                                units = "Three";
                                break;
                            case 4:
                                units = "Four";
                                break;
                            case 5:
                                units = "Five";
                                break;
                            case 6:
                                units = "Six";
                                break;
                            case 7:
                                units = "Seven";
                                break;
                            case 8:
                                units = "Eight";
                                break;
                            case 9:
                                units = "Nine";
                                break;
                        }
                        switch (numberSpellDozensFrom20To99) {
                            case 2:
                                dozens = "Twenty ";
                                return dozens + units;
                            case 3:
                                dozens = "Thirty ";
                                return dozens + units;
                            case 4:
                                dozens = "Forty ";
                                return dozens + units;
                            case 5:
                                dozens = "Fifty ";
                                return dozens + units;
                            case 6:
                                dozens = "Sixty ";
                                return dozens + units;
                            case 7:
                                dozens = "Seventy ";
                                return dozens + units;
                            case 8:
                                dozens = "Eighty ";
                                return dozens + units;
                            case 9:
                                dozens = "Ninety ";
                                return dozens + units;
                        }
                    }
                } else {
            return "Out of ability";
        }
        return "";
    }
}
