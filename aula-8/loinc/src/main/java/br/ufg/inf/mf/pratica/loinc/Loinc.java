package br.ufg.inf.mf.pratica.loinc;

public class Loinc {

	private String loincNum;

	private String component;

	private String property;

	private String timeAspct;

	private String systems;

	private String scaleTyp;

	private String methodTyp;

	private String classe;

	private int classType;

	private String longCommonName;

	private String shortName;

	private String externalCopyrightNotice;

	private String status;

	private String versionFirstReleased;

	private String versionLastChanged;

	public Loinc() {
		super();
	}

	public Loinc(String loincNum, String component, String property, String timeAspct, String systems, String scaleTyp,
			String methodTyp, String classe, int classType, String longCommonName, String shortName,
			String externalCopyrightNotice, String status, String versionFirstReleased, String versionLastChanged) {
		super();
		this.loincNum = loincNum;
		this.component = component;
		this.property = property;
		this.timeAspct = timeAspct;
		this.systems = systems;
		this.scaleTyp = scaleTyp;
		this.methodTyp = methodTyp;
		this.classe = classe;
		this.classType = classType;
		this.longCommonName = longCommonName;
		this.shortName = shortName;
		this.externalCopyrightNotice = externalCopyrightNotice;
		this.status = status;
		this.versionFirstReleased = versionFirstReleased;
		this.versionLastChanged = versionLastChanged;
	}

	public String getLoincNum() {
		return loincNum;
	}

	public void setLoincNum(String loincNum) {
		this.loincNum = loincNum;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getTimeAspct() {
		return timeAspct;
	}

	public void setTimeAspct(String timeAspct) {
		this.timeAspct = timeAspct;
	}

	public String getSystems() {
		return systems;
	}

	public void setSystems(String systems) {
		this.systems = systems;
	}

	public String getScaleTyp() {
		return scaleTyp;
	}

	public void setScaleTyp(String scaleTyp) {
		this.scaleTyp = scaleTyp;
	}

	public String getMethodTyp() {
		return methodTyp;
	}

	public void setMethodTyp(String methodTyp) {
		this.methodTyp = methodTyp;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getClassType() {
		return classType;
	}

	public void setClassType(int classType) {
		this.classType = classType;
	}

	public String getLongCommonName() {
		return longCommonName;
	}

	public void setLongCommonName(String longCommonName) {
		this.longCommonName = longCommonName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getExternalCopyrightNotice() {
		return externalCopyrightNotice;
	}

	public void setExternalCopyrightNotice(String externalCopyrightNotice) {
		this.externalCopyrightNotice = externalCopyrightNotice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVersionFirstReleased() {
		return versionFirstReleased;
	}

	public void setVersionFirstReleased(String versionFirstReleased) {
		this.versionFirstReleased = versionFirstReleased;
	}

	public String getVersionLastChanged() {
		return versionLastChanged;
	}

	public void setVersionLastChanged(String versionLastChanged) {
		this.versionLastChanged = versionLastChanged;
	}
}
