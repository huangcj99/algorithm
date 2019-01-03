package sort.merge;

/**
 * 自顶向下归并排序
 *
 * Created by smallcatcat on 2018/10/16.
 */
public class Merge extends MergeBase {
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];

        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int low, int high) {
        // 退出递归
        if (high <= low) return;

        int mid = low + (high - low)/2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, low, mid, high);
    }
}
