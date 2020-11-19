package connectionhibernate;

//import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="details_client")
public class DetailsClient {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public DetailsClient(String web, String tfno, String comments) {
		this.web = web;
		this.tfno = tfno;
		this.comments = comments;
	}
	
	public DetailsClient() {
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private DetailsClient detailsClient;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="web")
	private String web;
	
	@Column(name="tfno")
	private String tfno;
	
	@Column(name="comments")
	private String comments;
	
}










/*

	>> Mapeo ORM

	@OneToOne(cascade=CascadeType.ALL)
	
	Especifica el tipo de relacion, y la operacion (cascade).
	
	@JoinColumn(name="id")

	Especifica a través de qué campo se relacionan ambas tablas, en este caso id.

*/


