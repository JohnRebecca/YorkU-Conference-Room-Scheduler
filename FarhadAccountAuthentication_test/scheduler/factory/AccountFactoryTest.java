package scheduler.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import scheduler.model.AccountStatus;
import scheduler.model.AccountType;
import scheduler.model.RegisteredUser;
import scheduler.model.VerificationMode;

class AccountFactoryTest {

    private AccountFactory factory;
    private AccountType studentType;

    @BeforeEach
    void setUp() {
        factory = new RegisteredUserFactory();
        studentType = new AccountType( "student", "Student", 20, VerificationMode.UNIVERSITY);
    }

    @Test
    void createUserInitializesFieldsCorrectly() {
        RegisteredUser user = factory.createUser( "John Smith", "john@yorku.ca", "Password1!", "123456789", studentType);

        assertEquals("John Smith", user.getFullName());
        assertEquals("john@yorku.ca", user.getEmail());
        assertEquals(studentType, user.getAccountType());
        assertEquals(AccountStatus.PENDING_VERIFICATION, user.getAccountStatus());
        assertFalse(user.isVerified());
    }

    @Test
    void createUserGeneratesUniqueUserId() {
        RegisteredUser user1 = factory.createUser("John", "john@yorku.ca", "Password1!", "11111", studentType);
        RegisteredUser user2 = factory.createUser( "Jane", "jane@yorku.ca", "Password1!", "22222", studentType);

        assertNotEquals(user1.getUserId(), user2.getUserId());
    }

    @Test
    void createUserHashesPassword() {
        RegisteredUser user = factory.createUser("John", "john@yorku.ca", "Password1!", "11111", studentType);

        assertNotEquals("Password1!", user.getPasswordHash());
        assertTrue(user.verifyPassword("Password1!"));
    }
}