package demo4;
import  java.util.Arrays;

public class MyArraylist {
    public int[] elem;
    public int usedSize;//0
    //默认容量
    private static final int DEFAULT_SIZE = 10;

    public MyArraylist() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表:
     *   根据usedSize判断即可
     */
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if (isFull()){
            this.elem = Arrays.copyOf(this.elem, this.elem.length*2);
        }
        this.elem[usedSize] = data;
        this.usedSize++;
    }

    /**
     * 判断当前的顺序表是不是满的！
     * @return true:满   false代表空
     */
    public boolean isFull() {
        return this.usedSize >= this.elem.length;
    }


    private void checkPosInAdd(int pos) throws PosNotLegalException{
        if (pos < 0 || pos > this.usedSize) {
            throw new PosNotLegalException("pos位置不合法！");

        }
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        try {
            checkPosInAdd(pos);
        } catch (PosNotLegalException e){
            e.printStackTrace();
        }
        if (isFull()){
            this.elem = Arrays.copyOf(this.elem, this.elem.length*2);
        }
        for (int i = this.usedSize-1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;

    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private void checkPosInGetAndSet(int pos) throws PosNotLegalException{
        if (pos < 0 || pos >= this.usedSize) {
            throw new PosNotLegalException("GetAndSet的pos位置不合法！");

        }
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        try {
            checkPosInGetAndSet(pos);
        } catch (PosNotLegalException e){
            e.printStackTrace();
        }
        return this.elem[pos];
    }

    private boolean isEmpty() {
        if (this.usedSize == 0) {
            return true;
        }
        return false;
    }
    // 给 pos 位置的元素设为【更新为】 value
    public void set(int pos, int value) {
        try {
            checkPosInGetAndSet(pos);
        } catch (PosNotLegalException e){
            e.printStackTrace();
        }
        this.elem[pos] = value;
    }

    /**
     * 删除第一次出现的关键字key
     * @param key
     */
    public void remove(int key) {
        int pos = indexOf(key);
        if (pos == -1) {
            return;
        }
        for (int i = pos; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
}
