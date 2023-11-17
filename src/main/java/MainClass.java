import com.fasterxml.jackson.databind.ObjectMapper;
        import org.apache.http.HttpEntity;
        import org.apache.http.client.config.RequestConfig;
        import org.apache.http.client.methods.CloseableHttpResponse;
        import org.apache.http.client.methods.HttpGet;
        import org.apache.http.impl.client.CloseableHttpClient;
        import org.apache.http.impl.client.HttpClientBuilder;

        import java.io.FileOutputStream;
        import java.io.IOException;

public class MainClass {
    //link for request
    public static final String URI = "https://api.nasa.gov/planetary/apod?api_key=6QUFNvMhbmQ7CJPq9WEeVddhk86OpUvuEksaPL7g";

    //response transforming in object NASA
    public static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        //HTTP-client preferences
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        //take request and get response
        CloseableHttpResponse response = httpClient.execute(new HttpGet(URI));

        //transforming answer into Java-object (Nasa)
        Nasa nasaObject = mapper.readValue(response.getEntity().getContent(), Nasa.class);
//        System.out.println(nasaObject);

        //take request and get response with image
        CloseableHttpResponse pictureResponse = httpClient.execute(new HttpGet(nasaObject.url));

        //automatically forming image name
        String[] arr = nasaObject.url.split("/");
        String fileName = arr[arr.length - 1];

        HttpEntity entity = pictureResponse.getEntity();

        //save to file
        FileOutputStream fos = new FileOutputStream(fileName);
        entity.writeTo(fos);
        fos.close();

    }
}