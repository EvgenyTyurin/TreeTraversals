/**
 * Tree traversals: preorder, inorder, postorder
 */

public class TreeTraversal {

    // Run point
    public static void main(String[] args) {
        // Tree init
        //           1
        //       2       3
        //     4   5
        TreeNode<String> node1 = new TreeNode<>("1");
        TreeNode<String> node2 = new TreeNode<>("2");
        TreeNode<String> node3 = new TreeNode<>("3");
        TreeNode<String> node4 = new TreeNode<>("4");
        TreeNode<String> node5 = new TreeNode<>("5");
        node1.setLeftNode(node2);
        node1.setRightNode(node3);
        node2.setLeftNode(node4);
        node2.setRightNode(node5);
        // Some traversals
        System.out.print("Preorder traversal: ");
        preorderTraversal(node1); // 1 2 4 5 3
        System.out.print("Inorder traversal: ");
        inorderTraversal(node1); // 4 2 5 1 3
        System.out.print("Postorder traversal: ");
        postorderTraversal(node1); // 4 5 2 3 1
    }

    // Preorder traversal: head, left, right
    // Прямой обход
    static void preorderTraversal(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node + " ");
        preorderTraversal(node.getLeftNode());
        preorderTraversal(node.getRightNode());
    }

    // Inorder traversal: left, head, right
    // Центрированый обход
    static void inorderTraversal(TreeNode node) {
        if (node == null)
            return;
        inorderTraversal(node.getLeftNode());
        System.out.print(node + " ");
        inorderTraversal(node.getRightNode());
    }

    // Postorder traversal: left, right, head
    // Обратный обход
    static void postorderTraversal(TreeNode node) {
        if (node == null)
            return;
        postorderTraversal(node.getLeftNode());
        postorderTraversal(node.getRightNode());
        System.out.print(node + " ");
    }

}
