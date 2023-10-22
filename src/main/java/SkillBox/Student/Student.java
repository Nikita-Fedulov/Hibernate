package SkillBox.Student;

import SkillBox.Course.Course;
import SkillBox.Subscription.Subscription;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
