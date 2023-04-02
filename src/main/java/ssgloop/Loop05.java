package ssgloop;

public class Loop05 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 8, 10};
        System.out.println(countOfElements(arr, arr.length,9));

    }

    static int countOfElements(int arr[], int n, int x) {
        int count = 0;
        for (int i = 0; i <n; i++) {
            if (arr[i] <= x) {
                count++;
            }

        }
        return count;
    }
}



