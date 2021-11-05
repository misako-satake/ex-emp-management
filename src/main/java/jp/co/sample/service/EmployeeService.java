package jp.co.sample.service;
/**
 * @author satakemisako

 * 従業員情報一覧を全件検索する業務処理を行うメソッドを含む
 * 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.Employee;
import jp.co.sample.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> showList(){
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}
	
	public Employee showDetail(Integer id) {
		Employee employee = employeeRepository.load(id);
		return employee;
	}
	
	public void update(Employee  employee) {
		employeeRepository.update(employee);
	}
}
