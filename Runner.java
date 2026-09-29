//Michael Slaughter

public class Runner {
    public static void main(String[] args) {
        // Instantiate Animal object using default Constructor
        Animal a1 = new Animal();
        a1.setSpecies("Dog");
        System.out.println(a1.toString());

        // Instantiate Animal object using custom Constructor
        Animal a2 = new Animal("Cat");
        System.out.println(a2.toString());
    }
}
