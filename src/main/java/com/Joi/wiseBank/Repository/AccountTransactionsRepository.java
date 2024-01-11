package com.Joi.wiseBank.Repository;

import com.Joi.wiseBank.model.AccountTransactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountsRepository, Long> {
    List<AccountTransactions> findByCustomerIdOrderByTransactionDateDesc(int customerId);
}
