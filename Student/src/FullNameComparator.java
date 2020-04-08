import java.util.Comparator;

	class FullNameComparator implements Comparator<Student>{
		 
	    @Override
	    public int compare (Student e1, Student e2) {
	        return e1.getFullName().compareTo(e2.getFullName());
	    }
	}   

