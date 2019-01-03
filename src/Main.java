/**
 * Created by smallcatcat on 2018/10/16.
 */
import sort.SortAssit;
import sort.quick.Quick3way;

public class Main {
    public static void main(String[] args) {
        System.out.println("start...");

        // 生成随机数组
        Integer[] randomArray = Random.create(10);

        // 归并排序（自顶向下）
//        System.out.println();
//        System.out.println("归并算法（自顶向下）执行");
//
//        System.out.print("排序前：");
//        SortAssit.show(randomArray);
//
//        Merge.sort(randomArray);
//
//        System.out.println("是否已排序：" + SortAssit.isSorted(randomArray));
//
//        System.out.print("排序后：");
//        SortAssit.show(randomArray);

        // 归并排序（自底向上）
//        System.out.println();
//        System.out.println("归并算法（自底向上）执行");
//
//        System.out.print("排序前：");
//        SortAssit.show(randomArray);
//
//        MergeBU.sort(randomArray);
//
//        System.out.println("是否已排序：" + SortAssit.isSorted(randomArray));
//
//        System.out.print("排序后：");
//        SortAssit.show(randomArray);

        // 三向切分快速排序
        System.out.print("排序前：");
        SortAssit.show(randomArray);

        Quick3way.sort(randomArray);

        System.out.print("排序后：");
        SortAssit.show(randomArray);
    }
}
