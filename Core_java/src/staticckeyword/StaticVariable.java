package staticckeyword;
class Employee{
	int id;
	String name;
	static String company="Wipro";
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println(id + "" +name + "" +company);
	}
}
public class StaticVariable {
public static void main (String[]args) {
	Employee e1=new Employee(101, "Dhanush");
	Employee e2=new Employee(102, "varun");
	Employee e3=new Employee(103, "chiragh");
	Employee e4=new Employee(104, "Vijay");
	
	e1.display();
	e2.display();
	e3.display();
	e4.display();
  

}
}