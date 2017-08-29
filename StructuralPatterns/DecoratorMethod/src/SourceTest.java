/**
 * Created by miqi on 2017/8/29.
 */
public class SourceTest {
    public static void main(String[] args){
        Source source = new Source();
        Decorator decorator = new Decorator(source);

        decorator.method();
    }
}
