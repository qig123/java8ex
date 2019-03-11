package javaex.baofood.com.java8ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import io.reactivex.Observable;
import javaex.baofood.com.java8ex.gen.DynamicArray;
import javaex.baofood.com.java8ex.gen.NumberPair;
import javaex.baofood.com.java8ex.gen.Pair;
import javaex.baofood.com.java8ex.mode.AStyleBehavior;
import javaex.baofood.com.java8ex.mode.Car;
import javaex.baofood.com.java8ex.mode.ICarBehavior;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pair<Integer,Integer> integerPair = new Pair<>(1, 2);
        Integer first = integerPair.getFirst();
        Pair<String,String> stringPair = new Pair<>("2", "3");
        String first1 = stringPair.getFirst();

        //
        DynamicArray<Integer> integerDynamicArray = new DynamicArray<>();
        integerDynamicArray.add(100);
        integerDynamicArray.add(34);

        DynamicArray<Number> numberDynamicArray = new DynamicArray<>();
        integerDynamicArray.copyTo(numberDynamicArray);


    }

    public  <T extends Comparable<T>>  T max(T[] arr){
        T max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].compareTo(max)>0){
                max=arr[i];
            }
        }
        return  max;
    }





}
