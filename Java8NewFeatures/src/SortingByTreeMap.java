import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingByTreeMap {
	public static void main(String[] args)
	{
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee("Rinki", 23));
		set.add(new Employee("Kashvi", 8));
		set.add(new Employee("Saurabh", 26));
		set.add(new Employee("Krishav", 3));
		set.add(new Employee("Kashvi", 10));
		set.add(new Employee("Saurabh", 10));
		for (Employee employee : set) {
			System.out.println(employee);
		}
		Set<String> set1 = new TreeSet<>();
		set1.add("Rinki");
		set1.add("Kashvi");
		set1.add("Saurabh");
		set1.add("Krishav");
		set1.add("Kashvi");
		for (String str : set1) {
			System.out.println(str);
		}
		Set<Student> hashSet = new HashSet<>();
		hashSet.add(new Student("Rinki", 20));
		hashSet.add(new Student("Kashvi", 10));
		hashSet.add(new Student("Saurabh", 23));
		hashSet.add(new Student("Krishav", 5));
		hashSet.add(new Student("Kashvi", 20));
		for (Student student : hashSet) {
			System.out.println(student);
		}
	}

}
