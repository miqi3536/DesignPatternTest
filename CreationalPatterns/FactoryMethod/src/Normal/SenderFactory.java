package Normal;

/**
 * Created by miqi on 2017/8/28.
 */
public class SenderFactory {
    public ISender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的邮件类型!");
            return null;
        }
    }
}
