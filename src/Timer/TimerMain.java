package Timer;

import java.lang.reflect.Field;

/**
 * @param
 * @Author: dongnengyu
 * @Description:
 * @Date: 2018/4/15
 */
public class TimerMain {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InterruptedException {

        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        System.out.println("当前总共设置了" + Timer.timerId + "个定时器");
        timer1.setTimer(5, "boom");
//timer2.setTimer(2,"哑弹");

//        timer1.startTimer();
//        timer1.startTimer();
//        timer2.startTimer();
//        timer1.startTimer();
//        timer1.startTimer();

        Field field = timer1.getClass().getDeclaredField("expiryAction");
        field.setAccessible(true);
        System.out.println(field.get(timer1));

    }


}
