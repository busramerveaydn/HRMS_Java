package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobTitleService;
import kodlamaio.Hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.Hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	//verileri işlemek için verileri yönettiğimiz yerden jobTitleDao ile 
	//(çünkü jobTitleDao veri tabanına bağlanıyo) oluşturulan ferefans ile eşitlenir.
	private JobTitleDao jobTitleDao; 
	@Autowired //new yapıyo
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		return this.jobTitleDao.findAll(); //veri tabanı işlemlerindeki tüm verileri getirir.
	}

}
