package ua.hillel.test.homework18;

import com.irinabreza.hillel.homework18.DeleteResponse;
import com.irinabreza.hillel.homework18.OrderModel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class DeleteTest {
    @Test
    public void deleteOrderTest() throws IOException {
        OrderModel orderModel = new OrderModel();
        DeleteResponse response = orderModel.deleteOrderById(2L);
        Assert.assertTrue(response.getCode() == 200 || response.getCode() == 404);
    }
}
