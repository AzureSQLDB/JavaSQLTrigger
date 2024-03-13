# Java SQL Trigger for Azure SQL Bindings

This sample contains an Azure SQL Bindings Trigger for Azure Functions. You can create a code space on this repository to fully test and use this trigger function all with a local SQL database.

## How to use this repository

1. Start by creating a codespace on this repository (feel free to fork). 
2. Once the code space is up, create a database using the steps outlined in the next section.
3. With the ADO.NET connect string, replace the CONNECT_STRING placeholder in the **local.settings.json** file
4. Press F5 to run the local function
5. Insert a row into the database table with the T-SQL statements in the db_objects.sql file

 
### How to install go-sqlcmd for local database development

```BASH
curl https://packages.microsoft.com/keys/microsoft.asc | sudo tee /etc/apt/trusted.gpg.d/microsoft.asc
sudo add-apt-repository "$(wget -qO- https://packages.microsoft.com/config/ubuntu/20.04/prod.list)"
sudo apt-get update
sudo apt-get install sqlcmd
```

then, run the following commands:

to create the database:

```BASH
sqlcmd create mssql -u devDB --accept-eula
```

to see the connect string

```BASH
sqlcmd config connection-strings
```

Once you have the ADO.NET connect string, replace the CONNECT_STRING placeholder in the **local.settings.json** file

### Additional Resources

- [AzureSQL Bindings Overview Documentation](https://learn.microsoft.com/azure/azure-functions/functions-bindings-azure-sql?tabs=in-process%2Cextensionv4&pivots=programming-language-csharp)
- [SQL Trigger Binding Documentation](https://learn.microsoft.com/azure/azure-functions/functions-bindings-azure-sql-trigger?tabs=isolated-process%2Cportal&pivots=programming-language-java)
- [Azure SQL Bindings Samples Repository](https://github.com/Azure/azure-functions-sql-extension/tree/main/samples)https://github.com/Azure/azure-functions-sql-extension/tree/main/samples)
