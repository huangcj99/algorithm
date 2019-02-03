package sort.priority_queue;

/**
 * Created by smallcatcat on 2019/1/30.
 * 优先队列
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    // 创建一个初始容量为max的优先队列
    public MaxPQ(int max) {
        pq = (Key[]) new Comparable[max + 1];
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private void swin(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k) {
        // 当前节点的含有子节点则进行下沉判断
        while (2 * k < N) {
            int j = 2 * k;

            if (j < N && less(j, j + 1)) j++;
            if (less(j, k)) break;
            exch(j, k);
            k = j;
        }
    }

    public void insert(Key v) {
        pq[++N] = v;
        swin(N);
    }

    public Key delMax() {
        Key max = pq[1];

        // 根节点和最后一个元素交换后，N减一，下沉后，在下面将刚替换的元素位置引用设置成null
        exch(1, N--);
        sink(1);
        pq[N + 1] = null;

        return max;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }
}
