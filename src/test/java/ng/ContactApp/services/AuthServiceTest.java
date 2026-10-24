package ng.ContactApp.services;

import ng.ContactApp.data.repositories.UserRepository;
import ng.ContactApp.dtos.requests.RegisterUserRequest;
import ng.ContactApp.dtos.responses.RegisterUserResponse;
import ng.ContactApp.exceptions.AuthServiceException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSources;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.junit.jupiter.api.Assertions.*;


@SpringJUnitConfig(classes = {AuthServiceImpl.class})
@ExtendWith(MockitoExtension.class)

public class AuthServiceTest {


    public RegisterUserRequest newuser(String email){
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setEmail(email);
        return registerUserRequest;
    }

    @MockitoBean
    UserRepository userRepository;

    @Autowired
    AuthService auth;

    @Test
    public void createUserRequestIsNotNullTest(){
        assertThrows(AuthServiceException.class, () -> {
            auth.register(null);
        });
    }

    @Test
    public void createUserResponseIsNotNullTest() throws AuthServiceException{
        RegisterUserRequest request = new RegisterUserRequest();
        RegisterUserResponse response = auth.register(request);
        assertNotNull(response);
    }

    @ParameterizedTest()
    @NullAndEmptySource
    @ValueSource(strings = {"  ", "\n", "\t", ""})
    public void incorrectEmailResquestInputThrowsErrorTest(String request) throws AuthServiceException {

        RegisterUserRequest user = newuser(null);
        assertThrows(AuthServiceException.class, ()->
                auth.register(user)
        );
    }
}