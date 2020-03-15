import enums.HttpRequestMethod;
import utils.HttpRequestUtils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(HttpRequestUtils.sendHttpRequest("https://zamunda.net", HttpRequestMethod.GET));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
