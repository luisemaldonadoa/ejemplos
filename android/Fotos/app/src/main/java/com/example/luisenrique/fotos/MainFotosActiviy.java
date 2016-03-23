package com.example.luisenrique.fotos;

import android.graphics.BitmapFactory;
import android.os.Environment;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.lang.reflect.WildcardType;


public class MainFotosActiviy extends AppCompatActivity {
    private ImageView mImageView;

    public static File[] pickNRandomFiles(File[] array, int n) {

        List<File> list = new ArrayList <File>(array.length);
        for (File i : array)
            list.add(i);
        Collections.shuffle(list);

        File[] answer = new File[n];

        for (int i = 0; i < n; i++)
            answer[i] = list.get(i);
        Arrays.sort(answer);
        return answer;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fotos_activiy);

        mImageView = (ImageView) findViewById(R.id.imageView1);

        //mImageView.setImageBitmap(BitmapFactory.decodeFile("/sdcard/DCIM/Camera/IMG_20141228_161749.jpg"));
        mImageView.setImageBitmap(BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/IMG_20141228_161749.jpg"));

        File[] files=null;
        final String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            //files = Environment.getExternalStorageDirectory().listFiles();
            File f=new File(Environment.getExternalStorageDirectory()+"/DCIM/Camera/");
            files=f.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String filename) {
                    return filename.toLowerCase().endsWith(".jpg");
                }
            });

        } else {
            Log.d("Debug: ","error al leer archivos");
        }

        File[] randomFiles = pickNRandomFiles(files, 5);
        int countFiles=1;
        for (File afile: randomFiles) {
            if (countFiles<=5){
                System.out.println(afile.getName()); //
                if(countFiles==1)
                    ((ImageView) findViewById(R.id.imageView1)).setImageBitmap(BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/" + afile.getName()));
                if(countFiles==2)
                    ((ImageView) findViewById(R.id.imageView2)).setImageBitmap(BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/" + afile.getName()));
                if(countFiles==3)
                    ((ImageView) findViewById(R.id.imageView3)).setImageBitmap(BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/" + afile.getName()));
                if(countFiles==4)
                    ((ImageView) findViewById(R.id.imageView4)).setImageBitmap(BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/" + afile.getName()));
                if(countFiles==5)
                    ((ImageView) findViewById(R.id.imageView5)).setImageBitmap(BitmapFactory.decodeFile(Environment.getExternalStorageDirectory() + "/DCIM/Camera/" + afile.getName()));

                countFiles++;
            }else{break;}
                //break;
        }

        System.out.println("Num of files: "+files.length);
        System.out.println(Environment.getExternalStorageDirectory()+"/DCIM/Camera/");

    }
}
