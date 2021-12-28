package com.example.eTaskifyTaurus_1.Controller;


import com.example.eTaskifyTaurus_1.Service.UserService;
import com.example.eTaskifyTaurus_1.model.UserTaskify;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserTaskify>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }


    @GetMapping("/test")
    public ResponseEntity<List<String>> getTest() {

        return ResponseEntity.ok().body(List.of("Hello","Hell","Hel","He","H"));
    }
}
