import model.Customer;
import model.User;
import model.enumeration.Role;
import service.CustomerService;
import service.Impl.CustomerServiceImpl;
import util.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        //create customer
        User user = User.builder()
                .firstname("Shahrad")
                .lastname("Bagheri")
                .email("shahrad@gmail.com")
                .password("something")
                .role(Role.CUSTOMER)
                .build();

        Customer customer = new Customer();
        customer.setUser(user);
        customer = ApplicationContext.customerService.create(customer);

        //update customer
//
//        Customer customer = ApplicationContext.customerService.findById(1L);
//        customer.setUser(user);
//        ApplicationContext.customerService.update(customer);
    }
}
