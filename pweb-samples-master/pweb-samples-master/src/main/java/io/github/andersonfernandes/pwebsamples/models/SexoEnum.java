package io.github.andersonfernandes.pwebsamples.models;

public enum SexoEnum {

	MASCULINO("M"),
	FEMININO("F"),
	NAO_BINARIO("NB");
	
	public final String value;
	 
    private SexoEnum(String value) {
        this.value = value;
    }
	
}
