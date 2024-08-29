package CutomArraylist;
import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize(){
        Object[] temp = new Object[DEFAULT_SIZE * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public T remove(){
        T removeEle = (T)(data[--size]);
        return removeEle;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T num){
        data[index] = num;
    }
    @Override
    public String toString(){
        return "CustormArrayList(" + "data" + Arrays.toString(data) + " size: " + size + ")";
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList();
        for (int i = 0; i < 13; i++) {
            list.add(2*i);
        }
        System.out.println(list);
    }
    
}
