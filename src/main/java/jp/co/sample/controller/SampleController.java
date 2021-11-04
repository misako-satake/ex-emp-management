package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Administrator;
import jp.co.sample.repository.AdministratorRepository;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@Autowired
	AdministratorRepository repositoryA;
	
	
	

	@RequestMapping("/sampleresult")
	public String index2() {
		Administrator administrator=repositoryA.findByMailAddressAndPassword("iga@sample.com", "testtest");
		
		System.out.println(administrator);
		
		return "sample";
	}
	
	
}
