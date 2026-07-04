
import java.util.*;

public class Twosum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = input.nextInt();

        System.out.println("Enter size of array: ");
        int arrsize = input.nextInt();
        int[] arr = new int[arrsize];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arrsize; i++) {
            int arrelement = input.nextInt();
            arr[i] = arrelement;
        }

        boolean found=false;
        for (int i = 0; i < arrsize; i++) {
            for (int j = i + 1; j < arrsize; j++) {
                if ((arr[j] + arr[i]) == target) {
                    int[] indices={i,j};
                    System.out.println("target found at indices " + Arrays.toString(indices));
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        input.close();
    }
}
