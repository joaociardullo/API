package br.com.devjoao.api.repositories;

import br.com.devjoao.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
