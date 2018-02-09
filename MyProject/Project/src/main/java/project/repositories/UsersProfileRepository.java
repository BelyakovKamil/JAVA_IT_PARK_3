package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.models.UsersProfile;

import java.util.List;
import java.util.Optional;

public interface UsersProfileRepository extends JpaRepository<UsersProfile,Long>{
    List<UsersProfile> findByOrderById();
    List<UsersProfile> findByOrderByIdDesc();
    List<UsersProfile> findByOrderByName();

    Optional<UsersProfile> findByName(String name);


}
