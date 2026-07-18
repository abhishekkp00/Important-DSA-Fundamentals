import java.sql.SQLOutput;
import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String here : ");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != ' '){
                sb.append(word.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
