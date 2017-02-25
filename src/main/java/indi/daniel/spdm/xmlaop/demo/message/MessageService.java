package indi.daniel.spdm.xmlaop.demo.message;

import java.util.ArrayList;
import java.util.List;
import static indi.daniel.spdm.xmlaop.demo.message.IMessage.MessageSeverity;

/**
 * Created by daniel on 2017/2/25.
 */
public class MessageService implements IMessageService {
    private List<IMessage> messageList = new ArrayList<IMessage>();

    public void error(String messageContent) {
        this.add(messageContent, MessageSeverity.ERROR_LEVEL);
    }

    public void warn(String messageContent) {
        this.add(messageContent, MessageSeverity.WARN_LEVEL);
    }

    public void info(String messageContent) {
        this.add(messageContent, MessageSeverity.INFO_LEVEL);
    }

    public void debug(String messageContent) {
        this.add(messageContent, MessageSeverity.DEBUG_LEVEL);
    }

    public void add(String messageContent, int severity) {
        messageList.add(new MessageBase(messageContent,severity));
    }

    //TODO: TBD clone a message?
    public void add(IMessage message) {
        messageList.add(message);
    }

    //TODO: Return a copy of member list.
    public List<IMessage> getMessageList() {
        return this.messageList;
    }

    public void clear() {
        this.messageList.clear();
    }
}
