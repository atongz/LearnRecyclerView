package hojin.znp.learnrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7", "Person 8", "Person 9"));
    private Integer[] imageDataList = {R.drawable.media_thumbnail_list_01_select, R.drawable.media_thumbnail_list_02_select,
            R.drawable.media_thumbnail_list_03_select, R.drawable.media_thumbnail_list_04_select, R.drawable.media_thumbnail_list_05_select, R.drawable.media_thumbnail_list_06_select,
            R.drawable.media_thumbnail_list_07_select, R.drawable.media_thumbnail_list_08_select};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        //recyclerView.getLayoutManager().scrollToPosition(Integer.MAX_VALUE / 2);
        //CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, personNames);
        //recyclerView.setAdapter(customAdapter);
        ImageAdapter imageAdapter = new ImageAdapter(MainActivity.this, imageDataList);
        recyclerView.setAdapter(imageAdapter);
        String message;
        message = "asaas";
    }
}
