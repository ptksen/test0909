package com.bank.management.controller;

import com.bank.management.dao.model.Bank;
import com.bank.management.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cao Nguyen on 9/6/2018.
 */
@Controller
@RequestMapping(value = "/banks")
public class BankController{
    @Autowired
    private BankService bankService;

    @GetMapping(value = "/")
    public @ResponseBody List<Bank>getBanks(){
        return bankService.list();
    }
    @PostMapping(value = "/")
    public  @ResponseBody String add(Bank bank){
        return bankService.add(bank);
    }
    @PutMapping(value = "/")
    public @ResponseBody String update(Bank bank){
        return bankService.update(bank);
    }
    @DeleteMapping(value = "/{id}")
    public @ResponseBody String remove(@PathVariable(value = "id") String id){
    return bankService.remove(id);
    }
}
