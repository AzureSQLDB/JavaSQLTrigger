# Java SQL Trigger for Azure SQL Bindings



## How to install go-sqlcmd for local database development

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
