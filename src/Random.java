import java.util.ArrayList;
import java.util.List;

/**
 * Created by smallcatcat on 2018/10/16.
 */
public class Random {
    private static int max = 100;

    // 创建随机整数数组
    public static Integer[] create(int len) {
        Integer[] arr = new Integer[len];

        for (int i = 0; i < len; i++) {
            Integer random = (int)(Math.random() * max);

            arr[i] = random;
        }

        return arr;
    }

}
