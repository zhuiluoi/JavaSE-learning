import java.util.Arrays;

public class MyStack {

    public int[] elem;
    public int usedSize;

    public MyStack() {
        this.elem = new int[10];
    }

    public void push(int val) {
        if (isFull()) {
            elem = Arrays.copyOf(elem, 2*elem.length);
        }
        elem[usedSize] = val;
        usedSize++;
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    public int pop() {
        if( empty() ){
            throw new RuntimeException("栈为空，无法删除元素");
        }
        int oldVal = elem[usedSize-1];
        usedSize--;
        return oldVal;
    }

    public boolean empty() {
        return usedSize == 0;
    }

    public int peek() {
        if(empty()){
            throw new RuntimeException("栈为空，无法获取栈顶元素");
        }

        return elem[usedSize-1];
    }





}
