package com.educonnect.rakshapriyan.service;

import com.educonnect.rakshapriyan.dto.request.LoginRequest;
import com.educonnect.rakshapriyan.dto.request.RegisterRequest;
import com.educonnect.rakshapriyan.dto.response.LoginResponse;
import com.educonnect.rakshapriyan.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

}