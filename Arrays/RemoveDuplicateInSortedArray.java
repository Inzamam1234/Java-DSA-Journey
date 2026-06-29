package Arrays;

import java.util.*;

public class RemoveDuplicateInSortedArray {

    public ArrayList<Integer> removeDuplicates(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (arr.length == 0) {
            return ans;
        }

        int rd = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[rd]) {
                rd++;
                arr[rd] = arr[i];
            }
        }

        for (int i = 0; i <= rd; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        RemoveDuplicateInSortedArray obj = new RemoveDuplicateInSortedArray();

        ArrayList<Integer> result = obj.removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        System.out.println(result);

        sc.close();

    }
}
