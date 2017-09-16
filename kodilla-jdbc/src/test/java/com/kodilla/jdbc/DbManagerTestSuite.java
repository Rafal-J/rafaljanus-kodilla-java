package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        DbManager dbManager = DbManager.getInstance();

        String sqlQueury = "SELECT U.FIRSTNAME, U.LASTNAME, P.USER_ID, COUNT(*) AS LICZBA_POSTÓW\n" +
                "FROM USERS U, POSTS P\n" +
                "WHERE U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*)>1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet sqlQueuryResult = statement.executeQuery(sqlQueury);

        int count = 0;

        List<UserProfile> userProfiles = new ArrayList<>();

        while(sqlQueuryResult.next()){
            System.out.println(sqlQueuryResult.getString("FIRSTNAME") + " " +
                    sqlQueuryResult.getString("LASTNAME") + " " +
                    sqlQueuryResult.getInt("LICZBA_POSTÓW"));

            userProfiles.add(new UserProfile(sqlQueuryResult.getString("FIRSTNAME"),
                    sqlQueuryResult.getString("LASTNAME"),
                    sqlQueuryResult.getInt("LICZBA_POSTÓW")));
            count++;
        }

        System.out.println(userProfiles.get(0).getLastName());

        Assert.assertTrue(count == 2);
        Assert.assertTrue(userProfiles.size() == 2);
    }
}