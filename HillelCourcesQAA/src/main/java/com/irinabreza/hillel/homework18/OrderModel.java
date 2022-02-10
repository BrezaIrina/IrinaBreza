package com.irinabreza.hillel.homework18;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OrderModel {

    OkHttpClient client = new OkHttpClient();
    ObjectMapper mapper = new ObjectMapper();

    public Order post(Order order) throws IOException {

        String requestBodyString = mapper.writeValueAsString(order);

        RequestBody body = RequestBody.create(requestBodyString.getBytes(StandardCharsets.UTF_8));

        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/store/order")
                .post(body)
                .addHeader("Content-type", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        String responseString = response.body().string();
        Order responseOrder = mapper.readValue(responseString, Order.class);
        return responseOrder;
    }

    public Order getOrderById(Long id) throws IOException {
        String stringId = Long.toString(id);
        String completeUrl = "https://petstore.swagger.io/v2/store/order/" + stringId;

        Request request = new Request.Builder()
                .url(completeUrl)
                .get()
                .build();

        Response response = client.newCall(request).execute();
        String responseString = response.body().string();
        Order responseOrder = mapper.readValue(responseString, Order.class);
        return responseOrder;
    }

    public DeleteResponse deleteOrderById(Long id) throws IOException {
        String stringId = Long.toString(id);
        String completeUrl = "https://petstore.swagger.io/v2/store/order/" + stringId;

        Request request = new Request.Builder()
                .url(completeUrl)
                .delete()
                .build();

        Response response = client.newCall(request).execute();
        String responseString = response.body().string();
        DeleteResponse responseOrder = mapper.readValue(responseString, DeleteResponse.class);
        return responseOrder;
    }

    public PetInventory getInventory() throws IOException {
        Request request = new Request.Builder()
                .url("https://petstore.swagger.io/v2/store/inventory")
                .get()
                .build();

        Response response = client.newCall(request).execute();
        String responseString = response.body().string();
        PetInventory inventory = mapper.readValue(responseString, PetInventory.class);
        return inventory;
    }
}

