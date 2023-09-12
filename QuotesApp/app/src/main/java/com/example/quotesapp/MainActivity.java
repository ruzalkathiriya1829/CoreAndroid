package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;

    ArrayList<Modal> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();

        //navigation or status bar colour change code

        Window w = this.getWindow();
        w.setStatusBarColor(getColor(R.color.black));

    }

    private void initview() {


        Modal m1 = new Modal();
        m1.setQuotesName("Happy");
        m1.setQuotesImg(R.drawable.happy);
        arrayList.add(m1);

        Modal m2 = new Modal();
        m2.setQuotesName("Emotions");
        m2.setQuotesImg(R.drawable.emotion);
        arrayList.add(m2);

        Modal m3 = new Modal();
        m3.setQuotesName("Love");
        m3.setQuotesImg(R.drawable.love);
        arrayList.add(m3);

        Modal m4 = new Modal();
        m4.setQuotesName("Success");
        m4.setQuotesImg(R.drawable.success);
        arrayList.add(m4);

        Modal m5 = new Modal();
        m5.setQuotesName("Birthday");
        m5.setQuotesImg(R.drawable.brithday);
        arrayList.add(m5);

        Modal m6 = new Modal();
        m6.setQuotesName("Friendship");
        m6.setQuotesImg(R.drawable.friend);
        arrayList.add(m6);

        Modal m7 = new Modal();
        m7.setQuotesName("Life");
        m7.setQuotesImg(R.drawable.life);
        arrayList.add(m7);

        Modal m8 = new Modal();
        m8.setQuotesName("Book");
        m8.setQuotesImg(R.drawable.book);
        arrayList.add(m8);

        Modal m9 = new Modal();
        m9.setQuotesName("Teachers");
        m9.setQuotesImg(R.drawable.teacher);
        arrayList.add(m9);

        Modal m10 = new Modal();
        m10.setQuotesName("Mother");
        m10.setQuotesImg(R.drawable.mother);
        arrayList.add(m10);

        Modal m11 = new Modal();
        m11.setQuotesName("Father");
        m11.setQuotesImg(R.drawable.father);
        arrayList.add(m11);

        Modal m12 = new Modal();
        m12.setQuotesName("Broken");
        m12.setQuotesImg(R.drawable.broken);
        arrayList.add(m12);

        Modal m13 = new Modal();
        m13.setQuotesName("Flower");
        m13.setQuotesImg(R.drawable.flower);
        arrayList.add(m13);

        Modal m14 = new Modal();
        m14.setQuotesName("Dream");
        m14.setQuotesImg(R.drawable.dream);
        arrayList.add(m14);

        Modal m15 = new Modal();
        m15.setQuotesName("Music");
        m15.setQuotesImg(R.drawable.music);
        arrayList.add(m15);

        Modal m16 = new Modal();
        m16.setQuotesName("Funny");
        m16.setQuotesImg(R.drawable.funny);
        arrayList.add(m16);

        Modal m17 = new Modal();
        m17.setQuotesName("Leadership");
        m17.setQuotesImg(R.drawable.leadership);
        arrayList.add(m17);

        Modal m18 = new Modal();
        m18.setQuotesName("Cousins");
        m18.setQuotesImg(R.drawable.cousins);
        arrayList.add(m18);

        Modal m19 = new Modal();
        m19.setQuotesName("God");
        m19.setQuotesImg(R.drawable.god);
        arrayList.add(m19);

        Modal m20 = new Modal();
        m20.setQuotesName("Gratitude");
        m20.setQuotesImg(R.drawable.gratitude);
        arrayList.add(m20);

        Modal m21 = new Modal();
        m21.setQuotesName("About Change");
        m21.setQuotesImg(R.drawable.change);
        arrayList.add(m21);

        Modal m22 = new Modal();
        m22.setQuotesName("Women");
        m22.setQuotesImg(R.drawable.women);
        arrayList.add(m22);

        Modal m23 = new Modal();
        m23.setQuotesName("Inspirational");
        m23.setQuotesImg(R.drawable.inspiration);
        arrayList.add(m23);

        Modal m24 = new Modal();
        m24.setQuotesName("Believe");
        m24.setQuotesImg(R.drawable.belive);
        arrayList.add(m24);



        QuotesCategoryInterface quotesCategoryInterface = new QuotesCategoryInterface() {
            @Override
            public void QuotesClick(String catrgoryname) {

//                Toast.makeText(MainActivity.this, "your categories is ==>"+catrgoryname, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, QuotesActivity.class);
                i.putExtra("catrgoryname", catrgoryname);
                startActivity(i);

            }
        };

        recyclerview = findViewById(R.id.recyclerview);

        GridLayoutManager manager = new GridLayoutManager(MainActivity.this,3,GridLayoutManager.VERTICAL,false);
        RecyclerviewArrayAdapter adapter = new RecyclerviewArrayAdapter(MainActivity.this,arrayList,quotesCategoryInterface);
        recyclerview.setLayoutManager(manager);
        recyclerview.setAdapter(adapter);


    }
}