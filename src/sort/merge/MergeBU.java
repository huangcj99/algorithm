package sort.merge;

/**
 * 自底向上归并排序
 *
 * Created by smallcatcat on 2018/10/18.
 */
public class MergeBU extends MergeBase {

    public static void sort(Comparable[] a) {
        int len = a.length;

        aux = new Comparable[len];

        // 子数组从大小为1，扩增size进行排序
        for (int size = 1; size < len; size += size) {
            // 分配好size之后，按照size进行归并排序
            for (int low = 0; low < len - size; low = low + size * 2) {
                int mid = low + size - 1;
                int high = low + size * 2 - 1;

                merge(a, low, mid, Math.min(high, len -1));
            }
        }
    }
}
