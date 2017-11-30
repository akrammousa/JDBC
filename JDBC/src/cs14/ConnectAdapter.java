package cs14;

import java.sql.SQLException;
import java.sql.Statement;

public class ConnectAdapter extends Connect implements AutoCloseable {

	// url varaible
	// constructor to set url
	//constructor for statement pool

	/**
	 * Creates a Statement object for sending SQL statements to the database. SQL statements without
	 * parameters are normally executed using Statement objects. If the same SQL statement is executed
	 * many times, it may be more efficient to use a PreparedStatement object.
	 *
	 * Result sets created using the returned Statement object will by default be type
	 * TYPE_FORWARD_ONLY and have a concurrency level of CONCUR_READ_ONLY. The holdability of the
	 * created result sets can be determined by calling getHoldability().
	 *
	 * Returns: a new default Statement object Throws: SQLException - if a database access error
	 * occurs or this method is called on a closed connection
	 */

	@Override
	public Statement createStatement() throws SQLException {

		return null;
	}

	@Override
	public void close() throws SQLException {
		// return object to the pool
	}

}
