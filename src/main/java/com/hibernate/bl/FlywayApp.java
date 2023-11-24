package com.hibernate.bl;

import org.flywaydb.core.Flyway;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FlywayApp implements Closeable {

    private Connection conn = null;

    private void fwMigration() {
        System.out.println("Flyway migration execute");

        Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:h2:./SpaceTravel", "sa", "")
                .load();

        flyway.migrate();
    }

    public FlywayApp init() throws SQLException {

        fwMigration();
        System.out.println("Migration completed");

        conn = DriverManager.getConnection("jdbc:h2:./SpaceTravel", "sa", "");

        return this;
    }

    @Override
    public void close() throws IOException {
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }
}