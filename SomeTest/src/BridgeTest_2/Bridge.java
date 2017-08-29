package BridgeTest_2;

/**
 * Created by miqi on 2017/8/29.
 */
public abstract class Bridge {
    ISourceable source;

    public abstract void method();
    public void setSource(ISourceable source) {
        this.source = source;
    }
}
