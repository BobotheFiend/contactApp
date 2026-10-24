package ng.ContactApp.services;

import ng.ContactApp.dtos.requests.RegisterUserRequest;
import ng.ContactApp.dtos.responses.RegisterUserResponse;
import ng.ContactApp.exceptions.AuthServiceException;


public interface AuthService {

    RegisterUserResponse register(RegisterUserRequest request) throws AuthServiceException;

}
