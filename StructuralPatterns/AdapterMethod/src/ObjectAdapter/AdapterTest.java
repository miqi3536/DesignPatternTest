package ObjectAdapter;

/**
 * Created by miqi on 2017/8/28.
 */
public class AdapterTest {
    public static void main(String[] args){
        Source source = new Source();
        ITargetable target = new Wapper(source);
        target.method1();
        target.method2();
    }
}
