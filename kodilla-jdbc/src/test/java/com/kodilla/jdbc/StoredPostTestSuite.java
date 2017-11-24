package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class StoredPostTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
//Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When

        String sqlProcedure = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedure);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException{

        //given
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();
        String booksClear = "UPDATE BOOKS SET BESTSELLER= null";
        statement.executeUpdate(booksClear);

        //when
        String setBestseller = "CALL UpdateBestseller()";
        statement.execute(setBestseller);

        //given
        String fetchBestseller = "SELECT BESTSELLER FROM BOOKS";
        ResultSet result = statement.executeQuery(fetchBestseller);
        Boolean bs = null;
        int test = 0;
        while(result.next()) {
            bs = result.getBoolean("BESTSELLER");
            if(bs == true) {
                test += 1;
            }
        }
        assertTrue(test > 0);
    }
}
