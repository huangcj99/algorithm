package sort.merge;

import sort.Random;
import sort.SortAssit;

/**
 * Created by smallcatcat on 2019/1/14.
 */
public class MergeBUTest {
    public static void start() {
        System.out.println("start mergeBU test");

        // 生成随机数组
        Integer[] randomArray = Random.create(10);

        // 归并排序（自底向上）
        System.out.println();
        System.out.println("归并算法（自底向上）执行");

        System.out.print("排序前：");
        SortAssit.show(randomArray);

        MergeBU.sort(randomArray);

        System.out.println("是否已排序：" + SortAssit.isSorted(randomArray));

        System.out.print("排序后：");
        SortAssit.show(randomArray);
    }
}
