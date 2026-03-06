package com.example.baganmyay.repository;

import com.example.baganmyay.model.entity.ApplicationForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationFormRepository extends CrudRepository<ApplicationForm,Long> {

}
