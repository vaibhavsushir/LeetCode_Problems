import java.util.ArrayList;
class Methods_ArrayList {
    public static void main(String[] args) {
        }
        System.out.println(l1);
        System.out.println("Removing an element e");
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
        System.out.println("Checking If An Element Exist");
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        System.out.println("if you dont specify,you can put anything inside it");
        ArrayList l = new ArrayList();
        l.add(98);
        l.add("PQRS");
        l.add(12);
        System.out.println(l);
    }
}
