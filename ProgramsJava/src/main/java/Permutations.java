public class Permutations {
    public static void main(String[] args) {
        String str = "MARTY";  //given the string
        int n = str.length();  //finding the length of the string and storing in n var
        Permutations p = new Permutations();  //creating the object reference p
        p.permute(str, 0, n - 1);  //calling the permute method using object reference p

    }
        private void permute(String str, int fi , int li) {
            if (fi == li) { //condition if first index == last index
                System.out.println(str);  //print the str(MARTY)
            } else {
                for (int i = fi; i <= li; i++) {  //
                    str = swap(str, fi, i);
                    permute(str, fi + 1, li);
                    str = swap(str, fi, i);
                }
            }
        }
 public String swap(String a, int i, int j){
                char temp;
                char[] charArray = a.toCharArray();
                temp = charArray[i] ;
                charArray[i] = charArray[j];
                charArray[j] = temp;
                return String.valueOf(charArray);
            }
        }


