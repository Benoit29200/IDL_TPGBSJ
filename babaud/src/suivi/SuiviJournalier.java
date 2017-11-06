package suivi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuiviJournalier implements Serializable {
	
	protected List<SuiviHoraire> lesHeures;
	
	public SuiviJournalier() {
		lesHeures = new ArrayList<SuiviHoraire>();
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
	}

	public double LireTemperature(int heure,int minute) {
		return lesHeures.get(heure).LireTemperature(minute);
	}

	public void AjoutNouvelleMesure(int heure,int minute, double uneTemperature) {
		lesHeures.get(heure).AjoutNouvelleMesure(minute,uneTemperature);
	}
	
	public double TemperatureMoyenne() {
		double i = 0.0;
		int j = 0;
		for (SuiviHoraire s : lesHeures) {
			 i+=s.TemperatureMoyenne();
			 j++;
		}
		return (i/j);
	}
	
	public double TemperatureMoyenne(int heure) {
		return lesHeures.get(heure).TemperatureMoyenne();
	}
}
