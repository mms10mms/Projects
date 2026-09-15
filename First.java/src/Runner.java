//Michael Slaughter

public class Runner {
    public static void main(String[] args) {

        Pet defaultPet = new Pet();
        System.out.println(defaultPet);


        Pet dog = new Pet("Buster", "dog", 3);
        System.out.println(dog);


        Pet cat = new Pet("Whiskers", "cat", 5);
        System.out.println(cat);

        Pet fish = new Pet("Goldie", "fish", 1);
        System.out.println(fish);
    }
}
