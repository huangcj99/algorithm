package sort.quick;

import sort.Random;
import sort.SortAssit;

/**
 * Created by smallcatcat on 2019/1/14.
 */
public class Quick3WayTest {
    public static void start() {
        System.out.println("start quick3way test");

        // 生成随机数组
        Integer[] randomArray = Random.create(10);

        // 三向切分快速排序
        System.out.print("排序前：");
        SortAssit.show(randomArray);

        Quick3way.sort(randomArray);

        System.out.print("排序后：");
        SortAssit.show(randomArray);
    }
}
