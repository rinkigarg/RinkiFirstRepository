import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeIteration {
	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("rinki", 36));
		list.add(new Employee("saurabh", 37));
		list.add(new Employee("Kashvi", 8));
		list.add(new Employee("Rinki", 35));
		
		/*
		 * List<Employee> l1 = list.stream().filter(empl->empl.getAge()
		 * >30).collect(Collectors.toList()); l1.forEach(empl->{
		 * System.out.println(empl.getName()); System.out.println(empl.getAge()); });
		 */
		
		list.stream().filter(empl->empl.getAge()>30).forEach(empl->System.out.println(empl.getName()));
		System.out.println(list.stream().count());
		//group all employee with similar name and age greater than 30 
		list.stream().filter(empl->empl.getAge()>30).collect(Collectors.groupingBy(empl->empl.getName()));
		
	}

}
