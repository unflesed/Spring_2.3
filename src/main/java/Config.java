import customers.Customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(initMethod ="init")
    public Customer customer(@Value("Ivan") String firstName, @Value("Ivanov") String lastName,
                             @Value("22") int age,@Value("male") String gender){

        Customer customer = new Customer(firstName, age);
        customer.setLastName(lastName);
        customer.setGender(gender);

        return customer;
    }
}
