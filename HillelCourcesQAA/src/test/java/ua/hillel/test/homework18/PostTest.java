package ua.hillel.test.homework18;

import com.irinabreza.hillel.homework18.Order;
import com.irinabreza.hillel.homework18.OrderModel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PostTest {

    @Test
    public void postRequestTest() throws IOException {
        OrderModel orderModel = new OrderModel();
        Order responseOrder = orderModel.post(Order.my());
        Assert.assertTrue(responseOrder.getId() != 0);
    }
}
