import java.util.*;

public class proj {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 2 };
        int[] b = { 1, 2, 3, 4, 5 };
        System.out.println(unical(a));
        System.out.println(unical(b));
    }

    static boolean unical(int[] q) {
        HashSet<Integer> qq = new HashSet<>();
        for (int i = 0; i < q.length; i++) {
            qq.add(q[i]);
        }
        return q.length != qq.size();
    }

}
