package Static;

/**
 * Created by miqi on 2017/8/28.
 */
public class FactoryTest {
    public static void main(String[] args){
        ISender mailSender = SenderFactory.sendMail();
        mailSender.send();

        ISender smsSender = SenderFactory.sendSms();
        smsSender.send();
    }
}
