package Question4;

import javax.swing.*;
import java.util.Scanner;

public class Roman3 {
    static class Box{
        private float width;

        public Box(float width) {
            this.width = width;
        }

        public float getWidth() {
            return width;
        }
        public void setWidth() {
            System.out.println("Let's update the width of the box");
            Scanner Width = new Scanner(System.in);
            System.out.println("Enter new width:");
            width = Width.nextFloat();
        }
    }
}

class BoxTestDrive{
    public static void main(String[] args) {
        Roman3.Box Box1 = new Roman3.Box(2.500F);
//        setting the person's age and salary
        String width = String.valueOf(Box1.getWidth());

        System.out.println("\nYour box's width is "+width);

        Box1.setWidth();
        System.out.println("Successfully updated values of salary and width");
        System.out.println("\nYour width is "+Box1.getWidth());
    }
}