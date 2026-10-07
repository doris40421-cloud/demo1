package com.aic.edudemo;

// 請注意引用的部分
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.aic.edudemo.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerApplicationTests {

    // 請撰寫以下的部分.....
    @Autowired
    private EmployeeRepository employeeRepository;
    // 請撰寫以上的部分.....

    @Test
    void contextLoads() {
    }
    
    // 請撰寫以下的部分.....
    @Test
    void fetchAllEmployees() {
        assertNotNull(this.employeeRepository);
        this.employeeRepository.findAll().forEach(System.out::println);
    }
    // 請撰寫以上的部分.....

}