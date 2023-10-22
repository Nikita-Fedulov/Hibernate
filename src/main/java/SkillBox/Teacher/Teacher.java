package SkillBox.Teacher;

import SkillBox.Course.Course;
import SkillBox.Student.Student;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
