package com.example.hrmanagementnav;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {@Test
void testYearlySalaryForRegularEmployee() {
    Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "70000.00");
    assertEquals(employee.getYearlySalary(), 70000*1);
}

}