package com.function;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.sql.annotation.SQLTrigger;

import java.util.logging.Level;

public class SqlTriggerBindingJava1 {
    // Visit https://aka.ms/sqltrigger to learn how to use this trigger binding
    @FunctionName("SqlTriggerBindingJava1")
    public void run(
            @SQLTrigger(
                    name = "changes",
                    tableName = "[dbo].[ToDo]",
                    connectionStringSetting = "SqlConnectionString")
            SqlChangeToDoItem[] changes,
            ExecutionContext context) {

        context.getLogger().log(Level.INFO, "SQL Changes: " + new Gson().toJson(changes));
    }

    static class SqlChangeToDoItem {
        private SqlChangeOperation Operation;
        private TodoItem Item;

        public SqlChangeToDoItem() {
        }

        public SqlChangeToDoItem(SqlChangeOperation Operation, TodoItem Item) {
            this.Operation = Operation;
            this.Item = Item;
        }

        public SqlChangeOperation getOperation() {
            return Operation;
        }

        public void setOperation(SqlChangeOperation Operation) {
            this.Operation = Operation;
        }

        public TodoItem getItem() {
            return Item;
        }

        public void setItem(TodoItem Item) {
            this.Item = Item;
        }
    }

    static enum SqlChangeOperation {
        @SerializedName("0")
        Insert,
        @SerializedName("1")
        Update,
        @SerializedName("2")
        Delete
    }

    class TodoItem {
        public String Id;
        public int order;
        public String title;
        public String url;
        public boolean completed;

        public TodoItem(String Id, int order, String title, String url, boolean completed) {
            this.Id = Id;
            this.order = order;
            this.title = title;
            this.url = url;
            this.completed = completed;
        }
    }
}
