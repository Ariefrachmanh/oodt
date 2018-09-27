package com.example.asus.afinal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 22/09/2018.
 */

public class BodyImageAssets {
    //Variabel untuk menjadikan gambar-gambar head menjadi satu bagian
    private static List<Integer> heads = new ArrayList<Integer>(){
        {
            add(R.drawable.a1);
            add(R.drawable.a2);
            add(R.drawable.a3);
            add(R.drawable.a4);
            add(R.drawable.a5);
            add(R.drawable.a6);
        }
    };

    //variable ini untuk menjadikan gambar-gambar body menjadi satu bagian
    private static List<Integer> bodies = new ArrayList<Integer>(){
        {
            add(R.drawable.b1);
            add(R.drawable.b2);
            add(R.drawable.b3);
        }
    };


    //getter digunakan untuk mengambil data dari object yang dibuat
    public static List<Integer> getHeads() {
        return heads;
    }

    public static List<Integer> getBodies() {
        return bodies;
    }

}
