package StringOperations;

public class StringSplitFunction {
    public static void main(String[] args) {
        String userName =  "My Name is Jitendra";
        String splitName[] = userName.split(" ");

        for(int i= splitName.length-1; i>=0; i--){
            System.out.print(splitName[i]);
            System.out.print("\t");
        }

    }
}
