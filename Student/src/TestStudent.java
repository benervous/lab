
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(2, 96, "Borat Andrey Viktorovich"), new Student(1, 94, "Kurilets Valery Andreevich"),
				new Student(4, 56, "Kusik Illia Vladimirovich"), new Student(2, 96, "Her Andrey Anatolievich"), new Student (2, 93, "Alexander Miron Mironovich"),
			    new Student(4, 56, "Akella Vladivimir Vladimirovich"), new Student(1, 94, "Allo Alloha Andreevich"), new Student(1, 23, "Kesha Illia Vladimirovich"),
			    new Student(1, 23, "Kesha Illia Vladimirovich"), new Student(4, 55, "Jazz Vladivimir Vladimirovich"));
		
		Collections.sort(list, new CourseComparator()
                .thenComparing(new GroupComparator())
                .thenComparing(new FullNameComparator()));
				
		System.out.println(list);
		

	}

}
