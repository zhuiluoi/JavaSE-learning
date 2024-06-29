public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.TreeNode root =  binaryTree.createTree();
        binaryTree.preOrder(root);
        System.out.println();
        binaryTree.inOrder(root);
        System.out.println();
        binaryTree.postOrder(root);
        System.out.println();
        binaryTree.size(root);
        System.out.println(BinaryTree.nodeSize);
        System.out.println(binaryTree.size2(root));
        binaryTree.getLeafNodeCount1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println(binaryTree.getLeafNodeCount2(root));
        System.out.println(binaryTree.getKLevelNodeCount(root, 4));
        System.out.println(binaryTree.getHeight(root));
        BinaryTree.TreeNode a = binaryTree.find(root, 'H');
        //System.out.println(a.val);
        System.out.println(binaryTree.levelOrder(root).toString());
        System.out.println(binaryTree.isCompleteTree(root));
    }
}
