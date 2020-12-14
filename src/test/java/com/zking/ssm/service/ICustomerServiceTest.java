package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.model.Order;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author kxj
 * @create  2020-11-27 18:28
 */
public class ICustomerServiceTest extends BaseTestCase {
    @Autowired
    private  ICustomerService customerService;
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer=new Customer();
    }

    @Test
    public void insert() {
        customer.setCustomerId(null);
        customer.setCustomerName("kxj");
        customerService.insert(customer);

    }

    @Test
    public void selectByPrimaryKey() {
        Customer c = customerService.selectByPrimaryKey(5);
        System.out.println(c);
    }

    @Test
    public void queryOrderByCust() {
        customer.setCustomerId(2);
        List<Customer> ls = customerService.queryOrderByCust(customer);
        ls.forEach(l->{
            System.out.println(l.getOrders());
            List<Order> lis=l.getOrders();
            lis.forEach(o->{
                System.out.println(o);
            });
        });

    }
}