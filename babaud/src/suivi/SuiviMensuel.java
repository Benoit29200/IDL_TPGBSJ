package suivi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuiviMensuel implements Serializable {
	
	protected List<SuiviJournalier> lesJours;
	
	public SuiviMensuel() {
		lesJours = new ArrayList<SuiviJournalier>();
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());
	}

	public double LireTemperature(int jour, int heure,int minute) {
		return lesJours.get(jour).LireTemperature(heure,minute);
	}

	public void AjoutNouvelleMesure(int jour, int heure,int minute, double uneTemperature) {
		lesJours.get(jour).AjoutNouvelleMesure(heure,minute, uneTemperature);
	}
}
