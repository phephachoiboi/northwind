package fi.vamk.e2000593.northwind.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EmployeePrivilegeId implements Serializable {
    private static final long serialVersionUID = -5662467647022540819L;
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;
    @Column(name = "privilege_id", nullable = false)
    private Integer privilegeId;

    @Override
    public int hashCode() {
        return Objects.hash(privilegeId, employeeId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeePrivilegeId entity = (EmployeePrivilegeId) o;
        return Objects.equals(this.privilegeId, entity.privilegeId) &&
                Objects.equals(this.employeeId, entity.employeeId);
    }
}
