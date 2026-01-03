package creational.builder.email;

import java.util.ArrayList;
import java.util.List;

public class Email {

    private final String to;
    private final String cc;
    private final String bcc;
    private final String subject;
    private final String body;

    Email(String to, String cc, String bcc, String subject,
            String body) {
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.subject = subject;
        this.body = body;
    }

    public void send() {
        System.out.println("=== Sending Email ===");
        System.out.println(this);
        System.out.println("=====================\n");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Email{");
        sb.append("to='").append(to).append('\'');
        if (cc != null && !cc.isEmpty()) {
            sb.append(", cc='").append(cc).append('\'');
        }
        if (bcc != null && !bcc.isEmpty()) {
            sb.append(", bcc='").append(bcc).append('\'');
        }
        if (subject != null && !subject.isEmpty()) {
            sb.append(", subject='").append(subject).append('\'');
        }
        if (body != null && !body.isEmpty()) {
            sb.append(", body='").append(body).append('\'');
        }
        sb.append('}');
        return sb.toString();
    }
}
