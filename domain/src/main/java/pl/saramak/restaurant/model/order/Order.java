package pl.saramak.restaurant.model.order;

import java.util.ArrayList;
import java.util.List;

import pl.saramak.restaurant.model.user.User;

public class Order {
    List<Course> courses = new ArrayList<>();
    public Integer orderNumber;
    public User orderBy;
    public User crewBy;
    public User preparedBy;
    public void addCourse(Course course){
        courses.add(course);
    }
}
