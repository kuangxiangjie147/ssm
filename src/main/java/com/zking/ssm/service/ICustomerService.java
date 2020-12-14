package com.zking.ssm.service;

import com.zking.ssm.model.Customer;

import java.util.List;

/**
 * @author kxj
 * @create  2020-11-27 18:19
 */
public interface ICustomerService {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);
    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List queryOrderByCust(Customer record);
}
