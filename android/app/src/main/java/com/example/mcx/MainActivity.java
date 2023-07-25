package com.example.mcx;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.Messages;
import com.angelbroking.smartapi.SmartConnect;
import com.angelbroking.smartapi.models.User;

public class MainActivity extends FlutterActivity {
    public class MyApi implements Messages.SmartAPI {

        @NonNull
        public String getData() {
            String clientID = "v52137355";
            String clientPass = "4321";
            String apiKey = "DDMdx9th";
            String totp = "677163";
            SmartConnect smartConnect = new SmartConnect(apiKey);
            User user = smartConnect.generateSession(clientID, clientPass, totp);
            user.
            return user.getFeedToken();
        }


    }

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine){
        super.configureFlutterEngine(flutterEngine);
        Messages.SmartAPI.setup(flutterEngine.getDartExecutor().getBinaryMessenger(),new MyApi());
    }
}
