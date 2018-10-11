package hello.app;

import hello.service.Customer;
import hello.service.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages = "hello")
@RestController
@RequestMapping("/mongo")
@EnableMongoRepositories(basePackageClasses = CustomerRepository.class)
public class Application {

    @Autowired
private final CustomerRepository repository;

    public Application(CustomerRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/vijay", method = RequestMethod.GET)
    public String vj(){
        return String.valueOf(repository.findByFirstName("Vijay"));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String all() {
        return String.valueOf(repository.findAll());
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String ins() {
        repository.deleteAll();
        repository.save(new Customer("Ajith","Kumar"));
        repository.save(new Customer("Vijay","Kanth"));
        repository.save(new Customer("Rajini","Kanth"));
        return "Done!";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String del() {
        repository.deleteAll();
        return "Done!";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

}
