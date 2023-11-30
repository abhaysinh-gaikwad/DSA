package DSA;

public class Subsequance {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 15, 5 };
        int ans = countSubset(arr, 25, 0);
        System.out.println(ans);
        System.out.println("Abhay");
    }

    public static int countSubset(int arr[], int sum, int i) {
        if (sum == 0) {
            return 1;
        }
        if (sum < 0) {
            return 0;
        }
        if (i == arr.length) {
            return 0;
        }
        return countSubset(arr, sum - arr[i], i + 1) + countSubset(arr, sum, i + 1); // picking
    }
}
