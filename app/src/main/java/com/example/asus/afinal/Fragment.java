package com.example.asus.afinal;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        if(savedInstanceState==null){

            //membuat object/variabel dari class BodyPartsFragment
            BodyPartFragment bodyPart;
            FragmentManager fm = getSupportFragmentManager();

            bodyPart = new BodyPartFragment();
            //mengisi body part dengan gambar yang telah didapat dari BodyImageAssets dengan mengambil geter dari BodyImage Assets
            bodyPart.setImgId(BodyImageAssets.getHeads());
            bodyPart.setIndexImg(0);

            //menampilkan fragment ke dalam activity
            fm.beginTransaction().add(R.id.headsContainer,bodyPart).commit();

            //mengisi body part dengan gambar yang telah didapat dari BodyImageAssets dengan mengambil geter dari BodyImage Assets
            bodyPart = new BodyPartFragment();
            bodyPart.setImgId(BodyImageAssets.getBodies());
            bodyPart.setIndexImg(0);

            //menampilkan fragment ke dalam activity
            fm.beginTransaction().add(R.id.bodiesContainer, bodyPart).commit();


        }
    }
}
