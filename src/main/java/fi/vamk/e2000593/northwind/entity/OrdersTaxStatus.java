package fi.vamk.e2000593.northwind.entity;

import java.io.Serializable;

//import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "fi.vamk.e2000593.northwind.entity.OrdersTaxStatus")
@Table(name = "orders_tax_status")
public class OrdersTaxStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Byte id;
  @Column(name = "\"tax_status_name\"", nullable = false)
  private String taxStatusName;
  public OrdersTaxStatus() {
  }
  public Byte getId() {
    return id;
  }
  public void setId(Byte id) {
    this.id = id;
  }
  public String getTaxStatusName() {
    return taxStatusName;
  }
  public void setTaxStatusName(String taxStatusName) {
    this.taxStatusName = taxStatusName;
  }
}