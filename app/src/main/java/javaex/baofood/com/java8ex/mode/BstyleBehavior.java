package javaex.baofood.com.java8ex.mode;

/**
 * Created by Administrator on 2019/3/6.
 */

public class BstyleBehavior implements ICarBehavior {
    @Override
    public void brake() {
        //B style的刹车
        System.out.print("B style brake");
    }
}
