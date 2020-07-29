package com.paul.hellotoast;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counta = 0;
    TextView teevee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teevee = findViewById(R.id.show_count); //was in onCreate ausgeführt wird, wird einmal und
        //ganz zu anfang gemacht

    }

    public void showToast(View view) {
        Toast einToast = Toast.makeText(this, R.string.toast_msg, Toast.LENGTH_SHORT); /*this = this activity
         = main activity -> context!*/
        einToast.show();
    }

    public void countUp(View view) {
        ++counta;
        teevee.setText(Integer.toString(counta));
        if (counta > 5) {
            Button b = (Button) view;
            b.setBackgroundColor(Color.GREEN); //der View aus der die Methode extrahiert wurde, aus
            //der XML, wird hier mit gegeben-- ie der BUTTON (vgl main.xml)
            // "view" innerhalb einer Methode, ist damit immer das view-Element aus der die Methode gerufen wird
            }
    }
}
