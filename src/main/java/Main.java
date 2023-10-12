import model.*;
import model.enumeration.Role;
import service.CustomerService;
import service.Impl.CustomerServiceImpl;
import service.UserService;
import util.ApplicationContext;
import util.ImageProcessing;

import java.time.LocalDate;

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
//                .password("something1")
//                .role(Role.EXPERT)
//                .build();
//
//        System.out.println(ApplicationContext.userService.isValidEmail(user.getEmail()));
//        System.out.println(ApplicationContext.userService.isValidPassword(user.getPassword()));

//        System.out.println(ImageProcessing.validImageSize("C:\\Users\\Shahrad\\IdeaProjects\\PureJavaProject\\src\\main\\resources\\image\\picture.png"));
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




        //MainService create
//
//        MainService mainService = MainService.builder()
//                .name("something")
//                .build();
//
//        ApplicationContext.mainServiceService.create(mainService);


        //MainService update

//        MainService mainService = ApplicationContext.mainServiceService.findById(1L);
//        mainService.setName("changed");
//
//        ApplicationContext.mainServiceService.update(mainService);

        //MainService findAll

//        System.out.println(ApplicationContext.mainServiceService.findAll());

        //MainService Delete

//        ApplicationContext.mainServiceService.delete(ApplicationContext.mainServiceService.findById(1L));





        //subService create
//        SubService subService = SubService.builder()
//                .name("some name")
//                .basePrice(3000.0)
//                .comment("info")
//                .mainService(ApplicationContext.mainServiceService.findById(2L))
//                .build();
//
//        ApplicationContext.subServiceService.update(subService);

        //subService update

//        SubService subService = ApplicationContext.subServiceService.findById(1L);
//        subService.setName("Changed");
//        ApplicationContext.subServiceService.update(subService);

        //subService findAll

//        System.out.println(ApplicationContext.subServiceService.findAll());

        //subService delete
//        ApplicationContext.subServiceService.delete(ApplicationContext.subServiceService.findById(1L));

        //order create

//        Order order = Order.builder()
//                .subService(ApplicationContext.subServiceService.findById(1L))
//                .customer(ApplicationContext.customerService.findById(1L))
//                .suggestedPrice(2000.0)
//                .details("some details")
//                .startingDate(LocalDate.of(2024,12,12))
//                .build();

//        ApplicationContext.orderService.validPrice(order);
//
//        ApplicationContext.orderService.create(order);

        //order update

//        Order order = ApplicationContext.orderService.findById(3L);
//        order.setExpert(ApplicationContext.expertService.findById(1L));
//        order.setAddress("something");
//        ApplicationContext.orderService.update(order);

        //order delete
//        ApplicationContext.subServiceService.delete(ApplicationContext.subServiceService.findById(1L));
    }
}
