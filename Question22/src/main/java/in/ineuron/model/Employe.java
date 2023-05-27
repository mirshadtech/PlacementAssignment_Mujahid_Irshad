package in.ineuron.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "OM-EMPLOYEE")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;

	@OneToMany(targetEntity = OrderData.class, cascade = CascadeType.ALL, mappedBy = "employe", fetch = FetchType.EAGER)
	private List<OrderData> order;

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
