package com.example.johnson.gridviewassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewById gives the layout of the gridView
        //setAdapter is called and it allows images to be displayed as items
        GridView gV = (GridView) findViewById(R.id.gridview);
        gV.setAdapter(new ImageChange(this));


        //When the user clicks on one of the items
        //it will display a message telling them how many stars are on the image
        gV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int positionID, long id) {
                if (positionID == 0) {
                    Toast.makeText(MainActivity.this, " No Dragon Ball Here", Toast.LENGTH_SHORT).show();
                    //Quit Option
                } else if (positionID == 8) {
                    finish();
                    System.exit(0);
                }
                else{
                    Toast.makeText(MainActivity.this, positionID + " Star Dragon Ball", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
