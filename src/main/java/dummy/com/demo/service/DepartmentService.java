package dummy.com.demo.service;

import dummy.com.demo.entity.Department;
import dummy.com.demo.error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    public  Department saveDepartment(Department department);

    public List<Department> fetchDepartments();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public String deleteDepartment(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}
