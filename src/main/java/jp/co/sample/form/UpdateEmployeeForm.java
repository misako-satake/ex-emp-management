package jp.co.sample.form;
/**
 * 
 * @author satakeyoshihito
 *従業員情報を更新するときに使用するフォーム
 */
public class UpdateEmployeeForm {

	private String id;//従業員のID
	private String dependentsCount;//扶養人数
	
	@Override
	public String toString() {
		return "UpdateEmployeeForm [id=" + id + ", DependentsCount=" + dependentsCount + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDependentsCount() {
		return dependentsCount;
	}
	public void setDependentsCount(String dependentsCount) {
		this.dependentsCount = dependentsCount;
	}
	
}
