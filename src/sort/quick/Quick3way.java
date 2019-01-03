package sort.quick;

import sort.SortAssit;

/**
 * Created by smallcatcat on 2019/1/3.
 */
public class Quick3way {
    public static void sort(Comparable[] a, int low, int high) {
        // 结束递归
        if (low >= high) return;

        // i：遍历指针
        // leftPoint：替换元素的左指针；
        // rightPoint：替换元素的右指针
        int i = low + 1, leftPoint = low, rightPoint = high;
        // 当前对比元素
        Comparable v = a[low];

        while (i <= rightPoint) {
            int comp = a[i].compareTo(v);

            if (comp < 0) {
                // 当前i对应元素与左指针替换后，遍历指针i前进，左指针也前进
                SortAssit.exch(a, leftPoint++, i++);
            } else if (comp > 0) {
                // 当前i对应元素与右指针替换后，右指针减一，遍历指针i不需要改变，继续与替换来的元素做对比
                SortAssit.exch(a, i, rightPoint--);
            } else {
                // 相等则将遍历指针加一
                i++;
            }
        }

        sort(a, low, leftPoint - 1);
        sort(a, rightPoint + 1, high);
    }

    public static void sort(Comparable[] a) {
        int high = a.length - 1;

        sort(a, 0, high);
    }
}
