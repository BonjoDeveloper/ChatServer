/**
 * @author Shu
 * @date 17th June 2017
 * @version 1.0
 * @parameter
 * @since
 * @return
 */

// * Message structure
// * Each message in Messenge has four fields:
// * 	type: This can be set to message, login, new user, etc.
// * 	sender: The username of sender
// * 	content: Actual content of the message
// * 	Recipient: Username of recipient of the message


package com.shu.socket;

import java.io.Serializable;

public class Message implements Serializable {
    public String type, sender, content, recipient;
    public Message(String type, String sender, String content, String recipient) {
        this.type = type;
        this.sender = sender;
        this.content = content;
        this.recipient = recipient;
    }
    
    @Override
    public String toString() {
        return "{type='"+type+"', sender='"+sender+"', content='"+content+"', recipient='"+recipient+"'}";
    }
}
