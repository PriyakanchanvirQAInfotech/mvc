import java.util.*;
public class EmployeeController extends Employee{
	   private Employee model;
	   private EmployeeView view;

	   public EmployeeController(Employee model, EmployeeView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setEmployeeName(String name){
	      model.setName(name);		
	   }

	   public String getEmployeeName(){
	      return model.getName();		
	   }

	   public void setEmployeeId(int id){
	      model.setId(id);		
	   }

	   public int getEmployeeId(){
	      return model.getId();		
	   }
	   public void setEmployeeAge(int age){
		      model.setAge(age);		
	   }

	   public int getEmployeeAge(){
		      return model.getAge();		
	   }
	   public void data(){				
	      view.data(model.getName(), model.getId(), model.getAge());
	   }	
}
