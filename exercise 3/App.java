public class App {

    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("My cat eyes are so pretty " + myPet.eyeColor + " color.");
        System.out.println("My cat is " + myPet.height + " tall and weighs " + myPet.weight + ".");
        System.out.println("My cat traits are " + myPet.characteristics + ".");

    }
}
