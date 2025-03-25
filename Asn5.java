import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // Create ArrayList for Strings
        ArrayList<String> stringList = new ArrayList<>();
        // Create ArrayList for Integers
        ArrayList<Integer> intList = new ArrayList<>();

        // Add 4 items to the String ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        
        // Add 4 items to the Integer ArrayList
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);

        // Display the String ArrayList using an enhanced for-loop
        System.out.println("String ArrayList (enhanced for-loop):");
        for (String fruit : stringList) {
            System.out.print(fruit + " ");
        }
        System.out.println();  // for line break

        // Display the Integer ArrayList using a basic for-loop
        System.out.println("Integer ArrayList (basic for-loop):");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();

        // ---- Additional Operations ----

        // On stringList:
        // Operation 1: Remove the element at index 1 ("Banana")
        String removedFruit = stringList.remove(1);
        // Operation 2: Add "Elderberry" at index 2
        stringList.add(2, "Elderberry");

        // On intList:
        // Operation 1: Replace the element at index 0 with 100 using set()
        intList.set(0, 100);
        // Operation 2: Remove the last element (40)
        int removedNumber = intList.remove(intList.size() - 1);

        // Display the updated String ArrayList using the forEach lambda method
        System.out.println("\nUpdated String ArrayList (using lambda):");
        stringList.forEach(s -> System.out.print(s + " "));
        System.out.println();

        // Display the updated Integer ArrayList using the forEach lambda method
        System.out.println("Updated Integer ArrayList (using lambda):");
        intList.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
