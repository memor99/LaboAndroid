package com.example.labo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button, button2, button3, button4, button5, button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Se declaran los botones por medio del id
        button = (Button) findViewById(R.id.boton1);
        button2 = (Button) findViewById(R.id.boton2);
        button3 = (Button) findViewById(R.id.boton3);
        button4 = (Button) findViewById(R.id.boton4);
        button5 = (Button) findViewById(R.id.boton5);
        button6 = (Button) findViewById(R.id.boton6);

        //Se definen los sonidos de cada boton en especifico
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.beep1);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.beep2);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.beep3);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.beep4);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.beep5);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.beep6);

        //Se realizan las acciones cuando se hace click
        //El media player inicia desde 0 cada vez que se clickea
        // Se cambia el color y lo escrito dependiendo del estado actual
        button.setOnClickListener(new View.OnClickListener() {
            Drawable background= button.getBackground();
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.start();
               if (button.getText().equals("New")){
                   button.setText("Old");
                   button.setBackgroundColor(0xffffffff);

               }
               else if (button.getText().equals("Old")){
                   button.setText("New");
                   button.setBackgroundColor(0x8BC34A);
               }
            }
        });



        //Se realizan las acciones cuando se hace click
        //El media player inicia desde 0 cada vez que se clickea
        // Se cambia el color y lo escrito dependiendo del estado actual
        button2.setOnClickListener(new View.OnClickListener() {
            Drawable background= button2.getBackground();
            public void onClick(View v) {
                mediaPlayer2.seekTo(0);
                mediaPlayer2.start();
                if (button2.getText().equals("Hi")){
                    button2.setText("Bye");
                    button2.setBackgroundColor(0xFFBB86FC);

                }
                else if (button2.getText().equals("Bye")){
                    button2.setText("Hi");
                    button2.setBackgroundColor(0xFF018786);
                }
            }
        });

        //Se realizan las acciones cuando se hace click
        //El media player inicia desde 0 cada vez que se clickea
        // Se cambia el color y lo escrito dependiendo del estado actual
        button3.setOnClickListener(new View.OnClickListener() {
            Drawable background= button3.getBackground();
            public void onClick(View v) {
                mediaPlayer3.seekTo(0);
                mediaPlayer3.start();
                if (button3.getText().equals("Down")){
                    button3.setText("Up");
                    button3.setBackgroundColor(0xFF6200EE);

                }
                else if (button3.getText().equals("Up")){
                    button3.setText("Down");
                    button3.setBackgroundColor(0xFF5722);
                }
            }
        });

        //Se realizan las acciones cuando se hace click
        //El media player inicia desde 0 cada vez que se clickea
        // Se cambia el color y lo escrito dependiendo del estado actual
        button4.setOnClickListener(new View.OnClickListener() {
            Drawable background= button4.getBackground();
            public void onClick(View v) {
                mediaPlayer4.seekTo(0);
                mediaPlayer4.start();
                if (button4.getText().equals("Thin")){
                    button4.setText("Fat");
                    button4.setBackgroundColor(0xFF3700B3);

                }
                else if (button4.getText().equals("Fat")){
                    button4.setText("Thin");
                    button4.setBackgroundColor(0x937D5C);
                }
            }
        });

        //Se realizan las acciones cuando se hace click
        //El media player inicia desde 0 cada vez que se clickea
        // Se cambia el color y lo escrito dependiendo del estado actual
        button5.setOnClickListener(new View.OnClickListener() {
            Drawable background= button5.getBackground();
            public void onClick(View v) {
                mediaPlayer5.seekTo(0);
                mediaPlayer5.start();
                if (button5.getText().equals("Tall")){
                    button5.setText("Short");
                    button5.setBackgroundColor(0xFF018786);

                }
                else if (button5.getText().equals("Short")){
                    button5.setText("Tall");
                    button5.setBackgroundColor(0x93b53c);
                }
            }
        });


        //Se realizan las acciones cuando se hace click
        //El media player inicia desde 0 cada vez que se clickea
        // Se cambia el color y lo escrito dependiendo del estado actual
        button6.setOnClickListener(new View.OnClickListener() {
            Drawable background= button6.getBackground();
            public void onClick(View v) {
                mediaPlayer6.seekTo(0);
                mediaPlayer6.start();
                if (button6.getText().equals("Happy")){
                    button6.setText("Sad");
                    button6.setBackgroundColor(0XFF000000);

                }
                else if (button6.getText().equals("Sad")){
                    button6.setText("Happy");
                    button6.setBackgroundColor(0xCDDC39);
                }
            }
        });



    }
}