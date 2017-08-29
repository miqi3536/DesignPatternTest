/**
 * Created by miqi on 2017/8/29.
 */
public class BridgeTest {
    public static void main(String[] args){
        Bridge bridge = new MyBridge();

        ISourceable sub1 = new SourceSub1();
        bridge.set(sub1);
        bridge.method();

        ISourceable sub2 = new SourceSub2();
        bridge.set(sub2);
        sub2.method1();
    }
}
