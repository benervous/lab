import java.util.Comparator;

class GroupComparator implements Comparator<Student>{
 
    @Override
    public int compare(Student e1, Student e2) {
        if(e1.getGroup() > e2.getGroup()){
            return 1;
        } else {
            return -1;
        }
        
    }
}
