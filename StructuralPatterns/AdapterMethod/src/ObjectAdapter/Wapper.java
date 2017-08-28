package ObjectAdapter;

import ClassAdapter.*;

/**
 * Created by miqi on 2017/8/28.
 */
public class Wapper implements ITargetable {
    private Source source;
    public Wapper(Source source){
        super();
        this.source = source;
    }
    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("This is the target method!");
    }
}
