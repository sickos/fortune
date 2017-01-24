package com.example.administrator.fortune;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.net.Socket;

public class MainActivity extends Activity {



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BloodActivity.class);
                startActivity(intent);
            }
        });

            Client socket = new Client("192.168.0.8", 1234);
            socket.setClientCallback(new Client.ClientCallback() {
                @Override
                public void onMessage(String message) {

                }

                @Override
                public void onConnect(Socket socket) {
                   //socket.send("Hello World!\n");
                   // socket.disconnect();
                }

                @Override
                public void onDisconnect(Socket socket, String message) {

                }

                @Override
                public void onConnectError(Socket socket, String message) {

                }
            });

            socket.connect();
    }
}



