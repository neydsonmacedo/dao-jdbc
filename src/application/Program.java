package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== Test 1: Department findById === ");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);
        System.out.println("=== Test 2: Department findAll === ");
        List<Department> list = departmentDao.findAll();
        for (Department d: list){
            System.out.println(d);
        }
        System.out.println("=== Test 3: Department insert === ");

        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id:" + newDepartment.getId());

        System.out.println("=== Test 4: Department update === ");

        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);

        System.out.println("=== Test 5: Department delete === ");

        departmentDao.deleteById(5);







    }
}
