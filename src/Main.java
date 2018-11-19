import sort.SortAssit;
import sort.merge.Merge;
import sort.merge.MergeBU;

/**
 * Created by smallcatcat on 2018/10/16.
 */
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
    }
}
