package com.todo.web.model;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import java.util.Date;
@Table(name = "todo")
@Entity
public class Todo {
    @Id
    @SequenceGenerator(name = "id",sequenceName = "id",
    allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NonNull
    private String title;
    private boolean completed;
    private Date creationTimestamp;
    private Date updateTimestamp;;
}
