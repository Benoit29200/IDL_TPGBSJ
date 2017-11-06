package suivi;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SuiviChauffage implements Serializable {
	
	protected Map<Integer, SuiviAnnuel> lesAnnees = new HashMap<>();
	
	public SuiviChauffage() {
	}

	public double LireTemperature(int annee, int mois, int jour, int heure,int minute) {
		return lesAnnees.get(annee).LireTemperature(mois,jour,heure,minute);
	}

	public void AjoutNouvelleMesure(int annee, int mois, int jour, int heure,int minute,double uneTemperature) {
		if (lesAnnees.get(annee)==null) {
			SuiviAnnuel unSuiviAnnuel = new SuiviAnnuel();
			lesAnnees.put(annee, unSuiviAnnuel);
		}
		lesAnnees.get(annee).AjoutNouvelleMesure(mois, jour, heure, minute, uneTemperature);
	}
}
