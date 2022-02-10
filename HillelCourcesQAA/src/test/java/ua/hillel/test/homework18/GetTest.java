package ua.hillel.test.homework18;

import com.irinabreza.hillel.homework18.Order;
import com.irinabreza.hillel.homework18.OrderModel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetTest {
    @Test
    public void getOrderTest() throws IOException {
        OrderModel orderModel = new OrderModel();
        Order receivedOrder = orderModel.getOrderById(9L);
        Assert.assertTrue(receivedOrder.getId() == 9);
    }
}
