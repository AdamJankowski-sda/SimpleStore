package user;

import interfaces.IUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements IUser {

    private String Name;
    private String Surrname;
    private String Login;
    private String Pass;
    private String ID;

}
