package edu.esprit.fotocommunity.client.models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import edu.esprit.fotocommunity.client.utils.EventsBusinessDelegate;
import edu.esprit.fotocommunity.ejb.entities.Event;

public class EventTableModel extends AbstractTableModel {

	List<Event> subjectlist = new ArrayList<Event>();
	public String[] header={ "ID_Event","Place","Hour", "Nb_Speakers","Status","Topic","Nb_Places" };

	public EventTableModel() {
		subjectlist =EventsBusinessDelegate.findAllEvent();
		
		
	}

	
	
	@Override
	public int getRowCount() {
		return subjectlist.size();
	}

	@Override
	public int getColumnCount() {
		return header.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return subjectlist.get(rowIndex).getID();
		case 1:
			return subjectlist.get(rowIndex).getPLACE();
		case 2:
			return subjectlist.get(rowIndex).getHOUR();
		case 3:
			return subjectlist.get(rowIndex).getNbSpeakers();
		case 4:
			return subjectlist.get(rowIndex).getStatut();
		case 5:
			return subjectlist.get(rowIndex).getTOPIC();
			
		case 6:
			return subjectlist.get(rowIndex).getNbPlaces();
			

		default:
			return null;
		}
	}
	@Override 
	public String getColumnName(int column) {
		 switch (column) {
		 case 0:
				return "ID_Event";
			case 1:
				return "PLACE";
			case 2:
				return "HOUR";
			case 3:
				return "Nb_Speakers";
			case 4:
				return "Statut";
			case 5:
				return "TOPIC";
				
			case 6:
				return "Nb_Places";
				

			default:
				return null;
			}
	       
	    }

}
