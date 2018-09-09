package com.bank.management.dao.Repositories;

import com.bank.management.dao.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cao Nguyen on 9/6/2018.
 */
public interface BankRepository extends JpaRepository<Bank, Long> {
}
