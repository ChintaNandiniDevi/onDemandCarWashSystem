package com.cap.customerservice.controller;

import com.cap.customerservice.model.CustomerInfo;
import com.cap.customerservice.services.CustomerInfoService;
import com.cap.customerservice.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/customer")
public class CustomerInfoController {

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    CustomerInfoService customerInfoService;

    @PostMapping("/add")
    public CustomerInfo insertUserInfo(@RequestBody CustomerInfo customerInfo ){
        customerInfo.setCustomerId(sequenceGeneratorService.getSequenceNumber(CustomerInfo.SEQUENCE_NAME));
        return customerInfoService.insertCustomerInfo(customerInfo);
    }

    @GetMapping("/view")
    public List<CustomerInfo> getAllUsers(){
        return customerInfoService.getAllCustomers();
    }

    @PutMapping("/update/{id}")
    public CustomerInfo updateUserInfo(@RequestBody CustomerInfo customerInfo, @PathVariable("id") int userId)
    {
        return customerInfoService.updateCustomerInfo(customerInfo, userId);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteUserInfo(@PathVariable("id") int customerId) {

        customerInfoService.deleteCustomerInfo(customerId);

    }

}
