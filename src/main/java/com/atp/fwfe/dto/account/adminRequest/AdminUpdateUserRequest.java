package com.atp.fwfe.dto.account.adminRequest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminUpdateUserRequest {

    // username sẽ do người dùng tự đặt, password sẽ do người dùng quên mật khẩu -> đặt lại
    private String email;
    private String role;
    private boolean locked;
    private String updatedBy;
<<<<<<< HEAD
<<<<<<< HEAD
    private String name;
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
=======
>>>>>>> be9c2d22b390b8389679befff364e08bdff42788
}
