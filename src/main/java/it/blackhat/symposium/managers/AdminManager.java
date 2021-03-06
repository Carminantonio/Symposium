package it.blackhat.symposium.managers;

import it.blackhat.symposium.models.Admin;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Diego Avella
 */
public interface AdminManager {

    /**
     * Find an admin given username and password
     * @param username the admin's username
     * @param password tha admin's password
     * @return an instance of admin 
     * @throws SQLException if db errors occurred
     */
    Optional<Admin> findAdmin(String username, String password) throws SQLException;

    /**
     * Create a new admin
     * @param admin the requested admin
     * @return the new created admin
     * @throws SQLException if db errors occurred
     */
    Optional<Admin> createAdmin(Admin admin) throws SQLException;

    /**
     * Update an admin
     * @param admin the updated admin
     * @return the number of updated rows
     * @throws SQLException if db error occurred
     */
    int updateAdmin(Admin admin) throws SQLException;

    /**
     * Delete an admin 
     * @param admin the adin to delete
     * @return the number of deleted rows
     * @throws SQLException if db error occurred
     */
    int deleteAdmin(Admin admin) throws SQLException;

    /**
     * List all admins
     * @return the list of the admins
     * @throws SQLException if db errors occurred
     */
    List<Admin> findAllAdmins() throws SQLException;

}
