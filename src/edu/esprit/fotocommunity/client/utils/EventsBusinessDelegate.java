package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.Event;
import edu.esprit.fotocommunity.ejb.entities.Photo;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;
import edu.esprit.fotocommunity.ejb.services.EventsMgmRemote;
import edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote;
import edu.esprit.fotocommunity.ejb.services.UsersMgmRemote;



public class EventsBusinessDelegate {
	
	
//ajout d'un evenement
	public static void ApproveEvent(Event e) {

		EventsMgmRemote eventsMgmRemote = (EventsMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/EventsMgm!edu.esprit.fotocommunity.ejb.services.EventsMgmRemote");

		eventsMgmRemote.addEvent(e);
	}
	


// récupération d'un evenement selon son id	
	public static Event findPhoto(int idEvent) {

		EventsMgmRemote eventsMgmRemote = (EventsMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/EventsMgm!edu.esprit.fotocommunity.ejb.services.EventsMgmRemote");

		return eventsMgmRemote.findEvent(idEvent);
	}
	
	
//Suppression d'un evenement
	public static void deleteEvent (Event e) {

		EventsMgmRemote eventsMgmRemote = (EventsMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/EventsMgm!edu.esprit.fotocommunity.ejb.services.EventsMgmRemote");

		eventsMgmRemote.deleteEvent(e);
	}
	

// récupration de tous les evènements de la plateforme
	public static List<Event> findAllEvent() {

		EventsMgmRemote eventsMgmRemote = (EventsMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/EventsMgm!edu.esprit.fotocommunity.ejb.services.EventsMgmRemote");

		 return eventsMgmRemote.findAllEvent();
	}
	
}
