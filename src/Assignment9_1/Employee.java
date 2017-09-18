package Assignment9_1;

public class Employee {
	
	int empCode;
	String empName;
	public Employee(int empCode){
		this.empCode=empCode;
	}
	public Employee(String empName){
		this.empName=empName;
	}
	public Employee(int empCode,String empName){
		this.empCode=empCode;
		this.empName=empName;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String toString(){
		return empCode+" "+empName;
	}
	

}
