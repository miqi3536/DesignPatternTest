/**
 * Created by miqi on 2017/8/29.
 */
public class Proxy implements ISourceable{
    private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }

    public void method1() {
        before();
        source.method1();
        after();
    }

    public void before(){
        System.out.println("before method!");
    }

    public void after(){
        System.out.println("after method!");
    }
}
