
//* program that demonstrates the implementation of popular functions in Vector 
//* and ArrayList, such as adding, removing, searching, sorting, and iterating over 
//* elements. 
import java.util.*;

public class p22_Vector_ArrayList {
    public static void main(String[] args) {

        // ? using Vector
        Vector<Integer> vector = new Vector<>();
        // adding elements to the vector
        vector.add(1);
        vector.add(40);
        vector.add(36);
        vector.add(4);
        vector.add(10);
        // removing an element from the vector
        vector.remove(0);
        System.out.println("Vector: " + vector);
        // sorting the vector
        Collections.sort(vector);
        System.out.println("Sorted Vector: " + vector);
        // searching for an element
        boolean contains = vector.contains(40);
        System.out.println("Vector contains 40: " + contains);
        // iterating over the vector
        System.out.println("Iterating over Vector:");
        for (Integer num : vector) {
            System.out.println("Element: " + num);
        }
        System.out.println();

        // ? using ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        // adding elements to the ArrayList
        arrayList.add(50);
        arrayList.add(40);
        arrayList.add(36);
        arrayList.add(4);
        arrayList.add(10);
        // removing an element from the ArrayList
        arrayList.remove(4);
        System.out.println("ArrayList: " + arrayList);
        // sorting the ArrayList
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);
        // searching for an element
        boolean containsArrayList = arrayList.contains(40);
        System.out.println("ArrayList contains 40: " + containsArrayList);
        // iterating over the ArrayList
        System.out.println("Iterating over ArrayList:");
        for (Integer num : arrayList) {
            System.out.println("Element: " + num);
        }
    }
}