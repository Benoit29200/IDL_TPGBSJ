package suivi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuiviAnnuel implements Serializable {
	
	protected List<SuiviMensuel> lesMois;
	
	public SuiviAnnuel() {
		lesMois = new ArrayList<SuiviMensuel>();
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
	}

	public double LireTemperature(int mois, int jour, int heure,int minute) {
		return lesMois.get(mois).LireTemperature(jour,heure,minute);
	}

	public void AjoutNouvelleMesure(int mois, int jour, int heure,int minute,double uneTemperature) {
		lesMois.get(mois).AjoutNouvelleMesure(jour, heure, minute, uneTemperature);
	}
	
	public double TemperatureMoyenne() {
		double i = 0.0;
		int j = 0;
		for (SuiviMensuel s : lesMois) {
			 i+=s.TemperatureMoyenne();
			 j++;
		}
		return (i/j);
	}
	
	public double TemperatureMoyenne(int mois) {
		return lesMois.get(mois).TemperatureMoyenne();
	}

	public double TemperatureMoyenne(int mois,int jour) {
		return lesMois.get(mois).TemperatureMoyenne(jour);
	}
	
	public double TemperatureMoyenne(int mois, int jour, int heure) {
		return lesMois.get(mois).TemperatureMoyenne(jour,heure);
	}
}
