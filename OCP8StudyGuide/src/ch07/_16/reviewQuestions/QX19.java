package ch07._16.reviewQuestions;

public class QX19 {

	private QX19() {
		super();
	}

	private static QX19 instance;

	public static synchronized QX19 getInstance() {
		if (instance == null)
			instance = new QX19();
		return instance;
	}

	//
	private int tickets;

	public int getTicketCount() {
		return tickets;
	}

	public void makeTicketsAvailable(int value) {
		tickets += value;
	}

	public void sellTickets(int value) {
		synchronized (this) { // k4 tickets -= value;
		}
	}
}
