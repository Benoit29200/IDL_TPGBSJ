package controle;
public class DriverCapteur {

	protected Simulateur leSimulateur;

	public DriverCapteur(Simulateur leSimulateur) {
		this.leSimulateur = leSimulateur;
		System.out.println("");
	}

  public double LireTemperature() {
    return leSimulateur.LireTemperature();
  }
}
