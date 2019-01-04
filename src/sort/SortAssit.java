package sort;

/**
 * Created by smallcatcat on 2018/10/17.
 */
public class SortAssit {
//    判断v元素是否比w小
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

//    交换
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

//    打印数组元素
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

//    判断数组是否排序成功
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }

        return true;
    }
}
