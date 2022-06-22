package payroll;

import org.springframework.data.jpa.repository.JpaRepository;


    interface EmployeeRepositortory extends JpaRepository<Employee,Long>{

    }

