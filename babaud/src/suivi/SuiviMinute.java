package suivi;

import java.io.Serializable;

public class SuiviMinute implements Serializable {
	
	protected double temperatureMesuree = -50.0;
	
	public SuiviMinute() {
	}
		
	public double LireTemperature() {
		return temperatureMesuree;
	}

	public void AjoutNouvelleMesure(double uneTemperature) {
		temperatureMesuree = uneTemperature;
	}
	
	public double TemperatureMoyenne() {
		return temperatureMesuree;
	}
	
}
