package com.zking.ssm.mapper;

import com.zking.ssm.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);
    @Transactional(readOnly = true)
    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    @Transactional(readOnly = true)
    List queryOrderByCust(Customer record);
}