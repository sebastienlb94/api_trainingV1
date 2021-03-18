package fr.esiea.ex4A.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
class HelloController {

    private final HelloRepository helloRepository;

    HelloController(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @ResponseBody
    @PostMapping(value="/api/inscription", consumes = MediaType.APPLICATION_JSON_VALUE)
    boolean userIdentified(@RequestBody Map<String,String> requestBody) {
        User user = new User(requestBody.get("userEmail"), requestBody.get("userName"), requestBody.get("userTweeter"), requestBody.get("userCountry"), requestBody.get("userSex"), requestBody.get("userSexPref"));
        helloRepository.userAdded(user);
        return true;
    }
}
