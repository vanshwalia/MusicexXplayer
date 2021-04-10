package com.example.musicex;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;


public void play(View view){

    player.start();
    TextView status=findViewById(R.id.status);

    status.setText("Enjoy The Music...");
}
public void pause(View view){

    player.pause();
    TextView status=findViewById(R.id.status);
    status.setText("Music is Paused...");

}
public void stop(View view){

    player.stop();
    System.exit(0);



}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = MediaPlayer.create(this,R.raw.song);
    }
}