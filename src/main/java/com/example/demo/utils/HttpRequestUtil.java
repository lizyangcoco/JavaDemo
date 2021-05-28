package com.example.demo.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;


public class HttpRequestUtil {
    public static String getBodyContent(HttpServletRequest request) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (InputStream inputStream = request.getInputStream();
             BufferedReader reader = new BufferedReader(
                     new InputStreamReader(inputStream, Charset.forName("UTF-8")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static Map<String, String> getMapParamsFromBody(String request)
    {
        Map<String, String> map = new HashMap<String, String>();
        strRequest(map, request);
        return map;
    }

    public static String strRequest(Map<String, String> map, String s)
    {
        int length = s.length();
        int index1 = s.indexOf("=");
        String parm1 = s.substring(0, index1);
        int index2 = s.indexOf("&");
        if (index2 == -1)
        {
            String parm2 = s.substring(index1 + 1);
            map.put(parm1, parm2);
            return null;
        }
        String parm2 = s.substring(index1 + 1, index2);
        map.put(parm1, parm2);
        return strRequest(map, s.substring(index2 + 1));
    }
}
