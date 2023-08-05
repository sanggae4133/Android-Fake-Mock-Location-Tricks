package com.navigine.mockgps;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import android.widget.Button;

public class CustomLocationFragment extends Fragment {

    @SuppressLint("StaticFieldLeak")
    static EditText longitude;
    @SuppressLint("StaticFieldLeak")
    static EditText latitude;

    static double longitudeText = 1.0;
    static double latitudeText = 1.0;

    public CustomLocationFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_custom_location, container, false);
        
        longitude = view.findViewById(R.id.longitude);
        latitude  = view.findViewById(R.id.latitude);
        
        // 추가 시작
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new Button.setOnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                R.id.longitude = 50;
                R.id.latitude = 40;
            }
        });
        //추가 끝

        return view;
    }
    // 화면 보여주는 파트




    static void setLatLng(String mLat, String mLng) {
        latitudeText = Double.parseDouble(mLat);
        longitudeText = Double.parseDouble(mLng);

        latitude.setText(mLat);
        longitude.setText(mLng);
    }
    // 위도 경도 setting하기

    static String getLat() {
        return latitude.getText().toString();
    }
    // 위도 가져오기

    static String getLng() {
        return longitude.getText().toString();
    }
    // 경도 가져오기
}
