package app.employeemanager.repository;

import app.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

    Optional<Employee> findAllById(int id);
}
