package day02_modul02;

public class DuckTest {
    public static void main(String[] args) {
        int a = 5;
        int[] arr = new int[10];
        Duck donaldDuck = new Duck();
        Duck daisyDuck = new Duck();        //instance of Class Duck - создание класса
        donaldDuck.name = "Donald";
        donaldDuck.age = 25;
        donaldDuck.color = "yellow";
        donaldDuck.breed = "Disney";
        donaldDuck.fies();
        donaldDuck.displayInfo();
        //String magicTest=new String("magic");
        // System.out.println(magicTest);
        daisyDuck.name = "Daisy";
        daisyDuck.age = 24;
        daisyDuck.color = "pink";
        daisyDuck.breed = "Disney";

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        daisyDuck.displayInfo();
        duck1.displayInfo();
    }
}
