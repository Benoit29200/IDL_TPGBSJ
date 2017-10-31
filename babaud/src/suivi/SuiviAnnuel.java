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
}
