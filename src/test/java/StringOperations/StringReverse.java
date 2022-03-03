package StringOperations;

public class StringReverse {
    public static void main(String[] args) {
       System.out.println("Reverse of the String is :");
        System.out.println(reverseString("Jitendra"));

    }
    public static String reverseString(String inp){
        String op = "";
        for(int i=inp.length()-1; i>=0; i--){
             op = op + inp.charAt(i);
        }
        return op;
         }
}

