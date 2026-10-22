package ng.ContactApp.services;

import lombok.AllArgsConstructor;
import ng.ContactApp.data.repositories.UserRepository;
import ng.ContactApp.dtos.requests.RegisterUserRequest;
import ng.ContactApp.dtos.responses.RegisterUserResponse;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AuthService implements AuthServiceImpl{

    private final UserRepository userRepository;

    @Override
    public RegisterUserResponse register(RegisterUserRequest request) {
        return null;
    }

}
