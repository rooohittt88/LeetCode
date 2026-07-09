//brute force approach according to me
import java.util.*;
class Mainn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word=in.next();
        char[] arr=new char[word.length()];
        for(int i=0;i<word.length();i++){
            arr[i]=word.charAt(i);
        }
        int len=word.length();
        int start=0;
        int end=len-1;
        // System.out.println(Arrays.toString(arr));


        for(int i=0;i<end;i++){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        
        
    }
}
