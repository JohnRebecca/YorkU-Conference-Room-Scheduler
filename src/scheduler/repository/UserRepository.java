package scheduler.repository;

import scheduler.model.RegisteredUser;

import java.util.Optional;

public interface UserRepository {

    void save(RegisteredUser user);

    Optional<RegisteredUser> findByEmail(String email);

    Optional<RegisteredUser> findById(String userId);

    boolean emailExists(String email);
}