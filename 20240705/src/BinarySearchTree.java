import java.util.TreeMap;

public class BinarySearchTree {
    public static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    private Node root = null;

    public Node search(int key) {
        Node cur = root;
        while (cur != null) {
            if (cur.key == key) {
                return cur;
            } else if (cur.key < key) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        return null;
    }

    public boolean insert(int key) {
        if (root == null) {
            root = new Node(key);
            return true;
        }

        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.key == key) {
                return false;
            } else if (cur.key > key) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }

        Node node = new Node(key);
        if (parent.key > key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;
    }

    public boolean remove(int key) {
        Node parent = null;
        Node cur = root;
        while (cur != null){
            if (cur.key > key) {
                parent = cur;
                cur = cur.left;
            } else if (cur.key < key) {
                parent = cur;
                cur = cur.right;
            } else {
                break;
            }
        }
        if (cur == null) {
            return false;
        }
        removeNode(parent, cur);
        return true;
    }

    private void removeNode(Node parent, Node cur) {
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else if (cur == parent.left) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        } else {
            Node tmp = cur.right;
            Node prev = cur;
            while (tmp.left != null) {
                prev = tmp;
                tmp = tmp.left;
            }
            cur.key = tmp.key;
            if (tmp == prev.left) {
                prev.left = tmp.right;
            } else {
                prev.right = tmp.right;
            }
        }
    }

}
