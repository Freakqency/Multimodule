package hello.service;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepository extends MongoRepository<Customer,String>{
Customer findByFirstName(String firstname);
}
