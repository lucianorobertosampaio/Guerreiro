package android.example.guerreiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    ImageView proximo;
    VideoView videov;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        proximo = (ImageView) findViewById(R.id.proximo);
        videov = (VideoView) findViewById(R.id.videoView);


        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Video = new Intent(getApplicationContext(), Pagina1.class);

                startActivity(Video);


            }

        });

    }

}


