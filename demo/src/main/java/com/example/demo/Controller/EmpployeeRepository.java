package com.example.demo.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpployeeRepository extends JpaRepository<Employee, Integer>{

}
