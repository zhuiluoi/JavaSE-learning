public class SingleLinkedList {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    };

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            return;
        }
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    };

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        try {
            checkIndex(index);
        } catch (IndexNotLegalException e) {
            e.printStackTrace();
            return false;
        }

        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size()) {
            addLast(data);
            return true;
        }

        ListNode cur = findIndexSubOne(index);
        ListNode node = new ListNode(data);

        node.next = cur.next;
        cur.next = node;
        return true;
    };

    private ListNode findIndexSubOne(int index) {
        int count = 0;
        ListNode cur = head;
        while (count != index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    private void checkIndex(int index) throws IndexNotLegalException{
        if (index < 0 || index > size()) {
            throw new IndexNotLegalException("Index不合法！");
        }
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    };

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = findNodeSubOne(key);
        if (cur == null) {
            System.out.println("没找到！");
        } else {
            cur.next = cur.next.next;
        }
    };

    private ListNode findNodeSubOne(int key) {
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (head == null) {
            return;
        }

        ListNode prev = head;
        ListNode cur = prev.next;

        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }

        if (head.val == key) {
            head = head.next;
        }
    };

    //得到单链表的长度
    public int size() {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    };

    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    };

    public void clear() {
        ListNode cur = head;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }
        head = null;
    };
}
