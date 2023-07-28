package Question1;



//This classs is to still act as the driver class for the question
public class Question1_i {
    public static void main(String[] args) {
//        Setting a method to get even numbers
        int myNumber = 8;
        System.out.println("The sum of even numbers less than 8 is ");
        GetEvenSum(myNumber);

    }
    public static void GetEvenSum(int number){
        if(number != 8){
            System.out.println("Number provide is either less than or greater than 8");
    }else{
            //        The sum of the even numbers less than 8
            int sum = 0;
            int Numbers = number-2;
//The while loop continues as long as The value of Numbers is not yet = 0
            while(Numbers!=0){
                sum+=Numbers;
                Numbers = Numbers-2;

            }

            System.out.println(sum);
        }
        }

}
