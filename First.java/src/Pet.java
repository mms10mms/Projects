
//Michael Slaughter

public class Pet {
    //Setting my Variable
    private String name;


    public Pet() {

        this.setName("Pet Name");
    }


    public void setName(String newName) {
        this.name = newName;
    }


    public String getName() {
        return this.name;
    }


    public String toString() {
        String result = "";
        result += "Pet information:\n";
        result += "Name: " + this.name;
        return result;
    }


    public static void main(String[] args) {

        Pet pet1 = new Pet();

        System.out.println(pet1.toString());


        System.out.println();


        Pet pet2 = new Pet();

        pet2.setName("Buster");

        System.out.println(pet2.toString());
    }
}


// I had a little trouble on this one but it still works! Any comments or feedback would be nice please.