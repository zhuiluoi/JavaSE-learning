import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    public Queue<Integer> queue1;
    public Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if (empty()) {
            queue1.offer(x);
        } else if (queue1.isEmpty()) {
            queue2.offer(x);
        } else {
            queue1.offer(x);
        }
    }
    
    public int pop() {
        if (empty()) {
            return -1;
        }
        if (!queue1.isEmpty()) {
            int size = queue1.size();
            for (int i = 0; i < size-1; i++) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        } else {
            int size = queue2.size();
            for (int i = 0; i < size-1; i++) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
    }
    
    public int top() {
        if (empty()) {
            return -1;
        }
        int ret = -1;
        if (!queue1.isEmpty()) {
            int size = queue1.size();
            for (int i = 0; i < size; i++) {
                ret = queue1.poll();
                queue2.offer(ret);
            }
        } else {
            int size = queue2.size();
            for (int i = 0; i < size; i++) {
                ret = queue2.poll();
                queue1.offer(ret);
            }
        } return ret;
    }
    
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}