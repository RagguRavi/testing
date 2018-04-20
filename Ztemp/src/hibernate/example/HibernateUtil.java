package hibernate.example;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf;
	static
	{
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		StandardServiceRegistryBuilder ssr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		sf=cfg.buildSessionFactory(ssr.build());
	}
	
	static SessionFactory getSessionFactory()
	{
		return sf;
	}
	
}
