package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.JobTitle;

//verinin veri tabanından çekilmesi veya işlenmesi için dataAccess kullanılır.
//elde olan sprin boot sayesinde sadece abstract kullanılarak yapılabilir.

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
