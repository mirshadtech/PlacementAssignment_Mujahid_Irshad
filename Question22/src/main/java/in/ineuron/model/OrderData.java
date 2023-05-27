package in.ineuron.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	private String orderdescription;
	private Double price;

	@ManyToOne(targetEntity = Employe.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Employe emp;

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", orderdescription=" + orderdescription + ", price=" + price + "]";
	}

}
