package org.example.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Dto.UserInfoDto;
import org.example.entities.UserInfo;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

     @Autowired UserRepository userRepository;

     @Autowired ObjectMapper objectMapper;

     public void createOrUpdateUser(UserInfoDto userInfoDto){

//          System.out.println(userInfoDto.getUserId());
//          System.out.println(userInfoDto.getUserName());
//          System.out.println(userInfoDto.getFirstName());
//          System.out.println(userInfoDto.getLastName());
//          System.out.println(userInfoDto.getEmail());
//          System.out.println(userInfoDto.getProfilePic());
//          System.out.println(userInfoDto.getPhoneNumber());
          UserInfo userInfo=objectMapper.convertValue(userInfoDto,UserInfo.class);
            userRepository.save(userInfo);

     }

}
