package Recursion;

public class SubsetSum {

    /**
     * This function prints the sum of all subsets in the given 'arr'
     * 
     * @param a   - It is the original array
     * @param n   - It is the length of the array
     * @param idx - It points to the current index
     * @param sum - It is the current sum
     */
    static void sumSubset(int[] a, int n, int idx, int sum) {

        // Base Case
        if (idx >= n) {
            System.out.print(sum + " ");
            return;
        }

        // Not Selectind arr[idx]
        sumSubset(a, n, idx + 1, sum);

        // Selecting arr[idx]
        sumSubset(a, n, idx + 1, sum + a[idx]);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        sumSubset(arr, 4, 0, 0);
    }
}
