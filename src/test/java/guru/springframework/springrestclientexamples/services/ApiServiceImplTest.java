package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest extends TestCase {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGetUsers(){

        List<User> users = apiService.getUsers(1);

        assertEquals(1, users.size());
    }
}