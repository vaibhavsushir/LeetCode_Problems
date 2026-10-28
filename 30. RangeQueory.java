import java.util.Scanner;
class RangeQueory {
    public static void main(String[] args) {
    }
    static int[] prefixsum(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}
