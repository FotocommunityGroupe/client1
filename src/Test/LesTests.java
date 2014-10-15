package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.esprit.fotocommunity.client.utils.EventsBusinessDelegate;
import edu.esprit.fotocommunity.client.utils.UsersBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.Event;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;

public class LesTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BasicUser bc=new BasicUser();
		bc.setID_USER(1);
		bc.setNAME("oumayma");
		UsersBusinessDelegate.addBasicUser(bc);
	}
	
	@Test
	public void test1() {
		PremiumUser bc=new PremiumUser();
		bc.setID_USER(2);
		bc.setNAME("fatma");
		UsersBusinessDelegate.addBasicUser(bc);
	}
	@Test
	public void addEvent(){
		Event e=new Event();
		e.setID(2);
		e.setHOUR("9h00");
		e.setNbPlaces(300);
		e.setNbSpeakers(10);
		e.setPLACE("Hammamet");
		e.setStatut("No");
		
		EventsBusinessDelegate.ApproveEvent(e);

	}
	@Test
	public void showEvents(){
		
		System.out.println(EventsBusinessDelegate.findAllEvent().size());
	
	}
	}

