package CutomArraylist;
import java.util.*;


public class CustomArrayList{
    private int[] data; // org arraylist
    private int size = 0;
    private static int DEFAULT_SIZE = 10;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        
        //copy all the ele from the initial arr to this temp arr
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removeEle = data[--size];
        return removeEle;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int ele){
        data[index] = ele;
    }

    @Override
    public String toString(){
        return "CustormArrayList(" + "data" + Arrays.toString(data) + " size: " + size + ")";
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 13; i++) {
            list.add(2*i);
        }
        System.out.println(list);
    }
}