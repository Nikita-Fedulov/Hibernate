package SkillBox.Course;

import SkillBox.Student.Student;
import SkillBox.Subscription.Subscription;
import SkillBox.Teacher.Teacher;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
