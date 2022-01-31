//package ua.hillel.test.rest;
//
//import com.fasterxml.jackson.databind.util.JSONPObject;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.RequestBody;
//import okhttp3.Response;
//import org.jsoup.Connection;
//import org.testng.annotations.Test;
//
//import java.nio.charset.StandardCharsets;
//
//public class RestTest {
//
//    @Test
//    public void restTest() {
//
////        Request request = new Request.Builder()
////                .url("http://petstore.swagger.io/vs/user/1010")
////                .get()
////                .build();
//
//        JSONObject jsonObject = new JSONPObject("");
//        jsonObject.put("username", "testUser");
//        jsonObject.put("firstName", "testUser");
//        jsonObject.put("lastName", "testUser");
//        jsonObject.put("phone", "");
//        jsonObject.put("password", "testUser@server.com");
//        jsonObject.put("userStatus", 1);
//
//        System.out.println(jsonObject.toString());
//
//        Request body = RequestBody.create(json.getBytes(StandardCharsets.UTF_8));
//
//        Request request = new Request.Builder()
//                .post()
//                .url("http://petstore.swagger.io/vs/user/1010")
//                .addHeader("Content-Type", "application/json")
//                .build();
//
//
//        OkHttpClient client = new OkHttpClient();
//
////        Response response = client.newCall(request).execute();
////
////        System.out.println(response.body().string());
//
//        JSONObject responseObject = new JSONObject(response.body().string());
//        responseObject.get("");
//
//
//
//    }
//}
