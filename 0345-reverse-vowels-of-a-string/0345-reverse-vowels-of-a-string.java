import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        int len = s.length();
        int start = 0;
        int end = len - 1;
        
        for (int i = 0; start < end; i++) { 
            if (arr[start] == 'a' || arr[start] == 'e' || arr[start] == 'i' || arr[start] == 'o' || arr[start] == 'u' || arr[start] == 'A'
                    || arr[start] == 'E' || arr[start] == 'I' || arr[start] == 'O' || arr[start] == 'U') { 
                if (arr[end] == 'a' || arr[end] == 'e' || arr[end] == 'i' || arr[end] == 'o' || arr[end] == 'u' || arr[end] == 'A'
                        || arr[end] == 'E' || arr[end] == 'I' || arr[end] == 'O' || arr[end] == 'U') {
                    char temp = arr[start]; 
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                } else {
                    end--;
                }
            } else {
                start++; 
                continue;
            }
        }

        return new String(arr);
    }
}
