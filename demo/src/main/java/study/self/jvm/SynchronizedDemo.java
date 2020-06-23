package study.self.jvm;

/**
 * @author Lgq create on 2020/6/23
 */
public class SynchronizedDemo {


    public void method() {
        synchronized (this) {
            System.out.println("synchronized 代码块");
        }
    }
}
