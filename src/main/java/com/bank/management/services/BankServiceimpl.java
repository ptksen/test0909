package com.bank.management.services;

import com.bank.management.dao.Repositories.BankRepository;
import com.bank.management.dao.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cao Nguyen on 9/6/2018.
 */
@Service
public class BankServiceimpl implements BankService {
    @Autowired
    private BankRepository bankRepository;

    @Override
    public List<Bank> list() {
        return bankRepository.findAll();
    }

    @Override
    public String add(Bank bank) {
        bankRepository.save(bank);
        return "OK";
    }

    @Override
    public String update(Bank bank) {
        bankRepository.save(bank);
        return "OK";
    }

    @Override
    public String remove(String bank) {
        return "OK";
    }
}
