package com.educonnect.rakshapriyan.controller;

import static com.educonnect.rakshapriyan.utils.MyConstant.AUTH;
import static com.educonnect.rakshapriyan.utils.MyConstant.LOGIN;
import static com.educonnect.rakshapriyan.utils.MyConstant.REGISTER;
import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educonnect.rakshapriyan.dto.request.LoginRequest;
import com.educonnect.rakshapriyan.dto.request.RegisterRequest;
import com.educonnect.rakshapriyan.dto.response.LoginResponse;
import com.educonnect.rakshapriyan.dto.response.RegisterResponse;
import com.educonnect.rakshapriyan.service.AuthenticationService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(AUTH)
@Tag(name = "Authentication")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authService;

    @PostMapping(REGISTER)
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {
        RegisterResponse response = new RegisterResponse();
        try {
            response = authService.register(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            response.setMessage("Registration failed due to an unexpected error.");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

    @PostMapping(LOGIN)
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        LoginResponse response = new LoginResponse();
        try {
            response = authService.login(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            response.setMessage("Login failed!");
            response.setAccessToken("");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

}
