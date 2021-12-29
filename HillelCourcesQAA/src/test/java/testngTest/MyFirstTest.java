package testngTest;

import org.testng.annotations.Test;

@Test(groups = {"functions", "regression", "login"})
public class MyFirstTest {

  @Test(priority = 10)
    public void firstMethod() {
      System.out.println("Test 1");
    }

    @Test(priority = 11)
    public void newFuncTest(){
        System.out.println("New Func test");
    }

    @Test(priority = 30)
    public void secondMethod() {
        System.out.println("Test 2");
    }

    @Test(priority = 20)
    public void aNewTest() {
        System.out.println("Test 3");
    }
}
