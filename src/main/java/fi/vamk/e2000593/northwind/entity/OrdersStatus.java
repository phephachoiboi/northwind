package fi.vamk.e2000593.northwind.entity;

import java.io.Serializable;

//import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "fi.vamk.e2000593.northwind.entity.OrdersStatus")
@Table(name = "orders_status")
public class OrdersStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Byte id;
  @Column(name = "\"status_name\"", nullable = false)
  private String statusName;
  public OrdersStatus() {
  }
  public Byte getId() {
    return id;
  }
  public void setId(Byte id) {
    this.id = id;
  }
  public String getStatusName() {
    return statusName;
  }
  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }
}