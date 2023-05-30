package com.nhnacademy.springbootstudent;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@EqualsAndHashCode
@ToString
@Entity
@Setter
@NoArgsConstructor
public class Account {
    @Id
    Long accountId;
    String number;
    Integer balance;


    public Account(Long accountId, String number, Integer balance) {
        this.accountId = accountId;
        this.number = number;
        this.balance = balance;
    }
}
