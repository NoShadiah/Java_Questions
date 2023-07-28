package Question1;

public class Question1_iii {
//    part (a)
    public int partA(){
        int first = -5;
        int second = 8;
        int third = 6;
        int answer = first+second*third; //Following BODMAS
        return answer;
    }
    public int partB(){
        int first = 55;
        int second = 9;
        int answer = (first+second)%second; //Following BODMAS
        return answer;
    }
    public int partC(){
        int first = 20;
        int second = -3;
        int third = 5;
        int fourth = 8;
        int answer = first+second*third/fourth; //Following BODMAS
        return answer;
    }
    public int partD(){
        int first = 5;
        int second = 15;
        int third = 3;
        int fourth = 2;
        int fifth = 8;
        int answer = first+second/third*fourth-fifth%third; //Following BODMAS
        return answer;
    }

}

class QuestionTestDrive{


    public static void main(String[] args) {
        Question1_iii SolutionA = new Question1_iii();
        System.out.println("The solution for part A is");
        System.out.println(SolutionA.partA());
        System.out.println("The solution for part B is");
        System.out.println(SolutionA.partB());
        System.out.println("The solution for part C is");
        System.out.println(SolutionA.partC());
        System.out.println("The solution for part D is");
        System.out.println(SolutionA.partD());
    }

}