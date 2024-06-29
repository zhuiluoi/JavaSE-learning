class MyCircularQueue {
    public int[] elem;
    public int first;
    public int last;

    public MyCircularQueue(int k) {
        elem = new int[k+1];
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        elem[last] = value;
        last = (last+1) % elem.length;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        first = (first+1) % elem.length;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return elem[first];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        if (last == 0) {
            return elem[elem.length-1];
        } else {
            return elem[last-1];
        }
    }
    
    public boolean isEmpty() {
        return first == last;
    }
    
    public boolean isFull() {
        return (last+1) % elem.length == first;
    }
}