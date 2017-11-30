package cs14;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {

		final ConnectAdapter con = new ConnectAdapter();
		try {
			System.out.println(con.isClosed());

			//      ConnectAdapter con2 = new ConnectAdapter();
			//      con =con2;
			System.out.println(con.isClosed());
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
