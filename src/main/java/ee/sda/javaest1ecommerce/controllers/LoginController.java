package ee.sda.javaest1ecommerce.controllers;

import ee.sda.javaest1ecommerce.dtos.LoginInDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
public class LoginController {

    final UserDetailsService userDetailsService;

    @PostMapping("/validatelogin")
    Boolean validateLogin(){
        return true;
    }
}
