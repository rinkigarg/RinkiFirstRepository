
public class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		  if(this.getAge() > o.getAge()) 
		  { 
			  return 1;
		  }
		  else if(this.getAge() < o.getAge())
		  {
			  return -1;
		  }
		  else
		  {
			  return 0;
		  }
		 
		//return o.getName().compareTo(this.getName());
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}
