package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//veri tabanı tablosuna karşılık gelecek

@Data //lombok ta get set getiriyo
@AllArgsConstructor //parametreli constructor
@NoArgsConstructor //parametresiz constructor
@Entity //veri tabanı bağlamak için
@Table(name = "job_titles")

//name e verilen isim veri tabanındaki tablo ismine karşılık düşer.

public class JobTitle {
	
	//buradaki jobTitle class ı veri tabanında bir tabloya karşılık gelecek.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id artışı için veri tabanı ile senkronizasyon
	
	@Column(name = "id") //veri tabanında karşılık gelen sütuna karşılık geliyor.
	private int id;
	
	@Column(name = "title")
	private String title;
	;

}
