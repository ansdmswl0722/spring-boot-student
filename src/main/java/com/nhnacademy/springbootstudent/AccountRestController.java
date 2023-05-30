package com.nhnacademy.springbootstudent;

import com.nhnacademy.springbootstudent.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static javax.security.auth.callback.ConfirmationCallback.OK;

@RestController
@RequiredArgsConstructor
public class AccountRestController {

    private final AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @PostMapping("/accounts")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @DeleteMapping("accounts/{id}")
    public String deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return "{\"result\":\"OK\"}";
    }

}
