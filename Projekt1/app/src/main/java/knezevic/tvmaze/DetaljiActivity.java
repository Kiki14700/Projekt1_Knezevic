package knezevic.tvmaze;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class DetaljiActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalji);

        Intent intent = getIntent();
        TVShow TVShow = (TVShow)intent.getSerializableExtra("TVShow");

        TextView name = findViewById(R.id.name);
        name.setText(String.valueOf(TVShow.getName()));

        TextView language = findViewById(R.id.language);
        language.setText(String.valueOf(TVShow.getLanguage()));

        ArrayList<String> lst = TVShow.getGenres();
        String txt = "";

        for(int i = 0; i < lst.size(); i++){
            String x = lst.get(i);
            txt += x + "\n";

        }
        TextView genres = findViewById(R.id.genres);
        genres.setText(String.valueOf(txt));

        Button nazad = findViewById(R.id.nazad);
        nazad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }

}