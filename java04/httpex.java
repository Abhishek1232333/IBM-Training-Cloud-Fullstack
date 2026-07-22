package java04;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

class httpex{
    private static String url="https://jsonplaceholder.typicode.com/todos/1";

    public static void main(String[] args) {
        HttpClient client=HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();


        HttpRequest req=HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        try{
            HttpResponse<String> res=client.send(req,HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code:"+res.statusCode());
            System.out.println("Response Body:"+res.body());

            // Map<String,String> map=new HashMap<>();
            // map.put("userID", (res.body().toString().split(",")[0]).toString().split(":")[1]);
            // map.put("id", (res.body().toString().split(",")[1]).toString().split(":")[1]);
            // map.put("title", (res.body().toString().split(",")[2]).toString().split(":")[1]);
            // map.put("completed", (res.body().toString().split(",")[3]).toString().split(":")[1]);


            // System.out.println(map.get("title"));
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}