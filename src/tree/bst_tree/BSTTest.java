package tree.bst_tree;

import java.util.Iterator;

/**
 * Created by smallcatcat on 2019/1/14.
 */
public class BSTTest {
    public static void start() {
        System.out.println("start BST Tree");

        BST bstTree = new BST();

        // 构造二叉查找树
        bstTree.put("s", 9);
        bstTree.put("x", 2);
        bstTree.put("e", 8);
        bstTree.put("a", 8);
        bstTree.put("r", 8);
        bstTree.put("c", 999);
        bstTree.put("h", 8);
//        bstTree.put("m", 8);
//        bstTree.put("z", 555);

//        System.out.println(bstTree.size());
//        System.out.println(bstTree.get("h"));
//        System.out.println(bstTree.min());
//        System.out.println(bstTree.max());
//        System.out.println(bstTree.ceiling("g"));
//        System.out.println(bstTree.rank("a"));
//        bstTree.deleteMin();
//        bstTree.deleteMax();

//        删除节点测试
//        System.out.println(bstTree.rank("x"));
//        System.out.println(bstTree.rank("z"));
//        bstTree.delete("x");
//        System.out.println(bstTree.rank("z"));
//        System.out.println(bstTree.get("z"));

//        中序遍历
//        bstTree.postOtherPrint();

        // 测试keys方法以及Queue类
//        Queue queue = (Queue) bstTree.keys("c", "s");
//
//        queue.print();
//        for (Object s : queue) {
//            System.out.print(s);
//        }

//        广度优先遍历
//        bstTree.bfsPrint();

        // 深度优先遍历
        bstTree.dfsPrint();
    }
}
