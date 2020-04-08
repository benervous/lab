
public class Student {
	private int course;
	private int group;
	private String FullName = null;
     
    public Student(int c, int g, String n){
    	this.course = c;
    	this.group = g;
        this.FullName = n;
    }
     
    public String getFullName() {
        return FullName;
    }
    public void setName(String name) {
        this.FullName = name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public String toString(){
    	return "\nStudent [course=" + course + ", group=" + group + ", FullName=" + FullName +"]";
    }
}
