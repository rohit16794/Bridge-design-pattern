import bridge.message.EmailMessage;
import bridge.message.SmsMessage;
import bridge.sender.NormalMessageSender;
import bridge.sender.UrgentMessageSender;

public class Main {
    public static void main(String[] args) {
        /**
         * You are tasked with developing a text messaging application that supports different types of messages (e.g., normal, urgent) and can be extended to work on various platforms (e.g., SMS, Email). Implement the Bridge design pattern to separate the abstraction of messages from their implementation and allow easy extension for different message types and delivery platforms.
         *
         * Define an abstract Message class as the abstraction, and an abstract MessageSender class as the implementor. Provide concrete implementations for different message types (e.g., NormalMessage, UrgentMessage) and different message senders (e.g., SMSSender, EmailSender).
         *
         * Ensure that the client code can create and send messages of different types to different platforms without modifying the core logic of the messaging application.
         *
         * Feel free to use any programming language of your choice for the implementation.
         */

        EmailMessage emailMessage = new EmailMessage(new NormalMessageSender());
        emailMessage.sendMessage("Ssup!");

        SmsMessage smsMessage = new SmsMessage(new UrgentMessageSender());
        smsMessage.sendMessage("Sms wala Ssup");
    }
}