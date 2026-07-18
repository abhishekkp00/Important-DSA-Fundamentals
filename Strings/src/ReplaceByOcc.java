import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReplaceByOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st  = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for(char ch: st.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < st.length(); i++){
            if(map.get(st.charAt(i)) <= 1){
                sb.append(st.charAt(i));
            }else{
                sb.append(map.get(st.charAt(i)));
            }
        }
        System.out.println(sb.toString());
    }
}
