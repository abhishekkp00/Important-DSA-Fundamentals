import java.util.Scanner;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your wors with the special characters: ");
        String word = sc.nextLine();

        String removed = word.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Word aftere removal is: " + removed);
    }
}
