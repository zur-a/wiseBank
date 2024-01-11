package com.Joi.wiseBank.Repository;

import com.Joi.wiseBank.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepsitory extends CrudRepository<Contact, Long> {

}
