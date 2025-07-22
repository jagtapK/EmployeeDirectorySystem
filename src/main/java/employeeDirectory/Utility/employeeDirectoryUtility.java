package employeeDirectory.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class employeeDirectoryUtility {

	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {
		if (factory == null) {
			factory = new Configuration().configure("employee.cfg.xml").buildSessionFactory();
		}
		return factory;
	}

}
