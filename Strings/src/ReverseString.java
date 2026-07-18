import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalStr = sc.nextLine();

        StringBuilder sb = new StringBuilder(originalStr);

        sb.reverse();

        String rev = sb.toString();
        System.out.println(rev);

    }
}
