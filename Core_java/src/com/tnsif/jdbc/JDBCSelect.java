package com.tnsif.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        // Step 2: Load and register the driver
        Class.forName("org.postgresql.Driver");
        System.out.println("Load and register completed");

        // Step 3: Establish the connection
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/Book",
                "postgres",
                "root"
        );

        System.out.println("Connection done");

        // Step 4: Create statement
        Statement st = conn.createStatement();
        System.out.println("Created the statement");

        // Step 5: Execute the query
        String strselect =
                "SELECT bookid, bookname, bookprice FROM books";

        System.out.println("The SQL statement: " + strselect);
        System.out.println("Execute the query");

        // Step 6: Process the result
        ResultSet rst = st.executeQuery(strselect);

        System.out.println("The records are:");

        int rowcount = 0;

        while (rst.next()) {

            int bookid1 = rst.getInt("bookid");
            String bookname1 = rst.getString("bookname");
            int bookprice1 = rst.getInt("bookprice");

            System.out.println(
                    bookid1 + " " + bookname1 + " " + bookprice1
            );

            ++rowcount;
        }

        System.out.println("Total rows: " + rowcount);

        // Close resources
        rst.close();
        st.close();
        conn.close();
    }
}