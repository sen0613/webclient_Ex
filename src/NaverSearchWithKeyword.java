import org.json.JSONArray;
import org.json.JSONObject;
import service.NaverApiAgent;

import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-17.
 */
public class NaverSearchWithKeyword {

    public static void main(String[] args) {

        String keyword = "자바라";

        String json = NaverApiAgent.searchAndReturnJson(keyword);

//        System.out.println(json);


            JSONObject obj = new JSONObject(json);

        JSONArray arr = obj.getJSONArray("items");


        // 1. 3번 째 검색 결과의 bloggerlink 값 출력
        JSONObject theThird = arr.getJSONObject(2);

        String result = theThird.getString("bloggerlink");
        System.out.println(result);

        // 2. 검색결과의 blogger name 값을 전체 출력
        List<String> blogList = Arrays.asList();
        for (String e : blogList) {




            System.out.println(e);
        }


        }

    }

