package model;

public class Chicken extends Animal implements Edible{
    @Override
    public void sound() {
        System.out.println("Chicken: cock-a-doodle");
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry-it";
    }
}
