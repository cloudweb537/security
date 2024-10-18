package com.example.jobs_project.dto;


import com.example.jobs_project.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private String username;
    private String password;

    public User todo(){
        return User.builder()
                .username(this.username)
                .password(this.password)
                .build();
    }
}
