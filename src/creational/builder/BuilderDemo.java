package creational.builder;

import creational.builder.email.Email;
import creational.builder.email.EmailBuilder;

public class BuilderDemo {

    public static void run() {
        System.out.println("START: Builder Pattern Demo ============\n");
        buildEmail();
        System.out.println("END: Builder Pattern Demo ============");
    }

    private static void buildEmail() {
        Email email = new EmailBuilder()
                .to("recipient@example.com")
                .cc("manager@example.com")
                .bcc("archive@example.com")
                .subject("Project Update")
                .body("Here is the latest project update...")
                .build();

        email.send();
    }
}
