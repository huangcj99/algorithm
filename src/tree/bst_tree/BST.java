package tree.bst_tree;

/**
 * Created by smallcatcat on 2019/1/14.
 */
public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    // 节点类
    private class Node {
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int N;  // 该节点为根的子树的节点总数

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    // 返回二叉查找树的大小
    public int size() {
        return size(root);
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        }

        return root.N;
    }

    // 插入节点
    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    private Node put(Node node, Key key, Value val) {
        // 查找不到就创建一个子节点，并返回到上层设置父节点的左节点
        if (node == null) {
            return new Node(key, val, 1);
        }

        int cmp = key.compareTo(node.key);

        if (cmp < 0) {
            // 递归并返回该节点的左节点
            node.left = put(node.left, key, val);
        } else if (cmp > 0) {
            // 递归并返回该节点的右节点
            node.right = put(node.right, key, val);
        } else {
            node.val = val;
        }

        // 更新该节点为根节点的子树节点数量
        node.N = size(node.left) + size(node.right) + 1;

        return node;
    }

    // 获取节点的值
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);

        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node.val;
        }
    }

    public Key min() {
        return min(root).key;
    }

    private Node min(Node node) {
        if (node.left == null) {
            return node;
        } else {
            return min(node.left);
        }
    }

    public Key max() {
        return max(root).key;
    }

    private Node max(Node node) {
        if (node.right == null) {
            return node;
        } else {
            return max(node.right);
        }
    }

    // 向下取整
    public Key floor(Key key) {
        Node node = floor(root, key);

        if (node == null) {
            return null;
        }

        return node.key;
    }

    private Node floor(Node node, Key key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);

        if (cmp < 0) {
            return floor(node.left, key);
        } else if (cmp > 0) {
            Node leftNode = floor(node.right, key);

            // 找到一个比key小的值，那就返回这个点，否则则返回当前节点
            if (leftNode != null) {
                return leftNode;
            } else {
                return node;
            }
        } else {
            return node;
        }
    }

    // 向上取整
    public Key ceiling(Key key) {
        Node node = ceiling(root, key);

        if (node == null) {
            return null;
        }

        return node.key;
    }

    private Node ceiling(Node node, Key key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);

        if (cmp > 0) {
            return ceiling(node.right, key);
        } else if (cmp < 0) {
            Node rightNode = ceiling(node.left, key);

            // 找到一个比key大的值，那就返回这个点，否则则返回当前节点
            if (rightNode != null) {
                return rightNode;
            } else {
                return node;
            }
        } else {
            return node;
        }
    }
}
