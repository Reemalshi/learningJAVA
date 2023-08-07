import java.util.*;
class Student {
    private String name;
    private List<Course> registeredCourses;

    public Student(String name) {
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public void registerForCourse(Course course) {
        registeredCourses.add(course);
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public String getName() {
        return name;
    }
}
