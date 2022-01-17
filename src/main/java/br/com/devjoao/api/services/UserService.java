package br.com.devjoao.api.services;

import br.com.devjoao.api.domain.User;

import java.util.List;

public interface UserService {
    User FindById(Integer id);
    List<User> findAll();

}
