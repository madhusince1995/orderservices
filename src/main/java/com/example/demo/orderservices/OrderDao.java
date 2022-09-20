package com.example.demo.orderservices;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {
public List<order> getOrders(){
    return Stream.of(new order(101,"mobile",1000),new order(102,"name123",10),new order(103,"name123",10)).collect(Collectors.toList());
}
}
