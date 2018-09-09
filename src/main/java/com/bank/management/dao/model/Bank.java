package com.bank.management.dao.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Cao Nguyen on 9/6/2018.
 */
@Entity
@Table(name = "banks")
public class Bank implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "bank_id")
    private Long bankId;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "accountName")
    private String accountName;

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountBank() {
        return accountNumber;
    }

    public void setAccountBank(String accountBank) {
        this.accountNumber = accountBank;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
