package com.example.horacechan.parking.api.http.request;

import com.example.horacechan.parking.api.ParkingApp;
import com.example.horacechan.parking.api.http.base.BaseHttpRequestClient;
import com.example.horacechan.parking.api.http.base.BaseResponse;
import com.example.horacechan.parking.util.RequestUrlUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

/**
 * Created by HoraceChan on 2016/4/21.
 */
public class CarAddRequest extends BaseHttpRequestClient {

    public String userid;
    public String plate;

    @Override
    public String setUrl() {
        return new RequestUrlUtils.Builder()
                .setHost(ParkingApp.HOST)
                .setPath("/userAddCars")
                .build();
    }

    @Override
    public String setTag() {
        return setDefaultTag();
    }

    @Override
    public void parseResponse(BaseResponse response, JSONObject json) throws JSONException {

        if (response.getStatus()==200){

        }

    }

    @Override
    public void postValue(Map<String, String> keyValue) {
        keyValue.put("userid",userid);
        keyValue.put("plate",plate);
    }
}
