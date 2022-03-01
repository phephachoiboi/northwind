package fi.vamk.e2000593.northwind.entity;

import java.io.Serializable;

//import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "fi.vamk.e2000593.northwind.entity.PurchaseOrderStatus")
@Table(name = "purchase_order_status")
public class PurchaseOrderStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"status\"", nullable = true)
  private String status;
  public PurchaseOrderStatus() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
}