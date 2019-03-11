package javaex.baofood.com.java8ex.mode;

/**
 * Created by Administrator on 2019/3/6.
 */

public class AStyleBehavior implements ICarBehavior {
    @Override
    public void brake() {
        //A style的刹车
        System.out.print("A style brake");
    }
}
