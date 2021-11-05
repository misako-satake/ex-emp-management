package jp.co.sample.service;

/**
 * @author satakemisako
 * Administratorのサービスクラス
 * insertメソッド、loginメソッドを含む
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.Administrator;
import jp.co.sample.repository.AdministratorRepository;

@Service
@Transactional
public class AdministratorService {

	@Autowired
	private AdministratorRepository administratorRepository;
	
	
	public void insert(Administrator administrator) {
		administratorRepository.insert(administrator);
	}
	
	public Administrator login(String mailAddress,String password) {
		Administrator administrator = administratorRepository.findByMailAddressAndPassword(mailAddress, password);
		return administrator;
	}
	
	
}
