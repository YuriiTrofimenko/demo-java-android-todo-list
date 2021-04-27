package org.tyaa.demo.java.android.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.tyaa.demo.java.android.todolist.models.Todo;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            List<Todo> todos = List.of(
                    Todo.builder()
                            .title("t1")
                            .description("d1")
                            .build(),
                    Todo.builder()
                            .title("t2")
                            .description("d2")
                            .build(),
                    Todo.builder()
                            .title("t3")
                            .description("d3")
                            .build()
            );
            ArrayAdapter<Todo> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, todos);
            ((ListView)findViewById(R.id.todoListView))
                    .setAdapter(adapter);
            // adapter.notifyDataSetChanged();
        // }
    }
}