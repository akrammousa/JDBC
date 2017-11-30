package cs14;

import java.net.URL;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * check this one https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html
 *
 */

public class ResultSetAdapter extends Result {

	private URL url;

	// data structure to put table data

	@Override
	public boolean absolute(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void afterLast() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeFirst() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int findColumn(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean first() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getInt(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getInt(arg0);
	}

	@Override
	public int getInt(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getInt(arg0);
	}

	/**
	 * Retrieves the number, types and properties of this ResultSet object's columns.
	 *
	 * Returns: the description of this ResultSet object's columns Throws: SQLException - if a
	 * database access error occurs or this method is called on a closed result set
	 */
	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		// TODO Auto-generated method stub
		return super.getMetaData();
	}

	@Override
	public Object getObject(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getObject(arg0);
	}

	@Override
	public Statement getStatement() throws SQLException {
		// TODO Auto-generated method stub
		return super.getStatement();
	}

	@Override
	public String getString(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getString(arg0);
	}

	@Override
	public String getString(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getString(arg0);
	}

	@Override
	public boolean isAfterLast() throws SQLException {
		// TODO Auto-generated method stub
		return super.isAfterLast();
	}

	@Override
	public boolean isBeforeFirst() throws SQLException {
		// TODO Auto-generated method stub
		return super.isBeforeFirst();
	}

	@Override
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return super.isClosed();
	}

	@Override
	public boolean isFirst() throws SQLException {
		// TODO Auto-generated method stub
		return super.isFirst();
	}

	@Override
	public boolean isLast() throws SQLException {
		// TODO Auto-generated method stub
		return super.isLast();
	}

	@Override
	public boolean last() throws SQLException {
		// TODO Auto-generated method stub
		return super.last();
	}

	@Override
	public boolean next() throws SQLException {
		// TODO Auto-generated method stub
		return super.next();
	}

	@Override
	public boolean previous() throws SQLException {
		// TODO Auto-generated method stub
		return super.previous();
	}

}
