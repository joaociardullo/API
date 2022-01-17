package br.com.devjoao.api.services;

import br.com.devjoao.api.domain.User;

public interface UserService {
    User FindById(Integer id);
}
