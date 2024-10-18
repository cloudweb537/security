package com.example.jobs_project.dto;


import com.example.jobs_project.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class GetUserResponse {
    private String username;
    private String password;
    public GetUserResponse(User user)
    {
        this.username=user.getUsername();
        this.password=user.getPassword();
    }


}
