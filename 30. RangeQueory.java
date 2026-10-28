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
