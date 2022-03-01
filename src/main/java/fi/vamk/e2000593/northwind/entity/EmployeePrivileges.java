package fi.vamk.e2000593.northwind.entity;

import java.io.Serializable;
//import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "fi.vamk.e2000593.northwind.entity.EmployeePrivileges")
@Table(name = "employee_privileges")
@IdClass(EmployeePrivileges.PrimaryKeys.class)
public class EmployeePrivileges {
  @Data
  public static class PrimaryKeys implements Serializable {
    public Integer employeeId;
    public Integer privilegeId;
  }

  @Id
  @Column(name = "\"employee_id\"", nullable = false)
  private Integer employeeId;
  @Id
  @Column(name = "\"privilege_id\"", nullable = false)
  private Integer privilegeId;

  /*
  public EmployeePrivileges(){

  }

  public Integer getEmployeeId(){
    return employeeId;
  }
  public void setEmployeeId(Integer employeeId){
    this.employeeId = employeeId;
  }

  public Integer getPrivilegeId(){
    return privilegeId;
  }
  public void setPrivilegeId(Integer privilegeId){
    this.privilegeId = privilegeId;
  }
  */

}