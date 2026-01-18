package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Builder
@Table(name="users_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long id;

        private String username;

        private String firstName;

        private String lastName;

        private Long phoneNumber;

        private String email;

        private String profilePic;

}

