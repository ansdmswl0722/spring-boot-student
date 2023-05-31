package com.nhnacademy.springbootstudent;

import com.nhnacademy.springbootstudent.configuration.AccountProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountVersionController {
    @Autowired
    private AccountProperties accountProperties;

    @GetMapping("/system/version")
    public ResponseEntity<String> getAccountVersion() {
        return new ResponseEntity<>(accountProperties.toString(), HttpStatus.OK);
    }
}
