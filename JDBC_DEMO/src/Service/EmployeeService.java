package Service;

import Dao.EmployeeDAO;
import Models.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService() {
        employeeDAO = new EmployeeDAO();
    }

    public void addEmployee(Employee employee) throws SQLException {
        employeeDAO.addEmployee(employee);
    }
    public Employee getEmployeeById(int id) throws SQLException {
        return employeeDAO.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() throws SQLException {
        return employeeDAO.getAllEmployees();
    }

    public void updateEmployee(Employee employee) throws SQLException {
        employeeDAO.updateEmployee(employee);
    }

    public void deleteEmployee(int id) throws SQLException {
        employeeDAO.deleteEmployee(id);
    }
}
