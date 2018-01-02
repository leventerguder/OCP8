package ch06._04.reviewQuestions;

import java.sql.SQLException;

public class QX19 {

	public void read() throws SQLException {
		try {
			readFromDatabase();
//		} catch (Exception e) {
//			throw e;
//		}
			
//		} catch (RuntimeException e) {
//			throw e;
//		}
			
//		} catch (SQLException e) {
//			throw e;
//		}
			
		} catch (SQLException | RuntimeException e) {
			throw e;
		}
	}

	private void readFromDatabase() throws SQLException {
	}
}
