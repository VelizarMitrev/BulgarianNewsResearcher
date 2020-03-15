package researchers.btv;

import enums.HttpRequestMethod;
import interfaces.IResearcher;
import researchers.BaseResearcher;
import utils.HttpRequestUtils;

import java.io.IOException;
import java.util.List;

public class BtvResearcher extends BaseResearcher implements IResearcher {
    private String url = "https://btvnovinite.bg";

    public BtvResearcher() {}

    public String research(List<String> keywords) {
        try {
            return HttpRequestUtils.sendHttpRequest(url, HttpRequestMethod.GET);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}