import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

//       Using LinkedHashSet

//        Set<Character> set = new LinkedHashSet<>();
//
//        for(int i = 0; i < word.length(); i++) {
//            if (!set.contains(word.charAt(i))){
//                set.add(word.charAt(i));
//            }
//        }
//        for(char ch: set) {
//            System.out.print(ch);
//        }

        //Using boolean Array
        boolean[] boolArr = new boolean[256];

        for(int i = 0; i < word.length(); i++){
            if(!boolArr[word.charAt(i)]){
                System.out.print(word.charAt(i));
                boolArr[word.charAt(i)] = true;
            }
        }
    }
}
