package Multi;

/**
 * Created by miqi on 2017/8/28.
 */
public class SenderFactory {
    public ISender SendMail(){
        return new MailSender();
    }

    public ISender SendSms(){
        return new SmsSender();
    }
}
