import model.Customer;
import model.User;
import model.enumeration.Role;
import service.CustomerService;
import service.Impl.CustomerServiceImpl;

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

        Customer customer = customerService.findById(2L);

        customerService.changePassword(customer,"changed");
    }
}
