package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.Photo;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;
import edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote;
import edu.esprit.fotocommunity.ejb.services.UsersMgmRemote;



public class PhotosBusinessDelegate {
	
	
//ajout d'une photo
	public static void addBasicUser(Photo pic) {

		PhotosMgmRemote photoMgmRemote = (PhotosMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/PhotosMgm!edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote");

		photoMgmRemote.addPhoto(pic);
	}
	

//mise à jour d'une photo
	public static void updatePhoto(Photo pic) {

		PhotosMgmRemote photoMgmRemote = (PhotosMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/PhotosMgm!edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote");

		photoMgmRemote.updatePhot(pic);
	}
	
	
	
	
// récupération d'une photo selon son id	
	public static Photo findPhoto(int idPhoto) {

		PhotosMgmRemote photoMgmRemote = (PhotosMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/PhotosMgm!edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote");

		return photoMgmRemote.findPhoto(idPhoto);
	}
	
	
//Suppression d'une photo
	public static void deletePhoto (Photo pic) {

		PhotosMgmRemote photoMgmRemote = (PhotosMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/PhotosMgm!edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote");

		photoMgmRemote.deletePhoto(pic);
	}
	

// récupration de toutes les photos qui se trouvent dans la plateforme
	public static List<Photo> findAllPhotos() {

		PhotosMgmRemote photoMgmRemote = (PhotosMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/PhotosMgm!edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote");

		 return photoMgmRemote.findAllPhoto();
	}
	
}
