package indi.daniel.core.message;

/**
 * Created by daniel on 2017/2/25.
 */
public interface IMessage {

    final class MessageSeverity{
        static final int ERROR_LEVEL = 1;
        static final int WARN_LEVEL  = 2;
        static final int INFO_LEVEL  = 3;
        static final int DEBUG_LEVEL = 4;
    }

    String getMessageContent();
    void setMessageContent(String messageContent);

    int getSeverity();
    void setSeverity(int severity);
}
