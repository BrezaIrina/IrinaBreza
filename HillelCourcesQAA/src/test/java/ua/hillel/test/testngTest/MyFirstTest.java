package ua.hillel.test.testngTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = {"functions", "regression", "login"})
public class MyFirstTest {

    private void firstMethod(String paramFromConfig) {
        System.out.println("Test 1 " + paramFromConfig);
    }

@Test(dataProvider = "logins")
    public void newFuncTest(String user, String password, String role) {
        if (role.equals("admin")) {
            throw new RuntimeException("Admin should fail");
        }
        System.out.printf("User: %s - Pass: %s - Role: %s%n", user, password, role);
    }

    private void secondMethod() {
        System.out.println("Test 2");
    }

    private void aNewTest() {
        System.out.println("Test 3");
    }

    @DataProvider(name = "logins")
    public Object[][] createLogins() {
String [][] users = {
        {"user1", "pass1", "user"},
        {"user2", "pass2", "admin"},
        {"user3", "pass3", "guest"},
};

return users;
    }
}