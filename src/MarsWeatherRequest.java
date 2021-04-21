import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.util.Map;


public class MarsWeatherRequest {

    public static void main(String[] args)
    {
        //private static final String apiKey = "THeo7ij3hRu2icANJbAjorTTTbJ6BDF6LWPqe9Ms";
        //private static final String MarsInsightURL = "https://api.nasa.gov/insight_weather/";
        //private static final String InsightEnding = "&feedtype=json&ver=1.0";


        String data = "{\n" +
                "  \"828\": {\n" +
                "    \"First_UTC\": \"2021-03-26T00:49:39Z\", \n" +
                "    \"Last_UTC\": \"2021-03-27T00:08:45Z\", \n" +
                "    \"Month_ordinal\": 12, \n" +
                "    \"Northern_season\": \"late winter\", \n" +
                "    \"PRE\": {\n" +
                "      \"av\": 730.123, \n" +
                "      \"ct\": 125793, \n" +
                "      \"mn\": 713.4341, \n" +
                "      \"mx\": 744.6319\n" +
                "    }, \n" +
                "    \"Season\": \"winter\", \n" +
                "    \"Southern_season\": \"late summer\", \n" +
                "    \"WD\": {\n" +
                "      \"most_common\": null\n" +
                "    }\n" +
                "  }, \n" +
                "  \"832\": {\n" +
                "    \"First_UTC\": \"2021-03-30T02:07:35Z\", \n" +
                "    \"Last_UTC\": \"2021-03-30T19:29:10Z\", \n" +
                "    \"Month_ordinal\": 12, \n" +
                "    \"Northern_season\": \"late winter\", \n" +
                "    \"PRE\": {\n" +
                "      \"av\": 734.259, \n" +
                "      \"ct\": 62504, \n" +
                "      \"mn\": 714.5854, \n" +
                "      \"mx\": 748.775\n" +
                "    }, \n" +
                "    \"Season\": \"winter\", \n" +
                "    \"Southern_season\": \"late summer\", \n" +
                "    \"WD\": {\n" +
                "      \"most_common\": null\n" +
                "    }\n" +
                "  }, \n" +
                "  \"sol_keys\": [\n" +
                "    \"828\", \n" +
                "    \"832\"\n" +
                "  ], \n" +
                "  \"validity_checks\": {\n" +
                "    \"826\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          0, \n" +
                "          1, \n" +
                "          2\n" +
                "        ], \n" +
                "        \"valid\": false\n" +
                "      }\n" +
                "    }, \n" +
                "    \"828\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          1, \n" +
                "          2, \n" +
                "          3, \n" +
                "          4, \n" +
                "          5, \n" +
                "          6, \n" +
                "          7, \n" +
                "          8, \n" +
                "          9, \n" +
                "          10, \n" +
                "          11, \n" +
                "          12, \n" +
                "          13, \n" +
                "          14, \n" +
                "          15, \n" +
                "          16, \n" +
                "          17, \n" +
                "          18, \n" +
                "          19, \n" +
                "          20, \n" +
                "          21, \n" +
                "          22, \n" +
                "          23\n" +
                "        ], \n" +
                "        \"valid\": true\n" +
                "      }\n" +
                "    }, \n" +
                "    \"829\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          0, \n" +
                "          1, \n" +
                "          2, \n" +
                "          3, \n" +
                "          4, \n" +
                "          5, \n" +
                "          6, \n" +
                "          7, \n" +
                "          8, \n" +
                "          9, \n" +
                "          10, \n" +
                "          11, \n" +
                "          12, \n" +
                "          13, \n" +
                "          14, \n" +
                "          15\n" +
                "        ], \n" +
                "        \"valid\": false\n" +
                "      }\n" +
                "    }, \n" +
                "    \"831\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          3, \n" +
                "          4, \n" +
                "          5, \n" +
                "          6, \n" +
                "          7, \n" +
                "          8, \n" +
                "          9, \n" +
                "          10, \n" +
                "          22, \n" +
                "          23\n" +
                "        ], \n" +
                "        \"valid\": false\n" +
                "      }\n" +
                "    }, \n" +
                "    \"832\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          0, \n" +
                "          1, \n" +
                "          2, \n" +
                "          3, \n" +
                "          4, \n" +
                "          5, \n" +
                "          6, \n" +
                "          7, \n" +
                "          8, \n" +
                "          9, \n" +
                "          10, \n" +
                "          11, \n" +
                "          12, \n" +
                "          13, \n" +
                "          14, \n" +
                "          15, \n" +
                "          16, \n" +
                "          17\n" +
                "        ], \n" +
                "        \"valid\": true\n" +
                "      }\n" +
                "    }, \n" +
                "    \"833\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          3, \n" +
                "          4, \n" +
                "          5, \n" +
                "          6, \n" +
                "          7, \n" +
                "          8, \n" +
                "          9, \n" +
                "          10, \n" +
                "          11, \n" +
                "          12, \n" +
                "          13\n" +
                "        ], \n" +
                "        \"valid\": false\n" +
                "      }\n" +
                "    }, \n" +
                "    \"sol_hours_required\": 18, \n" +
                "    \"sols_checked\": [\n" +
                "      \"826\", \n" +
                "      \"828\", \n" +
                "      \"829\", \n" +
                "      \"831\", \n" +
                "      \"832\", \n" +
                "      \"833\"\n" +
                "    ]\n" +
                "  }\n" +
                "}";
        try
        {
            JSONParser parser = new JSONParser();
            JSONObject simpleJSONObject = (JSONObject)parser.parse(data);

            JSONArray solKeys = (JSONArray)simpleJSONObject.get("sol_keys");
            String key = (String)solKeys.get(0);
            Map sol = (Map)simpleJSONObject.get(key);

            Map pressure = (Map) sol.get("PRE");
            Double averagePressure = (Double) pressure.get("av");

        }
        catch(Exception e)
        {
            System.out.println("Bruh");
        }

    }





}

