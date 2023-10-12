package util;

import model.MainService;
import model.SubService;
import repository.*;
import repository.impl.*;
import service.*;
import service.Impl.*;

public class ApplicationContext {

    public static final UserRepository userRepository;
    public static final CustomerRepository customerRepository;
    public static final ExpertRepository expertRepository;
    public static final MainServiceRepository mainServiceRepository;
    public static final OfferRepository offerRepository;
    public static final OrderRepository orderRepository;
    public static final SubServiceRepository subServiceRepository;

    public static final UserService userService;
    public static final CustomerService customerService;
    public static final ExpertService expertService;
    public static final MainServiceService mainServiceService;
    public static final OrderService orderService;
    public static final SubServiceService subServiceService;

    static {
        userRepository = new UserRepositoryImpl();
        customerRepository = new CustomerRepositoryImpl();
        expertRepository = new ExpertRepositoryImpl();
        mainServiceRepository = new MainServiceImpl();
        offerRepository = new OfferRepositoryImpl();
        orderRepository = new OrderRepositoryImpl();
        subServiceRepository = new SubServiceRepositoryImpl();

        userService = new UserServiceImpl();
        customerService = new CustomerServiceImpl();
        expertService = new ExpertServiceImpl();
        mainServiceService = new MainServiceServiceImpl();
        orderService = new OrderServiceImpl();
        subServiceService = new SubServiceServiceImpl();
    }
}
