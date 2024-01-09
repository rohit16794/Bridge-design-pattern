package bridge.sender;

public class UrgentMessageSender extends AbstractMessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("This is the urgent message:" + message);
    }
}
