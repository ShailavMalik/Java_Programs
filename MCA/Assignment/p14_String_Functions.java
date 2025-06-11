//* program on  variety of String functions that help in manipulating and 
//* processing text efficiently

public class p14_String_Functions {

    public static void main(String[] args) {
        String s1 = "Shailav";
        String s2 = "Salim Bhai";
        // displaying the strings
        System.out.println("Original Strings:");
        System.out.println("String1 = " + s1);
        System.out.println("String2 = " + s2 + "\n");

        // ? use of length() function
        System.out.println("Length of String1 = " + s1.length() + " & length of String2 = " + s2.length() + "\n");
        // ? use of isEmpty() function
        System.out.println("Is String1 empty? " + s1.isEmpty());
        System.out.println("Is String2 empty? " + s2.isEmpty() + "\n");

        // ? use of equals() function & isEqualsIgnoreCase() function
        System.out.println("Are both strings equal? " + s1.equals(s2));
        System.out.println("Are both strings equal (ignoring case)? " + s1.equalsIgnoreCase(s2) + "\n");

        // ? use of replace() function
        System.out.println("String2 after replacing 'Salim' with 'Shailav': " + s2.replace("Salim", "Shailav")+ "\n");

        // ? use of split() function
        String[] words = s2.split(" "); // split() function splits the string into an array of words
        System.out.println("String2 after splitting: ");
        for (String word : words) {
            System.out.println(word);
        }
        // ? use of join() function
        System.out.println("String2 after joining: " + String.join("-", words)+ "\n");

        // ? use of toCharArray() function
        char[] charArray = s1.toCharArray(); // converts the string to a character array
        System.out.print("String1 after converting to char array: ");
        for (int i = 0; i < charArray.length; i++)
            System.out.print(charArray[i] + " ");
        System.out.println();
        // ? use of getBytes() function
        byte[] byteArray = s1.getBytes(); // converts the string to a byte array
        System.out.print("String1 after converting to byte array: ");
        for (int i = 0; i < byteArray.length; i++)
            System.out.print(byteArray[i] + " ");
    }

}
