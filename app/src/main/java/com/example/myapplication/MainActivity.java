package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    /*
    EditText ed_role = (EditText) findViewById(R.id.edit_role);
    EditText ed_ques = (EditText) findViewById(R.id.edit_question);
    EditText ed_lang = (EditText) findViewById(R.id.edit_question);
    Button bt_play =  (Button) findViewById(R.id.button_play);
    VideoView vid_view = (VideoView) findViewById(R.id.videoPlayer);
    String role_txt = ed_role.getText().toString();
    int role_len = role_txt.length();
    String ques_txt = ed_ques.getText().toString();
    int ques_len = ques_txt.length();
    String lang_txt = ed_lang.getText().toString();
    int lang_len = lang_txt.length();
    */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed_role = (EditText) findViewById(R.id.edit_role);
        EditText ed_ques = (EditText) findViewById(R.id.edit_question);
        EditText ed_lang = (EditText) findViewById(R.id.edit_question);
        Button bt_play =  (Button) findViewById(R.id.button_play);
        VideoView vid_view = (VideoView) findViewById(R.id.videoPlayer);
        String role_txt = ed_role.getText().toString();
        int role_len = role_txt.length();
        String ques_txt = ed_ques.getText().toString();
        int ques_len = ques_txt.length();
        String lang_txt = ed_lang.getText().toString();
        int lang_len = lang_txt.length();

        Uri video_to_play = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.result); //do not add any extension
        vid_view.setVideoURI(video_to_play);

        bt_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(role_len !=0 && ques_len!=0 && lang_len!=0){
                    vid_view.start();
                }else{
                    //vid_view.stopPlayback();
                }



            }
        });



    }
}