package indi.daniel.spdm.xmlaop.demo.message;

import java.util.List;

/**
 * Created by daniel on 2017/2/25.
 */
public interface IMessageService {

    void error(String messageContent);

    void warn(String messageContent);

    void info(String messageContent);

    void debug(String messageContent);

    void add(String messageContent, int severity);

    void add(IMessage message);

    List<IMessage> getMessageList();

    void clear();
}
