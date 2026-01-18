package org.example.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

//Dto are for internal app logic, not for db
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class) // converts snakeCase of request to camelCase and camelCase in app to snakeCase in response
@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor // Add this
@AllArgsConstructor
public class UserInfoDto {



    private String username;

    private String firstName;

    private String lastName;

    private Long phoneNumber;

    private String email;

    private String profilePic;

}
