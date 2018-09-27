package com.example.asus.afinal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 22/09/2018.
 */

public class BodyPartFragment extends Fragment {
    //agar bisa dirotate bentuk gambarnya
    private static String TAG = "Body Parts Fragment";
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";

    //deklarasi variable
    private List<Integer> ImgId;
    private Integer indexImg;
    public BodyPartFragment() {

    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if(savedInstanceState!=null){
            ImgId=savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            indexImg=savedInstanceState.getInt(LIST_INDEX);
        }

        //membuat tampilan fragment layout
        View rootView = inflater.inflate(R.layout.fragment_layout, container, false);
        //menyatakan bahwa gambar akan diletakkan pada id imageViewFragment
        final ImageView imageViewVar = (ImageView) rootView.findViewById(R.id.imageViewFragment);
        // membuat objek dari resource
        BodyImageAssets varAssets = new BodyImageAssets();
        // mengisi id: imageView dengan gambar dari resource
        //imageViewVar.setImageResource(varAssets.getHeads().get(0));
        imageViewVar.setImageResource(ImgId.get(indexImg));
        //membuat overide metode agar gambar bisa ganti saat di klik dengan cara merubah index dari gambar yang terdapat pada ImageView
        imageViewVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(indexImg<ImgId.size()-1){
                    indexImg++;
                }
                else {
                    indexImg=0;
                }
                imageViewVar.setImageResource(ImgId.get(indexImg));
            }
        });
        return rootView;


    }

    //bagian ini agar saat hp di rotate tidak terjadi error
    @Override
    public void onSaveInstanceState(@Nullable Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST,(ArrayList<Integer>) ImgId);
        currentState.putInt(LIST_INDEX,indexImg);
    }

    //membuat setter Imgid
    public void setImgId(List<Integer> imgId){

        ImgId = imgId;
    }

    //membuat setter Indextimg
    public void setIndexImg(Integer indexImg){

        this.indexImg = indexImg;
    }

}
