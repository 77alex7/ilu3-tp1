package cartes;

public class JeuDeCartes {
	private Configuration[]configuration= new Configurations[19];
	
	
	private static class Configuration{
		private int nbExemplaires;
		private Carte carte;
		private Configuration (Carte carte, int nbExemplaires) {
			this.nbExemplaires=nbExemplaires;
			this.carte=carte;
		}
	}

}
