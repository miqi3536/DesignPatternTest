/**
 * Created by miqi on 2017/8/29.
 */
public class Decorator implements ISourceable{
    private Source source = null;

    public Decorator(Source source){
        super();
        this.source = source;
    }

    public void method() {
        System.out.println("before method!");
        source.method();
        System.out.println("after method!");
    }
}
