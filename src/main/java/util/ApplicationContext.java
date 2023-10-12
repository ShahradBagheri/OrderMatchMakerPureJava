package util;

import repository.*;
import repository.impl.*;

public class ApplicationContext {

    public static final UserRepository userRepository;
    public static final CustomerRepository customerRepository;
    public static final ExpertRepository expertRepository;
    public static final MainServiceRepository mainServiceRepository;
    public static final OfferRepository offerRepository;
    public static final OrderRepository orderRepository;
    public static final SubServiceRepository subServiceRepository;

    static {
        userRepository = new UserRepositoryImpl();
        customerRepository = new CustomerRepositoryImpl();
        expertRepository = new ExpertRepositoryImpl();
        mainServiceRepository = new MainServiceImpl();
        offerRepository = new OfferRepositoryImpl();
        orderRepository = new OrderRepositoryImpl();
        subServiceRepository = new SubServiceRepositoryImpl();
    }
}
