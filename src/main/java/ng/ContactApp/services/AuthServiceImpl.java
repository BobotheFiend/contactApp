package ng.ContactApp.services;

import lombok.AllArgsConstructor;
import ng.ContactApp.data.repositories.UserRepository;
import ng.ContactApp.dtos.requests.RegisterUserRequest;
import ng.ContactApp.dtos.responses.RegisterUserResponse;
import ng.ContactApp.exceptions.AuthServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public RegisterUserResponse register(RegisterUserRequest request) throws AuthServiceException {

        if (request == null) throw new AuthServiceException("Request Cannot Be Null!");
        RegisterUserResponse response = new RegisterUserResponse();
        return response;
    }

}
