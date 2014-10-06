package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.Event;
import edu.esprit.fotocommunity.ejb.entities.Photo;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;
import edu.esprit.fotocommunity.ejb.entities.Workshop;
import edu.esprit.fotocommunity.ejb.services.EventsMgmRemote;
import edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote;
import edu.esprit.fotocommunity.ejb.services.UsersMgmRemote;
import edu.esprit.fotocommunity.ejb.services.WorkshopsMgmRemote;



public class WorkshopsBusinessDelegate {
	
	
//ajout d'un evenement
	public static void ApproveWorkshop(Workshop w) {

		WorkshopsMgmRemote workshopsMgmRemote = (WorkshopsMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/WorkshopsMgm!edu.esprit.fotocommunity.ejb.services.WorkshopsMgmRemote");

		workshopsMgmRemote.addWorkshop(w);
	}
	


// récupération d'un evenement selon son id	
	public static Workshop findWorkshop(int idWorkshop) {

		WorkshopsMgmRemote workshopsMgmRemote = (WorkshopsMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/WorkshopsMgm!edu.esprit.fotocommunity.ejb.services.WorkshopsMgmRemote");

		return workshopsMgmRemote.findWorkshop(idWorkshop);
	}
	
	
//Suppression d'un evenement
	public static void deleteWorkshop (Workshop w) {

		WorkshopsMgmRemote workshopsMgmRemote = (WorkshopsMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/WorkshopsMgm!edu.esprit.fotocommunity.ejb.services.WorkshopsMgmRemote");

		workshopsMgmRemote.deleteWorkshop(w);
	}
	

// récupration de tous les evènements de la plateforme
	public static List<Workshop> findAllWorkshops() {

		WorkshopsMgmRemote workshopsMgmRemote = (WorkshopsMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/WorkshopsMgm!edu.esprit.fotocommunity.ejb.services.WorkshopsMgmRemote");

		 return workshopsMgmRemote.findAllWorkshops();
	}
	
}
