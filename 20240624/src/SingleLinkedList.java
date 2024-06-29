public class SingleLinkedList {

    static class ListNode {
        public ListNode next;
        public int val;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;

    public void createList() {
        ListNode node1 = new ListNode(12);
        ListNode node2 = new ListNode(23);
        ListNode node3 = new ListNode(34);
        ListNode node4 = new ListNode(45);
        ListNode node5 = new ListNode(56);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        this.head = node1;
    }

    public void addFirst(int data){
        ListNode listNode = new ListNode(data);
        listNode.next = head;
        head = listNode;
    }

    //尾插法
    public void addLast(int data){
        ListNode listNode = new ListNode(data);
        ListNode cur = head;
        if (cur == null) {
            head = listNode;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = listNode;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode listNode = new ListNode(data);
        if (index < 0 || index > size()) {
            System.out.println("index位置不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = findIndexSubOne(index);
        listNode.next = cur.next;
        cur.next = listNode;


    }

    private ListNode findIndexSubOne(int index) {
        ListNode cur = head;
        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = head;
        if (cur.val == key) {
            head = cur.next;
            return;
        }
        while (cur.next != null) {
            if (cur.next.val == key) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (head == null) {
            return;
        }
        ListNode prev = head;
        ListNode cur = head.next;

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

    }
    //得到单链表的长度
    public int size(){
        int sz = 0;
        ListNode cur = head;
        while (cur != null) {
            sz++;
            cur = cur.next;
        }
        return sz;
    }
    public void clear() {
        ListNode cur = head;
        while (cur != null) {
            ListNode curN = cur.next;
            cur.next = null;
            cur = curN;
        }
        head = null;

    }
    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

