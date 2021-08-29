package excecute;

import model.*;

public class Main {
    public static void main(String[] args) {
        Animal obj = new Tiger();
        Chicken obj1 = new  Chicken();
        Fruit obj2 = new Orange();
        obj1.sound();
        System.out.println(obj1.howToEat());
        System.out.println(obj2.howToEat());
    }
}
