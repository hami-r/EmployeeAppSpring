package com.nest.employeeapp_backend.dao;

import com.nest.employeeapp_backend.model.EmployeeModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {
    @Query(value = "SELECT `id`,`company_name`,`designation`,`employee_code`,`mobile_no`,`name`,`password`,`salary`,`username` FROM `employees` WHERE `employee_code`= :empCode" ,nativeQuery = true)
    List<EmployeeModel> searchEmployee(Integer empCode);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employees` WHERE `id`= :id",nativeQuery = true)
    void deleteEmployee(Integer id);
}
