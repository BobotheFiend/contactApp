package ng.ContactApp.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    Long id;
    String nickname;
    String name;
    String number;
    Long userId;
}
