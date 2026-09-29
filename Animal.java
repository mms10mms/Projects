
//Michael Slaughter
//Midterm Project / Exam 1

// this assignment felt a little easier than some of the others ones, well at least to me lol





public class Animal {
    //store aniumal type
    private String species;


    public Animal() {
        this.species = "";
    }

    //sets the new species
    public Animal(String newSpecies) {
        this.species = newSpecies;
    }

    //updates the species
    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    //retrieves the current species
    public String getSpecies() {
        return this.species;
    }


    @Override
    public String toString() {
        return this.species;
    }
}
