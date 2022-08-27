package com.cap.customerservice.services;

import com.cap.customerservice.model.CustomerInfo;
import com.cap.customerservice.repository.CustomerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerInfoServiceImpl implements CustomerInfoService{

    @Autowired
    CustomerInfoRepository customerInfoRepository;

    @Override
    public CustomerInfo insertCustomerInfo(CustomerInfo customerInfo) {
        return customerInfoRepository.save(customerInfo);
    }

    @Override
    public List<CustomerInfo> getAllCustomers() {
        return customerInfoRepository.findAll();
    }

    @Override
    public Optional<CustomerInfo> findCustomerInfoById(int customerId) {
        Optional<CustomerInfo> customerInfo=customerInfoRepository.findById(customerId);
        return customerInfo;
    }

    @Override
    public CustomerInfo updateCustomerInfo(CustomerInfo customerInfo, int customerId) {
        CustomerInfo cI= customerInfoRepository.findById(customerId).get();
        cI.setCustomerName(customerInfo.getCustomerName());
        cI.setCustomerEmail(customerInfo.getCustomerEmail());
        cI.setCustomerPassword(customerInfo.getCustomerPassword());
        return customerInfoRepository.save(cI);
    }

    @Override
    public void deleteCustomerInfo(int customerId) {
        customerInfoRepository.deleteById(customerId);
    }
}
