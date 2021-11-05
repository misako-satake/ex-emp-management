package jp.co.sample.controller;
/**
 * 
 * @author satakemisako
 * 従業員検索処理用コントローラー
 * 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Employee;
import jp.co.sample.form.UpdateEmployeeForm;
import jp.co.sample.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/showList")
	public String showList(Model model) {
		model.addAttribute("employeeList", employeeService.showList());
		
		for(Employee employee:employeeService.showList()) {
			System.out.println(employee);
		}
		
		return "employee/list";
	}
	
	@ModelAttribute
	public UpdateEmployeeForm setUpEmployeeForm() {
		UpdateEmployeeForm updateEmployeeForm = new UpdateEmployeeForm();
		return updateEmployeeForm;
	}
	
	@RequestMapping("/showDetail")
	public String showDetail(String id,Model model){
		Employee employee = employeeService.showDetail(Integer.parseInt(id));
		model.addAttribute("employee", employee);
		return "employee/detail";
	}
	
	@RequestMapping("/update")
	public String update(UpdateEmployeeForm form) {
		Employee employee = employeeService.showDetail(Integer.parseInt(form.getId()));
		employee.setDependentsCount(Integer.parseInt(form.getDependentsCount()));
		employeeService.update(employee);
		System.out.println(employee);
		return "redirect:/employee/showList";
		
	}
}
