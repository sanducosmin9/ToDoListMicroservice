package devs.toz.todolistmicroservice.model;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

import java.text.SimpleDateFormat;
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
    @OneToMany(mappedBy = "toDoList", cascade = CascadeType.ALL)
    private List<Task> task;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String toString() {
        return "ToDoList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", task=" + task +
                '}';
    }
}
