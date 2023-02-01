package dol;

public class person {

	private String Names;
	private String lNames;
	private String Id;
	private Double INSS;
	private Double IR;
	private Double ToDedud;
	
	public person() {
		super();
	}

	public person(String names, String lNames, String id, Double iNSS, Double iR, Double toDedud) {
		super();
		Names = names;
		this.lNames = lNames;
		Id = id;
		INSS = iNSS;
		IR = iR;
		ToDedud = toDedud;
	}

	public String getNames() {
		return Names;
	}

	public void setNames(String names) {
		Names = names;
	}

	public String getlNames() {
		return lNames;
	}

	public void setlNames(String lNames) {
		this.lNames = lNames;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Double getINSS() {
		return INSS;
	}

	public void setINSS(Double iNSS) {
		INSS = iNSS;
	}

	public Double getIR() {
		return IR;
	}

	public void setIR(Double iR) {
		IR = iR;
	}

	public Double getToDedud() {
		return ToDedud;
	}

	public void setToDedud(Double toDedud) {
		ToDedud = toDedud;
	}
	
	
	
}
