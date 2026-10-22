package ng.ContactApp.services;

import ng.ContactApp.dtos.requests.RegisterUserRequest;
import ng.ContactApp.dtos.responses.RegisterUserResponse;


public interface AuthServiceImpl {



    RegisterUserResponse register(RegisterUserRequest request);

}
