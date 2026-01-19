package org.example.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Dto.UserInfoDto;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class AuthServiceConsumer {


    //private final UserRepository userRepository;

    @Autowired ObjectMapper objectMapper;

    @Autowired UserService userService;
//    AuthServiceConsumer(UserRepository userRepository){
//        this.userRepository=userRepository;
//    }


    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void listen(UserInfoDto eventData){
        try{
            System.out.println(eventData);
             userService.createOrUpdateUser(eventData);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
