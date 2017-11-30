package cs14;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;

public class DriveAdapter extends Drive {

	// 2D array to add properties and save them;
	// aktar men database wala??
	//constructor for pool connections

	/**
	 * Retrieves whether the driver thinks that it can open a connection to the given URL. Typically
	 * drivers will return true if they understand the sub-protocol specified in the URL and false if
	 * they do not. Parameters: url - the URL of the database Returns: true if this driver understands
	 * the given URL; false otherwise Throws: SQLException - if a database access error occurs or the
	 * url is null
	 */
	@Override
	public boolean acceptsURL(String arg0) throws SQLException {
		return false;
		// validates URL;
		// checking path handeled in DBMS

	}

	/**
	 * Attempts to make a database connection to the given URL. The driver should return "null" if it
	 * realizes it is the wrong kind of driver to connect to the given URL. This will be common, as
	 * when the JDBC driver manager is asked to connect to a given URL it passes the URL to each
	 * loaded driver in turn. //don't care
	 *
	 * The driver should throw an SQLException if it is the right driver to connect to the given URL
	 * but has trouble connecting to the database. // must handle
	 *
	 * The Properties argument can be used to pass arbitrary string tag/value pairs as connection
	 * arguments. Normally at least "user" and "password" properties should be included in the
	 * Properties object. // Ahmed Hamdy asked for path
	 *
	 * Note: If a property is specified as part of the url and is also specified in the Properties
	 * object, it is implementation-defined as to which value will take precedence. For maximum
	 * portability, an application should only specify a property once.
	 *
	 * Parameters: url - the URL of the database to which to connect info - a list of arbitrary string
	 * tag/value pairs as connection arguments. Normally at least a "user" and "password" property
	 * should be included. Returns: a Connection object that represents a connection to the URL
	 * Throws: SQLException - if a database access error occurs or the url is null // must handle
	 */
	@Override
	public Connection connect(String url, Properties arg1) throws SQLException {
		// check validation for URL
		// check properties
		// return invalid connection
		// return connection from pool
		return null;
	}

	/**
	 * Gets information about the possible properties for this driver.
	 *
	 * The getPropertyInfo method is intended to allow a generic GUI tool to discover what properties
	 * it should prompt a human for in order to get enough information to connect to a database. Note
	 * that depending on the values the human has supplied so far, additional values may become
	 * necessary, so it may be necessary to iterate though several calls to the getPropertyInfo
	 * method.
	 *
	 * Parameters: url - the URL of the database to which to connect info - a proposed list of
	 * tag/value pairs that will be sent on connect open Returns: an array of DriverPropertyInfo
	 * objects describing possible properties. This array may be an empty array if no properties are
	 * required. Throws: SQLException - if a database access error occurs
	 *
	 * DriverPropertyInfo(String name, String value) Constructs a DriverPropertyInfo object with a
	 * given name and value.
	 */
	@Override
	public DriverPropertyInfo[] getPropertyInfo(String arg0, Properties arg1) throws SQLException {
		return null;
		// return properties xml file
		// xml file contains path
	}
}
