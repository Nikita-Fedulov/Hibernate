package SkillBox.Purchaselist;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchaselist")

public class Purchaselist {


    @Column(name = "student_name")
    private String studentName;
    @Column(name = "course_name")
    private String courseName;

}
