package EnumConcept;

public enum Enviorment {
	
	QA("qa"),
	STAGE("stage"),
	DEV("dev"),
	UAT("uat"),
	PROD("prod");

	private String envName;
	
	Enviorment(String envName) {
		this.envName = envName;
	}
	
	public String getEnvValue() {
		return this.envName;
	}

}
