package InterfaceAdapter;

/**
 * Created by miqi on 2017/8/29.
 */
public class SourceTest {
    public static void main(String[] args){
        SourceSub1 sub1 = new SourceSub1();
        SourceSub2 sub2 = new SourceSub2();

        sub1.method1();
        sub2.method2();
    }
}
