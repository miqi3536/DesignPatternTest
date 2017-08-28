import java.util.List;

/**
 * Created by miqi on 2017/8/28.
 */
public class BuilderTest {
    public static void main(String[] args){
        Builder builder = new Builder();
        List mailList = builder.produceMailSender(50);
        List smsList = builder.produceSmsSender(30);

        System.out.println(mailList.toString());
        System.out.println(smsList.toString());
    }
}
