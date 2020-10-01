import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class Requests {
    public void sendSave(String number) throws IOException {
//        @todo need to fill ip
        String url = String.format("http://ip/cgi/card_edit?req=1+1+%s", number);

        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();

        httpClient.setRequestMethod("GET");

        String authorizationHeader = buildBasicAuthorizationString();

//        System.out.println(authorizationHeader);
        httpClient.setRequestProperty("Authorization", authorizationHeader);

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending request to url: " + url);
        System.out.println("Response code: " + responseCode);
    }

    public void sendDel() throws IOException {
//        @todo need to fill ip
        String url = "http://ip/cgi/card_clr_list";

        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();

        httpClient.setRequestMethod("GET");

        String authorizationHeader = buildBasicAuthorizationString();

//        System.out.println(authorizationHeader);
        httpClient.setRequestProperty("Authorization", authorizationHeader);

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending request to url: " + url);
        System.out.println("Response code: " + responseCode);
    }

    private String buildBasicAuthorizationString() {
        //@todo need to fill
        String credentials = "login" + ":" + "password";
        return "Basic " + new String(Base64.getEncoder().encode(credentials.getBytes()));
    }
}
