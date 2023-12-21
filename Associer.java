package metier.liu.projet2024;

public class Associer {

	public int ID_auteur ;
	public int ID_bib;
	public Associer(int idAuteur, int idBibliotheque) {
		super();
		this.ID_auteur = idAuteur;
		this.ID_bib = idBibliotheque;
	}
	public int getID_auteur() {
		return ID_auteur;
	}
	public void setID_auteur(int iD_auteur) {
		ID_auteur = iD_auteur;
	}
	public int getID_bib() {
		return ID_bib;
	}
	public void setID_bib(int iD_bib) {
		ID_bib = iD_bib;
	}
	@Override
	public String toString() {
		return "Associer [ID_auteur=" + ID_auteur + ", ID_bib=" + ID_bib + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

