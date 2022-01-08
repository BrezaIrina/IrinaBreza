package ua.hillel.test.Homework11;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstLoginTest {

    @Test(dataProvider = "logins", groups = {"functions", "regression", "login"})
    public void newLoginTest(String user, String password, String role) {
        if (user.equals("userName2") & password.equals("Password2")) {
            Assert.assertEquals(role,"admin", "Should login as admin" );
            System.out.println("Admin is logged in");
        }
    }

    @DataProvider(name = "logins")
    public Object[][] createLogins() {
        String[][] users = {
                {"userName1", "Password1", "buyer"},
                {"userName2", "Password2", "admin"},
                {"userName3", "Password3", "guest"},
        };
        return users;
    }
}
