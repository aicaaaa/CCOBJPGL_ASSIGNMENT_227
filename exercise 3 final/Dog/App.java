public class App {
    public static void main(String[] args) throws Exception {

        Gorgi myPet = new Gorgi();
       
        myPet.bark();
        System.out.println("My dog eyes are a stunning " + myPet.eyeColor +" color.");
        System.out.println("My dog weighs " + myPet.weight +".");
        System.out.println("My dog traits are " + myPet.characteristic +".");

    }
}
