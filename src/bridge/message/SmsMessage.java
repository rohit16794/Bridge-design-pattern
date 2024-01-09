package bridge.message;

import bridge.sender.AbstractMessageSender;

public class SmsMessage extends AbstractMessage {
    public SmsMessage(AbstractMessageSender abstractMessageSender) {
        super(abstractMessageSender);
    }

    @Override
    public void sendMessage(String message) {
        abstractMessageSender.sendMessage(message);
    }
}
