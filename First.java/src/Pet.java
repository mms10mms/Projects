//Michael Slaughter

public class Pet {
    private String name;
    private String type;
    private int age;

    public Pet() {
        this.setName("Pet Name");
        this.setType("Unknown");
        this.setAge(0);
    }

    public Pet(String name, String type, int age) {
        this.setName(name);
        this.setType(type);
        this.setAge(age);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public String getType() {
        return this.type;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public String speak() {
        if (this.type.equalsIgnoreCase("dog")) {
            return "woof";
        } else if (this.type.equalsIgnoreCase("cat")) {
            return "mreow";
        } else {
            return "default noise";
        }
    }

    public String toString() {
        String result = "";
        result += "Pet Information:\n";
        result += "Name: " + this.name + "\n";
        result += "Type: " + this.type + "\n";
        result += "Age: " + this.age + "\n";
        result += "Sound: " + this.speak() + "\n";
        return result;
    }
}

