package Q11_Threading;

import java.util.Scanner;

public class Thread1 extends Thread{

    String []digits = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public void run() {
        try {
            int number = 0;
            System.out.println("Enter the 4 digit number : ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            String enumber = String.valueOf(number);
            if (enumber.length() < 4) {
                throw new Exception();
            } else {
                while(number!=0) {
                    int value = number % 10;
                    System.out.println(digits[value]);
                    number = number / 10;
                }
            }
        }catch(Exception e) {
            System.out.println("Entered number was less than a 4 digit number.");
        }

    }


}
