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

//
//        int[] pref = prefixsum(arr);
//
//        System.out.print("Enter How Many Queries: ");
//        int q = input.nextInt();
//
//        while (q-- > 0) {
//            System.out.println("Enter Range (l r): ");
//            int l = input.nextInt(); // left index
//            int r = input.nextInt(); // right index
//
//            int ans;
//            if (l == 0) {
//                ans = pref[r];
//            } else {
//                ans = pref[r] - pref[l - 1];
//            }
//            System.out.println("Sum Is " + ans);
//        }
//    }
//
//    static int[] prefixsum(int[] arr) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            arr[i] = arr[i] + arr[i - 1];
//        }
//        return arr;
//    }
//}
