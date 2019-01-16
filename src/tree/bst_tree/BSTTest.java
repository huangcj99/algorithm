package tree.bst_tree;

/**
 * Created by smallcatcat on 2019/1/14.
 */
public class BSTTest {
    public static void start() {
        System.out.println("start BST Tree");

        BST bstTree = new BST();

        bstTree.put("s", 9);
        bstTree.put("x", 2);
        bstTree.put("e", 8);
        bstTree.put("a", 8);
        bstTree.put("r", 8);
        bstTree.put("c", 8);
        bstTree.put("h", 8);
        bstTree.put("m", 8);
//        System.out.println(bstTree.size());
//        System.out.println(bstTree.get("h"));
//        System.out.println(bstTree.min());
//        System.out.println(bstTree.max());
//        System.out.println(bstTree.ceiling("g"));
//        System.out.println(bstTree.rank("a"));
        bstTree.deleteMin();
        bstTree.deleteMax();
    }
}
