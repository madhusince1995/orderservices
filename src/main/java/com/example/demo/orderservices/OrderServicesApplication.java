package com.example.demo.orderservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class OrderServicesApplication {
    @Autowired
    private OrderDao orderDao;
   @GetMapping
   public List<order> orderServices(){
    return orderDao.getOrders().stream().sorted().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        SpringApplication.run(OrderServicesApplication.class, args);
    }

}
