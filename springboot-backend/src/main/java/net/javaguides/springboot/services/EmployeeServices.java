package net.javaguides.springboot.services;

import net.javaguides.springboot.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeServices {

    //Employee operations

    //create
    Employee saveEmployee(Employee employee);

    //get all employee

    List<Employee> getAllEmployee();

    //get single employee of given userId

    Employee getEmployeeById(Long employeeId);

    //Updtae employee with given Id
    Employee updateEmployee(Long employeeId, Employee employeeDetails);

    //delete employee with given Id

    Map<String, Boolean> deleteEmployee(Long employeeId);
}
