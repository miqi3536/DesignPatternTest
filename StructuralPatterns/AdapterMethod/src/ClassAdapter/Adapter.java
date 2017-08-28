package ClassAdapter;

/**
 * Created by miqi on 2017/8/28.
 */
public class Adapter extends Source implements ITargetable {
    public void method2() {
        System.out.println("This is the target method!");
    }
}
