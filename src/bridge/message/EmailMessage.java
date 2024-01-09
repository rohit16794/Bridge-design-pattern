package bridge.message;

import bridge.sender.AbstractMessageSender;

public class EmailMessage extends AbstractMessage{
    public EmailMessage(AbstractMessageSender abstractMessageSender) {
        super(abstractMessageSender);
    }

    @Override
    public void sendMessage(String message) {
        abstractMessageSender.sendMessage(message);
    }
}
