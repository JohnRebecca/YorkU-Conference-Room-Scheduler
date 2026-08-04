package scheduler.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;

class RegisteredUserFactoryTest {

    private RegisteredUserFactory factory;
    private AccountType type;

    @BeforeEach
    void setUp() {
        factory = new RegisteredUserFactory();
        type = new AccountType( "student", "Student", 20, VerificationMode.UNIVERSITY);
    }
    
    
    @Test
    void createUserReturnsRegisteredUser() {
        RegisteredUser user = factory.createUser("Alice", "alice@yorku.ca", "Password1!", "12345", type);

        assertNotNull(user);
        assertInstanceOf(RegisteredUser.class, user);
    }
}