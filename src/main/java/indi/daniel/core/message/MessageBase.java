package indi.daniel.core.message;

/**
 * Created by daniel on 2017/2/25.
 */
public class MessageBase implements IMessage{

    private String messageContent;
    private int severity;

    public MessageBase(String messageContent, int severity) {
        this.messageContent = messageContent;
        this.severity = severity;
    }

    public String getMessageContent() {
        return this.messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;

    }

    public int getSeverity() {
        return this.severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;

    }
}
