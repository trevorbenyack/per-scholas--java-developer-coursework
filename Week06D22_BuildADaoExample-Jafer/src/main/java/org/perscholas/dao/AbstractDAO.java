package org.perscholas.dao;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.logging.Logger;

@Log
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public abstract class AbstractDAO {

    // register driver
    String URL = "jdbc:mariadb://localhost:3307/classicmodels";
    String USER = "root";
    String PASS = "root";

    @NonFinal
    protected Connection conn = null;
    @NonFinal
    protected PreparedStatement ps = null;
    @NonFinal
    protected ResultSet rs = null;




    // connect method

    public void connect(){
        try {
            conn = DriverManager.getConnection(URL,USER, PASS);
            boolean connected = conn.isValid(10);

            log.info(String.valueOf(conn.isValid(10)));
        } catch (SQLException e) {
            System.out.printf("%s : %s : %s", URL,USER,PASS);
            e.printStackTrace();
        }
    }


    // close method
    public void dispose(){
        try{
            if(!rs.equals(null))
                if(!rs.isClosed())
                    rs.close();

            if(!ps.equals(null))
                if(!ps.isClosed())
                    ps.close();

            if(!conn.equals(null))
                if(!conn.isClosed())
                    conn.close();

        }catch(SQLException e){
            System.out.println("Problem with rs or ps or conn or all !!");
            log.severe("Problem with rs or ps or conn or all !!");
            e.printStackTrace();
        }

    }
}
