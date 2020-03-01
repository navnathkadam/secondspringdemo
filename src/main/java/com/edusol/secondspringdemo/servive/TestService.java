package com.edusol.secondspringdemo.servive;

import com.edusol.secondspringdemo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


@Service
@Slf4j
public class TestService {

    public List<Customer> getHelloworld() {
        log.info("Inside Service");

        List<Customer> l = new ArrayList<>();
        l.add(new Customer(1, "Navnath", "Pune"));
        l.add(new Customer(2, "Suyog", "Khed"));
        l.add(new Customer(3, "Atik", "Chakan"));
        return l;
    }
}
