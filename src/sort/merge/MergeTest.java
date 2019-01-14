package sort.merge;

import sort.Random;
import sort.SortAssit;

/**
 * Created by smallcatcat on 2019/1/14.
 */
public class MergeTest {
    public static void start() {
        System.out.println("start merge test");

        // 生成随机数组
        Integer[] randomArray = Random.create(10);

        // 归并排序（自顶向下）
        System.out.println();
        System.out.println("归并算法（自顶向下）执行");

        System.out.print("排序前：");
        SortAssit.show(randomArray);

        Merge.sort(randomArray);

        System.out.println("是否已排序：" + SortAssit.isSorted(randomArray));

        System.out.print("排序后：");
        SortAssit.show(randomArray);
    }
}

