// 2、无头双向链表实现
public class MyLinkedList {

    static class ListNode {
        public int val;
        public ListNode prev;//前驱
        public ListNode next;//后继

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode head;//标志头节点
    public ListNode last;//标志尾结点
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = last = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    };
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = last =node;
            return;
        }
        last.next = node;
        node.prev = last;
        last = node;


    };
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        try {
            checkIndex(index);
        }catch (IndexNotLegalException e) {
            e.printStackTrace();
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = findIndex(index);
        ListNode node = new ListNode(data);

        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    };

    private ListNode findIndex(int index) {
        ListNode cur = head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new IndexNotLegalException("双向链表插入index位置不合法: "+index);
        }
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    };
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    head = head.next;
                    if (head == null) {
                        last = null;
                    } else {
                        head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        last = last.prev;
                    } else {
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    };
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    head = head.next;
                    if (head == null) {
                        last = null;
                    } else {
                        head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        last = last.prev;
                    } else {
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    };
    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    };
    public void clear() {
        ListNode cur = head;
        while (cur != null) {
            ListNode curN = cur.next;
            //cur.val = null;
            cur.prev = null;
            cur.next = null;
            cur = curN;
        }
        head = last = null;
    };
}
