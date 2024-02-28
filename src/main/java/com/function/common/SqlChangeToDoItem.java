package com.function.common;

import com.function.ToDoItem;

public class SqlChangeToDoItem {
    public ToDoItem Item;
    public SqlChangeOperation Operation;

    public SqlChangeToDoItem() {
    }

    public SqlChangeToDoItem(ToDoItem Item, SqlChangeOperation Operation) {
        this.Item = Item;
        this.Operation = Operation;
    }
}