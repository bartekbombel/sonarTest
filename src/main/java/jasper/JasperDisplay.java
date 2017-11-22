package jasper;

import com.auth0.jwt.JWTSigner;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JasperDisplay extends HttpServlet {

    public static String token, dateFrom, dateTo, author;
    private static Date creationTime;
    private static int type, minDuration;
    private static  Long klnId, adnId, gpzId, uztId;
//adnId 63301
    //gpz 5754
    //uztId = 87608
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        createToken();


    }

    public void createToken() {
        adnId = 63301L;
        dateFrom = "2017-09-26 10:00";
        dateTo = "2017-10-03 10:00";
        gpzId = -1L;
        type = 11;
        minDuration = 2;
        author = "Jan jakis tam";
        klnId = 421L;
        uztId = 87608L;


        Map<String, Object> params = new HashMap<String, Object>();
        params.put("adnId", adnId);
        params.put("dateFrom", dateFrom);
        params.put("dateTo", dateTo);
        params.put("gpzId", gpzId);
        params.put("type", type);
        params.put("minDuration", minDuration);
        params.put("author", author);
        params.put("klnId", klnId);
        params.put("uztId", uztId);
        params.put("creationTime", new Date());

        JWTSigner signer = new JWTSigner("nq1378hosH(&*H&AS");
        token = signer.sign(params);
    }
}