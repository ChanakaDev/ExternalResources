package com.example.externalresources;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // accessing texts
        String text = getString(R.string.welcome_message);
        String text2 = getString(R.string.good_bye_message);

        // accessing formated texts
        String first_name = "Sanchitha";
        String last_name = "Udana";
        String text3 = getString(R.string.good_moring_user, first_name, last_name);

        // accessing prurals
        int unreadCount = 1;
        String plural1 = getResources().getQuantityString(R.plurals.unread_messages, unreadCount);

        // accessing colors
        int ranilgePata = getResources().getColor(R.color.ranilge_pata);

        // accessing image
        Drawable car = getResources().getDrawable(R.drawable.car);
    }
}