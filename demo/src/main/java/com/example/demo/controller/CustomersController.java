package com.example.demo.controller;

import com.example.demo.controller.exception.ApiRequestException;
import com.example.demo.domain.service.CustomerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/customers")
@RequiredArgsConstructor
public class CustomersController {

    private final CustomerService customerService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches all customers from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
    })
    public List<String> getAllCustomers(){
        return customerService.getAll();
    }

    @GetMapping(value = "/customer/{name}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Fetches specific customer by name from db.",
            notes = "Dummy data used at the moment.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not found")
    })
    public String getCustomerByName(@PathVariable String name) {
        return customerService.getCustomerByName(name);
    }
}
