package edu.esprit.fotocommunity.client.utils;

import java.util.List;

import edu.esprit.fotocommunity.ejb.entities.BasicUser;
import edu.esprit.fotocommunity.ejb.entities.Comment;
import edu.esprit.fotocommunity.ejb.entities.Event;
import edu.esprit.fotocommunity.ejb.entities.Photo;
import edu.esprit.fotocommunity.ejb.entities.PremiumUser;
import edu.esprit.fotocommunity.ejb.entities.WolrdUser;
import edu.esprit.fotocommunity.ejb.entities.Workshop;
import edu.esprit.fotocommunity.ejb.services.CommentMgmRemote;
import edu.esprit.fotocommunity.ejb.services.EventsMgmRemote;
import edu.esprit.fotocommunity.ejb.services.PhotosMgmRemote;
import edu.esprit.fotocommunity.ejb.services.UsersMgmRemote;
import edu.esprit.fotocommunity.ejb.services.WorkshopsMgmRemote;



public class CommentsBusinessDelegate {
	
	
//ajout d'un commentaire
	public static void AddComment(Comment c) {

		CommentMgmRemote commentMgmRemote = (CommentMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/CommentMgm!edu.esprit.fotocommunity.ejb.services.CommentMgmRemote");

		commentMgmRemote.addComment(c);
	}
	


// récupération d'un commentaire selon son id	
	public static Comment findComment(int idComment) {

		CommentMgmRemote commentMgmRemote = (CommentMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/CommentMgm!edu.esprit.fotocommunity.ejb.services.CommentMgmRemote");

		return commentMgmRemote.findComment(idComment);
	}
	
	
//Suppression d'un commentaire
	public static void deleteComment (Comment c) {

		CommentMgmRemote commentMgmRemote = (CommentMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/CommentMgm!edu.esprit.fotocommunity.ejb.services.CommentMgmRemote");

		commentMgmRemote.deleteComment(c);
	}
	

// récupration de tous les evènements de la plateforme
	public static List<Comment> findAllComments() {

		CommentMgmRemote commentMgmRemote = (CommentMgmRemote) ServiceLocator
				.getInstance()
				.lookupProxy("/edu.esprit.fotocommunity.ejb/CommentMgm!edu.esprit.fotocommunity.ejb.services.CommentMgmRemote");

		 return commentMgmRemote.findAllComment();
	}
	
}
