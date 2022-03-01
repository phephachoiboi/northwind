package fi.vamk.e2000593.northwind.entity;

import java.io.Serializable;

//import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "fi.vamk.e2000593.northwind.entity.OrderDetailsStatus")
@Table(name = "order_details_status")
public class OrderDetailsStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"status_name\"", nullable = false)
  private String statusName;
  public OrderDetailsStatus() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getStatusName() {
    return statusName;
  }
  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }
}