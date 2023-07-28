package Question1;

import java.util.ArrayList;

public class Question1_iv {
    static class Animal{
        private String Name;
        private String Color;

        public Animal(String name, String color) {
            Name = name;
            Color = color;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String color) {
            Color = color;
        }
    }
    static class AnimalCollection{
        ArrayList<Animal> myAnimals = new ArrayList<>();
        public void addAnimals(Animal newAnimal){
            myAnimals.add(newAnimal);
            System.out.println("successfully added new animal to collection");
        }
//        method to show all the animals

        public void getMyAnimals() {
            for (Animal x:myAnimals
                 ) {
                System.out.println("The name of this one is "+ x.getName()+" and the color is "+x.getColor());
            }

        }
    }
}

class AnimalcollectionTestDrive{
    public static void main(String[] args) {
        Question1_iv.Animal animal1 = new Question1_iv.Animal("Dog", "Brown");
        Question1_iv.Animal animal2 = new Question1_iv.Animal("Cow", "Black");
        Question1_iv.Animal animal3 = new Question1_iv.Animal("Goat", "Grey");
        Question1_iv.AnimalCollection myanimalCollection = new Question1_iv.AnimalCollection();
        myanimalCollection.addAnimals(animal1);
        myanimalCollection.addAnimals(animal2);
        myanimalCollection.addAnimals(animal3);
        System.out.println("These are the animals in my collection");

        myanimalCollection.getMyAnimals();
        System.out.println("Thats all i have");
    }
}
