package fi.vamk.e2000593.northwind.repository;

//import fi.vamk.e2000593.northwind.entity.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeePrivilegesRepository extends JpaRepository<EmployeePrivilegesRepository, Integer> {

}
