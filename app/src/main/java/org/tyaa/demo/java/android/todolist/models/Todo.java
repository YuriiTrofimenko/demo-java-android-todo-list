package org.tyaa.demo.java.android.todolist.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Todo {
    private static Long lastId = 0L;

    public Todo(String title, String description) {
        this.id = ++lastId;
        this.title = title;
        this.description = description;
    }

    private Long id;
    private String title;
    private String description;
    private Boolean done = false;
    // private Date date;
}
