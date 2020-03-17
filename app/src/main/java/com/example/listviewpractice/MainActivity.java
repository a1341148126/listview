package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data={
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990"};

    private List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudent();//初始化天气数据

        final Intent intent=new Intent();
        intent.setClass(this,ShowActivity.class);
        final Bundle bundle=new Bundle();

        StudentAdapter adapter = new StudentAdapter(MainActivity.this, R.layout.item, studentList);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        //为ListView添加点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student =(Student) parent.getItemAtPosition(position);
                bundle.putString("cquId",student.getCquId());
                bundle.putInt("imageId",student.getImageId());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }



    private void initStudent(){

        for(int i=0;i<data.length;i++){
            Student stu=new Student(R.drawable.emoji_kids_01+i,data[i]);
            studentList.add(stu);
        }



    }
}
