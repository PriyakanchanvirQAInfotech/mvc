import java.util.*;
public class EmployeeService {
	 
	private static Employee details(){
		Employee e = new Employee();
	      e.setName("Priya");
	      e.setId(4709);
	      e.setAge(21);
		return e;
	   }

	public static void main(String args[])
	{
		Employee model  = details();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.data();
	}
	
}
