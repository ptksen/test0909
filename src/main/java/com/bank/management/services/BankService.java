package com.bank.management.services;

import com.bank.management.dao.model.Bank;

import java.util.List;

/**
 * Created by Cao Nguyen on 9/6/2018.
 */
public interface BankService {
    List<Bank> list();

    String add(Bank bank);

    String update(Bank bank);

    String remove(String bank);
}
