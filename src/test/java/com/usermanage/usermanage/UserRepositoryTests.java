package com.usermanage.usermanage;

import com.usermanage.usermanage.User.User;
import com.usermanage.usermanage.User.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired private UserRepository repo;
    @Test
    public void testAddNew(){
        User user = new User():
        User.setEmail("kimumilangali@gmail.com");
        User.setPassword("kim");
        User.setFirstname("mila");
        User.setLastname("yahaya");

        User savedUser = repo.save(user);


    }
}
