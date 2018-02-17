package project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import project.models.Users;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long>{
    List<Users> findByOrderByRegistrationTimeDesc();
    List<Users> findByOrderById();
    List<Users> findByOrderByName();

    Optional<Users> findByConfirmCode(String confirmCode);
    Optional<Users> findByEmail(String email);

}
