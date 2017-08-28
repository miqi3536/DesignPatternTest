package Static;

/**
 * Created by miqi on 2017/8/28.
 */
public class SenderFactory {
    public static ISender sendMail(){
        return new MailSender();
    }

    public static ISender sendSms(){
        return new SmsSender();
    }
}
