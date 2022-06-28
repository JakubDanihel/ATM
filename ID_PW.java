import java.util.HashMap;

public class ID_PW {
    HashMap<String, Double> loginInfo = new HashMap<String, Double>();

    ID_PW(){
        //informacie
        loginInfo.put("jano", 123.0);
        loginInfo.put("fero", 7893.33);
        loginInfo.put("jozo", 7893.47);
        loginInfo.put("miso", 10000000.0);
        loginInfo.put("matus", 17895.2);
        loginInfo.put("a",  10000.0);
    }
    protected HashMap getLoginInfo()
    {
        return loginInfo;
    }

    
}
