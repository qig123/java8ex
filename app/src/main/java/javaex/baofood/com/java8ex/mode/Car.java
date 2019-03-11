package javaex.baofood.com.java8ex.mode;

/**
 * Created by Administrator on 2019/3/6.
 * Car 持有 CarBehavior的引用
 */

public class Car  {
    protected  ICarBehavior carBehavior;

    public void setiCarBehavior(final ICarBehavior iCarBehavior){
        this.carBehavior=iCarBehavior;
    }

    public  void brake(){
        carBehavior.brake();
    }


}
