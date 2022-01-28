import customers.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext  ctx = new AnnotationConfigApplicationContext(Config.class);

        Customer customer = ctx.getBean(Customer.class);

        System.out.println(customer);
    }
}
