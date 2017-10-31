package suivi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuiviHoraire implements Serializable {
	
	protected List<SuiviMinute> lesMinutes;
	
	public SuiviHoraire() {
		lesMinutes = new ArrayList<SuiviMinute>();
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
	}
		
	public double LireTemperature(int minute) {
		return lesMinutes.get(minute).LireTemperature();
	}

	public void AjoutNouvelleMesure(int minute,double uneTemperature) {
		lesMinutes.get(minute).AjoutNouvelleMesure(uneTemperature);
	}
}
