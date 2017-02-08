package com.example.alex.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import static com.example.alex.intentdemo.utils.Utils.AGE_MSG_KEY;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText editText1;
    private ListView lsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsView=(ListView)findViewById(R.id.ls_view1_ma1);

        final String[] myItems = getResources().getStringArray(R.array.my_itm_lst);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myItems);
        lsView.setAdapter(adapter);

        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                          @Override
                                          public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                                              Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                              intent.putExtra(AGE_MSG_KEY, "Item is: "+ myItems[i]);
                                              startActivity(intent);

                                          }
                                      });


        editText1 = (EditText) findViewById(R.id.edttxt_ma1);
        btn1=(Button)findViewById(R.id.btn1_ma1);
        btn1.setOnClickListener(new Mylstnr());
    }

    class Mylstnr implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra(AGE_MSG_KEY, "Age is: "+ editText1.getText());
            startActivity(intent);
        }
    }
}
