package org.example.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import org.example.Dto.UserInfoDto;
import org.springframework.beans.factory.annotation.Autowired;

public class UserInfoDeserializer implements Deserializer<UserInfoDto> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public UserInfoDto deserialize(String topic, byte[] data) {
        if (data == null || data.length == 0) {
            return null;
        }
        try {
            return objectMapper.readValue(data, UserInfoDto.class);
        } catch (Exception e) {
            // Change this to see the real error in your console
            System.err.println("Deserialization failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
