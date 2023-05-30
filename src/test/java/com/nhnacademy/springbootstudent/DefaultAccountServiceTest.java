package com.nhnacademy.springbootstudent;

import com.nhnacademy.springbootstudent.repository.AccountRepository;
import com.nhnacademy.springbootstudent.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DefaultAccountServiceTest {
    @Autowired
    AccountRepository accountRepository;

    @Test
    void testGetAccounts() {
        Account account = new Account(1L,"account1",10000);
        accountRepository.save(account);

        Optional<Account> actual = accountRepository.findById(1L);
        assertThat(actual).isPresent();
        assertThat(actual.get()).isEqualTo(account);
    }
}