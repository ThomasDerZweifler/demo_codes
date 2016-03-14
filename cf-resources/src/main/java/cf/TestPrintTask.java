package cf;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by abhishekupadhyay on 2016/02/24.
 */
public class TestPrintTask implements Runnable{
    String name;

    public TestPrintTask()
    {
        //this.name = name;
    }
    public void setName(String name)
    {
        this.name  = name;
    }
    @Override
    public  void run()
    {
        System.out.println("name0 =" + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("name1 =" + name);

    }
}
