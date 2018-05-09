package Timer;

import static java.lang.Thread.sleep;

/**
 * @param
 * @Author: dongnengyu
 * @Description:
 * @Date: 2018/4/15
 */
public class Timer {
    private long interval;
    private String expiryAction;
    private int id;
    public static int timerId = 0;

    public Timer() {
        timerId++;
        this.id = timerId;
    }

    //设置定时器
    public int setTimer(long interval, String expiryAction) {
        this.interval = interval*1000;
        this.expiryAction = expiryAction;
        return id;
    }

    //开始定时器
    public void startTimer() throws InterruptedException {
        if (this.interval > 0){
            sleep(this.interval);
            System.out.println("第"+this.id +"个定时器"+ this.expiryAction);
        }
        else {
            System.out.println("第"+this.id +"个定时器没有设置");
        }
    }


    public int getId() {
        return id;
    }


}
