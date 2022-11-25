package GFG;

public class PrintDuplicateInString {

    public static void countDuplicate(String str) {
        // int[] c = new int[256];
        boolean[] v = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && v[j] == false) {
                    count++;
                    v[i] = true;
                    v[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i) + ", = " + count);
            }
        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        countDuplicate(str);
    }
}
