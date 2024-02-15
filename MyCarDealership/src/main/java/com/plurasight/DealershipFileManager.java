package com.plurasight;

import org.apache.commons.dbcp2.BasicDataSource;

public class DealershipFileManager {

    public void database()
    {
        String databaseUrl = "jdbc:mysql://localhost:3306/dealership";
        String userName = "root";
        String password = "YU_oppdivide!20";
         dataSource = new BasicDataSource()
        {{
            setUrl(databaseUrl);
            setUsername(userName);
            setPassword(password);
        }};
    }
    public String getDealership() {

    }
    public String saveDealership(Dealership dealership) {
        return null;

    }
}
