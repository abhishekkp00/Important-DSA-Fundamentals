import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        char[] arr = st.toCharArray();

//        for(int i = 0; i < arr.length; i++){
//            for(int j = i + 1; j < arr.length; j++){
//                if(st.charAt(i) > st.charAt(j)){
//                    char temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(new String(arr));
//
//        Approach 2:
        Arrays.sort(arr);
        System.out.println(new String(arr));

    }
}
