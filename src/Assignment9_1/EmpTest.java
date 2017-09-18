package Assignment9_1;
import java.util.*;

public class EmpTest {
	public static void main(String args[]){
		Map<Integer,String> m=new HashMap<Integer,String>();
		Employee e1=new Employee(101,"emp1");
		Employee e2=new Employee(102,"emp2");
		Employee e3=new Employee(103,"emp3");
		m.put(e1.getEmpCode(),e1.getEmpName());
		m.put(e2.getEmpCode(),e2.getEmpName());
		m.put(e3.getEmpCode(),e3.getEmpName());
		System.out.println(m);
		
		
		
		
	}

}
