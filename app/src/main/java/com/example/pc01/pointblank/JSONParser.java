package com.example.pc01.pointblank;

import android.util.Log;
import android.view.View;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * Created by PC01 on 22/01/2016.
 */
public class JSONParser {

    public String JSONParser(String jsonku, View v) {
        String dataJson;
        try {

//            JSONParser JP = new JSONParser();
//            JP.getJSONFromUrl(loginURL);

            JSONObject mainJSONObj = new JSONObject(jsonku);
// get category JSONObject from mainJSONObj
            JSONObject categoryJSONObj = mainJSONObj.getJSONObject("data");

// get all keys from categoryJSONObj
            StringBuilder dataparse = new StringBuilder();
            Iterator<String> iterator = categoryJSONObj.keys();
            while (iterator.hasNext()) {
                String key = iterator.next();
                String val = categoryJSONObj.optString(key);
                Log.i("TAG", "key:" + key + "--Value::" + val);
                dataparse.append("key=" + key);
                dataparse.append("value=" + val);
            }

            dataJson = dataparse.toString();
        }catch (JSONException e){
            e.printStackTrace();
            dataJson = e.getMessage();
        }
        return dataJson;
    }
}
