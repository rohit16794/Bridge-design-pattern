package bridge.message;

import bridge.sender.AbstractMessageSender;

public abstract class AbstractMessage {
    protected AbstractMessageSender abstractMessageSender;

    public AbstractMessage(AbstractMessageSender abstractMessageSender) {
        this.abstractMessageSender = abstractMessageSender;
    }

    abstract void sendMessage(String message);
}
