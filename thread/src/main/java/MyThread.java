/**
 * @author zhuYuHao
 * @time 2024/7/27
 *
 * 有两个用户从账户取钱，每次取100(月=余额有1000)，余额不足就不能取款了
 */
public class MyThread {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        thread1.start();
        thread2.start();

    }
}

class T implements Runnable{

    private int balance = 1000;
    @Override
    public void run() {
        while (true) {
            synchronized (this){
            if (balance <= 0) {
                System.out.println("余额不足");
                break;
            } else {
                balance -= 100;
                System.out.println("取出了100，当前余额为：" + balance);
            }
        }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}