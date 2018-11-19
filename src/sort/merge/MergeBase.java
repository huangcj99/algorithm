package sort.merge;

import sort.SortAssit;

/**
 * Created by smallcatcat on 2018/10/18.
 */
public class MergeBase {
    public static Comparable[] aux;

    public static void merge(Comparable[] a, int low, int mid, int high) {
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
            } else if (SortAssit.less(aux[lowOneIdx], aux[highOneIdx])) {
                a[k] = aux[lowOneIdx++];
            } else {
                a[k] = aux[highOneIdx++];
            }
        }
    }
}
