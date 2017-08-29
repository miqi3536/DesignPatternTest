
/**
 * Created by miqi on 2017/8/29.
 */
public abstract class Bridge {
    private ISourceable source;

    public ISourceable get(){
        return source;
    }

    public void set(ISourceable source){
        this.source = source;
    }

    public void method(){
        source.method1();
    }
}
