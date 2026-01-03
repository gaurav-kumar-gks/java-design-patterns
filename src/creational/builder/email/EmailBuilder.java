package creational.builder.email;

public class EmailBuilder {

    private String to;
    private String cc;
    private String bcc;
    private String subject;
    private String body;

    public EmailBuilder to(String to) {
        this.to = to;
        return this;
    }

    public EmailBuilder cc(String cc) {
        this.cc = cc;
        return this;
    }

    public EmailBuilder bcc(String bcc) {
        this.bcc = bcc;
        return this;
    }

    public EmailBuilder subject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder body(String body) {
        this.body = body;
        return this;
    }

    public Email build() {
        if (to == null || to.trim().isEmpty()) {
            throw new IllegalStateException("Email 'to' field is required");
        }
        return new Email(to, cc, bcc, subject, body);
    }
}
