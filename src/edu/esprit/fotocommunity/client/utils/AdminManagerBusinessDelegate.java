package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.AdminManager;
import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;
import edu.esprit.fotocommunity.ejb.services.AdminMgmRemote;
import edu.esprit.fotocommunity.ejb.services.UsersMgmRemote;



public class AdminManagerBusinessDelegate {
	
	
//ajout d'un admin manager
	public static void addAdmin(AdminManager admin) {

		AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		adminMgmRemote.addAdmin(admin);
	}
	

	
	

	
//mise à jour d'un admin manager
	public static void updateAdminManager(AdminManager admin) {

		AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		adminMgmRemote.updateAdmin(admin);
	}
	
	
// récupération d'un admin selon son id	
	public static AdminManager findAdminManager(int id) {

		AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		return adminMgmRemote.findbyId(id);
	}
	
	
//Suppression d'un basic user
	public static void deleteAdminManager (AdminManager admin) {

		AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		adminMgmRemote.deleteAdmin(admin);
	}
	
	
// récupration de tous les admin manager de la plateforme
	public static List<AdminManager> findAllAdminManagers() {

		AdminMgmRemote adminMgmRemote = (AdminMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/AdminMgm!edu.esprit.fotocommunity.ejb.services.AdminMgmRemote");

		 return adminMgmRemote.findAllAdmin();
	}
	
}
