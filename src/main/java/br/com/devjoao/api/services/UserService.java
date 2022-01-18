package br.com.devjoao.api.services;

import br.com.devjoao.api.domain.User;
import br.com.devjoao.api.domain.dto.UserDTO;

import java.util.Arrays;
import java.util.List;

public interface UserService {
    User FindById(Integer id);
    User create(UserDTO obj);
    List<User>FindAll();
    User update (UserDTO obj);

}
