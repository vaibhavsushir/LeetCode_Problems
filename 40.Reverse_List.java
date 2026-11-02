import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Reverse_List {
    }
    public static void main(String[] args) {
        System.out.println("Original List "+list);
        Collections.reverse(list);
        System.out.println("Reverse List "+list);
        Collections.sort(list);
        System.out.println("Ascending Order "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending Order "+list);
    }

}
