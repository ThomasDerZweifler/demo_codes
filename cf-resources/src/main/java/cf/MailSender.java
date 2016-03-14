/*package cf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Created by abhishekupadhyay on 2016/02/23.
 */
/*@Component
@Scope("prototype")
public class MailSender implements  Runnable {


    /*String from,to,subject,text;

    public MailSender(String from,String to,String subject,String text)
    {
        this.from = from;
        this.to=to;
        this.subject = subject;
        this.text = text;

    }
*/

    /*String name;
    public void setname(String name)
    {
        this.name = name;
    }

    @Override
    public  void run()
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MailSenderConfig.class);
        ctx.refresh();
        JavaMailSenderImpl mailSender = ctx.getBean(JavaMailSenderImpl.class);
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mailMsg = new MimeMessageHelper(mimeMessage);
        try {
            mailMsg.setFrom("abhishek@craftemporio.com");
            mailMsg.setTo("abhishek.upadhyay.cse12@iitbhu.ac.in");
            mailMsg.setSubject("Test mail From CraftEmporio");
            mailMsg.setText("Hello World!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        mailSender.send(mimeMessage);
        System.out.println("---Done---");

    }
}*/
