package com.speedsumm.bu.aboutmegb;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

/**
 * Created by bu on 18.06.2016.
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView2 = (ImageView) findViewById(R.id.imageView2);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.imageView2):
                getPhoto(v);
                break;
            case (R.id.btnTimePicker):
                TimePickDialog timePickFragment = new TimePickDialog();
                timePickFragment.show(getSupportFragmentManager(), "TimePicker");
                break;
            case (R.id.btnNotes):
                //TODO Make call NOTES programm
                break;

        }

    }

    private void getPhoto(View v) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_PICK);
        startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        Bitmap bitmap = null;


        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    Uri selectedImage = imageReturnedIntent.getData();
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), selectedImage);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    imageView2.setImageBitmap(bitmap);
                }
        }
    }
}
