//Reverse the array

class Reverse
    public static String reverseWord(String str){
        // Reverse the string str
        
        int size = str.length();
        String rev = "";
        for(int i = size-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
