import com.xuxuan.factory.SenderFactory;
import com.xuxuan.factory.sender;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    private SenderFactory senderFactory;

    public static void main(String[] args) {

        SenderFactory factory = new SenderFactory();
        sender sender = factory.produce("sms");
        sender.send();



    }




}
