package fi.vamk.e2000593.northwind.entity;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "fi.vamk.e2000593.northwind.entity.PurchaseOrderDetails")
@Table(name = "purchase_order_details")
public class PurchaseOrderDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"purchase_order_id\"", nullable = false)
  private Integer purchaseOrderId;
  @Column(name = "\"product_id\"", nullable = true)
  private Integer productId;
  @Column(name = "\"quantity\"", nullable = false)
  private java.math.BigDecimal quantity;
  @Column(name = "\"unit_cost\"", nullable = false)
  private java.math.BigDecimal unitCost;
  @Column(name = "\"date_received\"", nullable = true)
  private Timestamp dateReceived;
  @Column(name = "\"posted_to_inventory\"", nullable = false)
  private boolean postedToInventory;
  @Column(name = "\"inventory_id\"", nullable = true)
  private Integer inventoryId;
  public PurchaseOrderDetails() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getPurchaseOrderId() {
    return purchaseOrderId;
  }
  public void setPurchaseOrderId(Integer purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }
  public Integer getProductId() {
    return productId;
  }
  public void setProductId(Integer productId) {
    this.productId = productId;
  }
  public java.math.BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(java.math.BigDecimal quantity) {
    this.quantity = quantity;
  }
  public java.math.BigDecimal getUnitCost() {
    return unitCost;
  }
  public void setUnitCost(java.math.BigDecimal unitCost) {
    this.unitCost = unitCost;
  }
  public Timestamp getDateReceived() {
    return dateReceived;
  }
  public void setDateReceived(Timestamp dateReceived) {
    this.dateReceived = dateReceived;
  }
  public boolean isPostedToInventory() {
    return postedToInventory;
  }
  public void setPostedToInventory(boolean postedToInventory) {
    this.postedToInventory = postedToInventory;
  }
  public Integer getInventoryId() {
    return inventoryId;
  }
  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
  }
}