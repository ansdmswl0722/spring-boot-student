package com.nhnacademy.springbootstudent.service;

import com.nhnacademy.springbootstudent.Account;
import com.nhnacademy.springbootstudent.repository.AccountRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultAccountService implements AccountService {
    private final AccountRepository accountRepository;

    public DefaultAccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account createAccount(Account account) {

        accountRepository.findById(account.getAccountId()).ifPresent(s->{
            throw new RuntimeException("이미 존재하는 계좌입니다.");
        });
        return accountRepository.save(account);
    }

    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("존재하지 않는 계좌입니다."));
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
