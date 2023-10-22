package SkillBox.Subscription;

import SkillBox.Course.Course;
import SkillBox.Student.Student;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Subscriptions")
public class Subscription {
    @EmbeddedId
    private SubscriptionKey id;
    }

