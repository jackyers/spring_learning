package zyh.dao;

import org.springframework.stereotype.Repository;
import zyh.pojo.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author GG_B
 * @version 1.0
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = new HashMap();
    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1));
    }

    private static Integer initId = 1006;

//    新增员工的方法
    public void saveEmployee(Employee employee){
        if (employee.getId() == null){
            employee.setId(initId++);
            employees.put(employee.getId(), employee);
        }
    }

//    查询所有员工的方法
    public Collection<Employee> getAll(){
        return employees.values();
    }

//    根据ID查询员工信息
    public Employee get(Integer id){
        return employees.get(id);
    }

//    删除员工信息
    public void delete(Integer id){
        employees.remove(id);
    }
}
