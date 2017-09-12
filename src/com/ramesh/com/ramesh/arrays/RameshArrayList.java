package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 6/1/2017.
 */
public class RameshArrayList<K> {

    public static int LOAD_FACTOR=2;
    public int size;
    public static int INITIAL_CAPACITY=5;
    private transient Object[] rameshArrayListData;

    public RameshArrayList(int initialCapacity){
        if(initialCapacity<=0)
            throw new IllegalArgumentException("initial capacity: "+initialCapacity);
       this.rameshArrayListData= new Object[initialCapacity];

    }

    public  RameshArrayList(){
        this.rameshArrayListData= new Object[INITIAL_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean add(K k){
        ensureCapacity();
        this.rameshArrayListData[size++]=k;
        return true;
    }



    public void ensureCapacity(){

        if(size>INITIAL_CAPACITY/2){
            INITIAL_CAPACITY=INITIAL_CAPACITY*2;
            Object[] tempRameshArrayList= new Object[INITIAL_CAPACITY];

           System.arraycopy(rameshArrayListData,0,tempRameshArrayList,0,rameshArrayListData.length);
           this.rameshArrayListData=tempRameshArrayList;
        }

    }



}
