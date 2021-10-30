package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;

@Service("metier")
public class MetierImpl implements IMetier{
	
	/*
	 * Couplage faible
	 */
	
	@Autowired
	private IDao dao = null;
	
	@Override
	public double calcul() {
		double data = dao.getData();
		return data * 2;
	}
	
	public void setDao(IDao dao) {
		this.dao = dao;
		//System.out.println("Injection des dependances");
	}
	
	public void init() {
			//System.out.println("Initialisation de MetierImpl");
	}

	public MetierImpl() {
		//System.out.println("Instanciation de MetierImpl");
	}
	
	

}
