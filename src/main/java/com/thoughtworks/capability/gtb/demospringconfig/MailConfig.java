package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("mail")
@Data
public class MailConfig {

    private String hostname;
    private int port;
    private String from;
    private List<String> defaultRecipients;
    private Map<String, Boolean> additionalHeaders;
    private Credentials credentials;

    @Override
    public String toString() {
        return "MailConfig{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' + '\n' +
                "mail.defaultRecipients[0]='" + defaultRecipients.get(0) + '\'' + '\n' +
                "mail.defaultRecipients[1]='" + defaultRecipients.get(1) + '\'' + '\n' +
                "mail.additionalHeaders.redelivery=" + additionalHeaders.get("redelivery") + '\n' +
                "mail.additionalHeaders.secure=" + additionalHeaders.get("secure") + '\n' +
                "mail.credentials.username='" + credentials.getUsername() + '\'' + '\n' +
                "mail.credentials.password='" + credentials.getPassword() + '\'' + '\n' +
                "mail.credentials.authMethod='" + credentials.getAuthMethod() + '\'' + '\n' +
                '}';
    }
}
