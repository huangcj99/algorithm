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
        // 先拆分成小数组
        sort(a, low, mid);
        sort(a, mid + 1, high);
        // 拆分完小数组后，从小数组开始进行merge操作，return后合并，再进行上层的merge操作
        merge(a, low, mid, high);
    }
}
