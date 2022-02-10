package ua.hillel.test.homework18;

import com.irinabreza.hillel.homework18.OrderModel;
import com.irinabreza.hillel.homework18.PetInventory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class InventoryTest {
    @Test
    public void getInventoryTest() throws IOException {
        OrderModel orderModel = new OrderModel();
        PetInventory inventory = orderModel.getInventory();
        Assert.assertTrue(inventory.getAvailable() != 0);
    }
}
