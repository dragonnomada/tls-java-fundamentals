import java.util.ArrayList;
import java.util.Scanner;

public class CodigoS106 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many fruits do you want to enter? ");
        int n = scanner.nextInt();

        ArrayList<String> fruits = new ArrayList<>();

        while (fruits.size() < n) {
            System.out.print("Enter a fruit: ");
            String fruit = scanner.next();
            fruits.add(fruit);
        }

        String longestFruit = "";
        for (String fruit : fruits) {
            if (fruit.length() > longestFruit.length()) {
                longestFruit = fruit;
            }
        }

        System.out.println("The longest fruit is " + longestFruit);
    }

}
