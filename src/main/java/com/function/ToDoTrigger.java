package com.function;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.sql.annotation.SQLTrigger;
import com.function.common.SqlChangeToDoItem;
import com.google.gson.Gson;

import java.util.logging.Level;

public class ToDoTrigger {
    @FunctionName("ToDoTrigger")
    public void run(
            @SQLTrigger(
                name = "ToDoItems",
                tableName = "[dbo].[ToDo]",
                connectionStringSetting = "SqlConnectionString")
                SqlChangeToDoItem[] changes,
            ExecutionContext context) {

        context.getLogger().log(Level.INFO, "SQL Changes: " + new Gson().toJson(changes));
    }
}