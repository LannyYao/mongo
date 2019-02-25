package com.lanny.mongoo.app.repo;

import com.lanny.mongoo.app.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Lanny Yao
 * @date 2/20/2019 1:21 PM
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
