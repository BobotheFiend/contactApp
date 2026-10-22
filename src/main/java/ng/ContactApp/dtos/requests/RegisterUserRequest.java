package ng.ContactApp.dtos.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class RegisterUserRequest {
    @NotEmpty
    @Email
    String email;
}
