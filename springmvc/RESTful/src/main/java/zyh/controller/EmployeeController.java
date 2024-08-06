package zyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zyh.dao.EmployeeDao;
import zyh.pojo.Employee;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author GG_B
 * @version 1.0
 */
@Controller
public class EmployeeController {
    @Resource
    EmployeeDao employeeDao;

    @RequestMapping(value = "employee",method = RequestMethod.GET)
    public String getEmployeeList(Model model){
        Collection<Employee> employees = employeeDao.getAll();
//        将员工信息保存在作用域里面
        model.addAttribute("employees",employees);
        return "employee_List";
    }

}
