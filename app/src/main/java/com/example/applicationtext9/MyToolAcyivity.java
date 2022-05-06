package com.example.applicationtext9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyToolAcyivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_activity);
        final ListView listView = (ListView) findViewById(R.id.listview1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.ctype, android.R.layout.simple_list_item_checked);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String result = parent.getItemAtPosition(position).toString();
                if (position == 7) {
                    Intent intent = new Intent(MyToolAcyivity.this, ListenerActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("name", "由福建");
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else {
                    Toast.makeText(MyToolAcyivity.this, "您选择了第" + (position + 1) + "项",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
