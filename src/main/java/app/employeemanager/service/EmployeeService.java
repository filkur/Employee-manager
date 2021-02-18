package app.employeemanager.service;

import app.employeemanager.exception.UserNotFoundException;
import app.employeemanager.model.Employee;
import app.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee addEmployee (Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return repository.save(employee);
    }

    public Employee updateEmployee (Employee employee){
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById (int id){
        return repository.findAllById(id).orElseThrow(
                () -> new UserNotFoundException("User by id "+id+" was not found")
        );
    }

    public void deleteEmployee(int id){
        repository.deleteById(id);
    }
}
