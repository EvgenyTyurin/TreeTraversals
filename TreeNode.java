/**
 * Generic tree node class
 * @param <T>
 */

public class TreeNode<T> {
    private T data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode(T data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}