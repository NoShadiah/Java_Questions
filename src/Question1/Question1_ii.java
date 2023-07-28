package Question1;

import java.util.Scanner;

public class Question1_ii {
//    fetching user input

    public int getUserNumbers() {
        System.out.println("only provide 5 numbers");
        int sum = 0;


        int count = 0;
        while(count<5){

            Scanner userNumber = new Scanner(System.in);
            System.out.println("Enter number:");
            int Number = userNumber.nextInt();
            sum +=Number;
            count++;
        }
        int average = sum/5;
        return average;
    }
}

class TestDrive{
    public static void main(String[] args) {
        Question1_ii FindingAverage = new Question1_ii();
        System.out.println(FindingAverage.getUserNumbers());
    }
}