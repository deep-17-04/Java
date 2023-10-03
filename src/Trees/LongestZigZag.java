package Trees;

public class LongestZigZag {
    int max = 0;

    public int longestZigZag(Node root) {
        if (root.left != null) traverse(root.left, true, 1);
        if (root.right != null) traverse(root.right, false, 1);
        return max;
    }

    public void traverse(Node root, boolean left, int count) {
        if (max < count) {
            max = count;
        }
        if (root.left != null) {
            traverse(root.left, true, !left ? count + 1 : 1);
        }
        if (root.right != null) {
            traverse(root.right, false, left ? count + 1 : 1);
        }
    }

    public static void main(String[] args) {

    }
}

