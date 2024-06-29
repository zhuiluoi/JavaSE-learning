import java.util.Scanner;

class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}


// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static int i = 0;
    public static TreeNode createTree(String str) {
        TreeNode root = null;
        
        if(str.charAt(i) != '#') {
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = createTree(str);
            root.right = createTree(str);
        } else {
            i++;
        }
        return root;
    }

    public static void inOrder(TreeNode root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            TreeNode root = createTree(str);
            inOrder(root);
        }
    }
}