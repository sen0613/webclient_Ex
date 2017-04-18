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
        /* 세 번째 검색 결과의 blogerrlink 출력하기 */
        // "커리" 검색 결과 출력
        String keyword = "커리";
        String json = NaverApiAgent.searchAndReturnJson(keyword);
        System.out.println(json);

        //Json배열 리스트 생성
        JSONObject obj = new JSONObject(json);
        JSONArray list = obj.getJSONArray("items");
//        JSONArray list = (JSONArray)obj.get("items");

//        JSONObject theThird = list.getJSONObject(2);
//        String result = theThird.getString("bloggerlink");
        String result = list.getJSONObject(2).getString("bloggerlink");
        System.out.println(result);




        /* 검색결과의 blogger name 값을 전체 출력 */
        JSONArray list2 = obj.getJSONArray("items");

        for (int i = 0; i < list2.length(); i++) {
            System.out.println(
                    list2.getJSONObject(i).getString("bloggername"));
        }


    }

}

