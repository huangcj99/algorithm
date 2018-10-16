package sort;

/**
 * Created by smallcatcat on 2018/10/16.
 */
public class Merge {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];

        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int low, int high) {
        // 退出递归
        if (high <= low) return;

        int mid = low + (high - low)/2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    private static void merge(Comparable[] a, int low, int mid, int high) {
        // 两边各取一个初始值比较
        int lowOneIdx = low;
        int highOneIdx = mid + 1;

        // 拷贝副本
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        // 排序两边的数组
        for (int k = low; k <= high; k++) {
            if (lowOneIdx > mid) {
                a[k] = aux[highOneIdx++];
            } else if (highOneIdx > high) {
                a[k] = aux[lowOneIdx++];
            } else if (less(aux[lowOneIdx], aux[highOneIdx])) {
                a[k] = aux[lowOneIdx++];
            } else {
                a[k] = aux[highOneIdx++];
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }

        return true;
    }
}
