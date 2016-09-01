package ro.bianca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.bianca.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
