import java.util.HashMap;
import java.util.Map;

public class IsogramProgram {

        static boolean isIsogram (String data) {
            boolean isIsogram = true;
            char[] c = data.toCharArray();
            Map<Character, Integer> map = new HashMap();
            for(int i=0; i<c.length; i++){
                //if the map contains that character already, then get the
                //character value and add 1 to it and put it back again.
                if(map.get(c[i]) != null){
                    return false;
                }
                else{
                    map.put(c[i], 1);
                }
            }
            return isIsogram;
        }
    public static void main(String[] args) {
        System.out.println(isIsogram("machine"));
    }
}