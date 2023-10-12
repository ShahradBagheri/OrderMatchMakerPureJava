import model.Customer;
import model.Expert;
import model.User;
import model.enumeration.Role;
import service.CustomerService;
import service.Impl.CustomerServiceImpl;
import util.ApplicationContext;
import util.ImageProcessing;

public class Main {
    public static void main(String[] args) {

        //create customer
//        User user = User.builder()
//                .firstname("Shahrad")
//                .lastname("Bagheri")
//                .email("shahrad@gmail.com")
//                .password("something")
//                .role(Role.CUSTOMER)
//                .build();
//
//        Customer customer = new Customer();
//        customer.setUser(user);
//        customer = ApplicationContext.customerService.create(customer);

        //update customer
//        Customer customer = ApplicationContext.customerService.findById(1L);
//        customer.getUser().setFirstname("changed");
//        customer.getUser().setLastname("changed");
//        ApplicationContext.customerService.update(customer);

        //find all customer
//        System.out.println(ApplicationContext.customerService.findAll());

        //customer changing password
//        ApplicationContext.customerService.changePassword(ApplicationContext.customerService.findById(1L),"changedAgain");

        //delete customer
//        ApplicationContext.customerService.delete(ApplicationContext.customerService.findById(1L));





        //create Expert
//        User user = User.builder()
//                .firstname("Shahrad")
//                .lastname("Bagheri")
//                .email("shahrad2@gmail.com")
//                .password("something")
//                .role(Role.EXPERT)
//                .build();
//
//        Expert expert = Expert.builder()
//                .user(user)
//                .imageData(ImageProcessing.imageToBytes("C:\\Users\\Shahrad\\IdeaProjects\\PureJavaProject\\src\\main\\resources\\image\\picture.png"))
//                .build();
//
//        ApplicationContext.expertService.create(expert);

        //update Expert
//        Expert expert = ApplicationContext.expertService.findById(1L);
//        expert.getUser().setFirstname("changed");
//        ApplicationContext.expertService.update(expert);

        //findAll Expert
//        ApplicationContext.expertService.findAll();

        //Expert change password
//        ApplicationContext.expertService.changePassword(ApplicationContext.expertService.findById(1L),"changedpass");

        //Expert delete
//        ApplicationContext.expertService.delete(ApplicationContext.expertService.findById(1L));


    }
}
