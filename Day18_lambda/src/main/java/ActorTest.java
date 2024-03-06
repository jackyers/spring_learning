/**
 * @author GG_B
 * @version 1.0
 */
public class ActorTest {
    public static void main(String[] args) {
        //此处为匿名内部类，其使用方法类似于构造方法
        Actor actor = new Actor() {
            @Override
            public void performance() {
                System.out.println("演员开始表演节目");
            }
        };
        //注意这里的分号不要忘记
        actor.performance();

        Actor actor1 = () -> System.out.println("演员开始表演节目");

    }
}
