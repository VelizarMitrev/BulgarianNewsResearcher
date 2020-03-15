package researchers.nova;

import enums.HttpRequestMethod;
import researchers.BaseResearcher;
import utils.HttpRequestUtils;

import java.io.IOException;
import java.util.List;

public class NovaResearcher extends BaseResearcher {
    private String url = "https://nova.bg/news";

    public NovaResearcher(){}

    public String research(List<String> keywords) {
        try {
            return HttpRequestUtils.sendHttpRequest(url, HttpRequestMethod.GET);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
