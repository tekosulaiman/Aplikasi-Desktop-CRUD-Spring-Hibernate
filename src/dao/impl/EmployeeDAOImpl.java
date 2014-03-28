package dao.impl;

import dao.EmployeeDAO;
import java.util.List;
import model.Employee;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import resources.GenenericDAO;

/**
 * @author tombisnis@yahoo.com
 */
@Repository
public class EmployeeDAOImpl extends GenenericDAO<Employee> implements EmployeeDAO{

    @Override
    public List<Employee> getAllEmployees() {
        DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
        criteria.addOrder(Order.asc("id"));
        return getHibernateTemplate().findByCriteria(criteria);
    }
}