package service.impl;

import dao.EmployeeDAO;
import dao.impl.EmployeeDAOImpl;
import java.util.List;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EmployeeService;

/**
 * @author tombisnis@yahoo.com
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void save(Employee employee){
        employeeDAO.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDAO.update(employee);
    }

    @Override
    public void delete(Employee employee){
       employeeDAO.delete(employee);
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeDAO.getAllEmployees();
    }
}