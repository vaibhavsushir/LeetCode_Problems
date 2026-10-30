class SortNegativeArray {
    public static void main(String[] args) {
    }
static void sortsquare(int[] arr) {
    int n = arr.length;
    int left = 0;
    int right = n - 1;
    int[] ans = new int[n];
    int k = n - 1;
    while (left <= right) {
        if (Math.abs(arr[left]) > Math.abs(arr[right])) {
            ans[k--] = arr[left] * arr[left];
            left++;
        } else {
            ans[k--] = arr[right] * arr[right];
            right--;
        }
    }

    // Copy back to original array
    for (int i = 0; i < n; i++) {
        arr[i] = ans[i];
    }
}
}

