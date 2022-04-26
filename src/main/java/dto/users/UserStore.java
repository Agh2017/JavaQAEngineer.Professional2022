package dto.users;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserStore {
    @Getter
    private String firstName;
    @Getter
    private String lastName;
    @Getter
    private String password;
    @Getter
    private int userStatus;
    @Getter
    private String phone;
    @Getter
    private int id;
    @Getter
    private String email;
    @Getter
    private String username;
}