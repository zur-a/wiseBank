package com.Joi.wiseBank.Repository;

import com.Joi.wiseBank.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionsRepositry extends CrudRepository<AccountsRepository, Long> {
    List<AccountsRepository>  findByCustomerIdOrderByTransactionDesc(int customerId);
}
