package cs14;

import java.sql.SQLException;
/**
 *
 * check this one https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSetMetaData.html
 *
 */

public class ResultSetMetaDataAdapter extends ResultMetaData {

	// link it using function getMetaData in ResultSet
	// get table name men el url elly fei ResultSet(sent in getMetaData)

	@Override
	public int getColumnCount() throws SQLException {
		// TODO Auto-generated method stub
		return super.getColumnCount();
	}

	@Override
	public String getColumnLabel(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getColumnLabel(arg0);
	}

	@Override
	public String getColumnName(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getColumnName(arg0);
	}

	@Override
	public int getColumnType(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getColumnType(arg0);
	}

	@Override
	public String getTableName(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		return super.getTableName(arg0);
	}
}
