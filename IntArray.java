//Michael Slaughter


import java.util.Arrays;

// IntArray wraps a plain int array and gives it some useful methods.
public class IntArray {
    private int length;      // number of elements in the array
    private int myArray[];   // the actual data

    // Creates an array with l elements (all start at 0).
    public IntArray(int l) {
        length = l;
        myArray = new int[l];
    }

    // Deletes all the elements, leaving an empty array.
    public void clear() {
        myArray = new int[0];
        length = 0;
    }

    // Fills every element with a random number from 1 to 6.
    public void fillRand() {
        for (int i = 0; i < length; i++) {
            myArray[i] = (int) (Math.random() * 6) + 1;
        }
    }

    // Returns the value stored at the given index.
    public int get(int element) {
        return myArray[element];
    }

    // Stores newValue at the given index.
    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    // Returns the number of elements.
    public int size() {
        return length;
    }

    // Returns true if the array has no elements.
    public boolean isEmpty() {
        return length == 0;
    }

    // Sorts the array from smallest to largest.
    public void sort() {
        Arrays.sort(myArray);
    }

    // Returns the elements as a String, like [3, 1, 6].
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < length; i++) {
            result += myArray[i];
            if (i < length - 1) {
                result += ", ";
            }
        }
        return result + "]";
    }
}
