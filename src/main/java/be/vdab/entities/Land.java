package be.vdab.entities;

public class Land {
	private final String landcode;
	private final int oppervlakte;

	public Land(String landcode, int oppervlakte) {
		this.landcode = landcode;
		this.oppervlakte = oppervlakte;
	}
	
	public int getOppervlakte() {
		return oppervlakte;
	}
}
