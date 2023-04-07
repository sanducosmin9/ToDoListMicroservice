package devs.toz.todolistmicroservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ToDoList {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date date;
    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<Task> task;
}
