import model.Customer;
import model.User;
import model.enumeration.Role;
import service.CustomerService;
import service.Impl.CustomerServiceImpl;
import util.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();

        User user = User.builder()
                .firstname("Shahrad")
                .lastname("Bagheri")
                .email("shahrad@gmail.com")
                .password("something")
                .role(Role.CUSTOMER)
                .build();

        Customer customer = new Customer();
        customer.setUser(user);

//        customer = customerService.create(customer);

        User user1 = ApplicationContext.userService.signIn("shahrad@gmail.com","something");
        System.out.println(user1);
    }
}
