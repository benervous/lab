import java.util.Comparator;

class CourseComparator implements Comparator<Student>{
 
    @Override
    public int compare(Student e1, Student e2) {
        if(e1.getCourse() > e2.getCourse()){
            return 1;
        } else {
            return -1;
        }
        
    }
}
