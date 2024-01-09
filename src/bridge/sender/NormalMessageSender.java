package bridge.sender;

public class NormalMessageSender extends AbstractMessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("This is a normal message:" + message);
    }
}
