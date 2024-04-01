package com.apifinanceira.enums;

public enum TypeTransaction {
	DESPESA(1),
	RECEITA(2);
	
	
	private int type;
	
	
    public int getType() {
        return type;
    }

	private TypeTransaction(int type) {
		this.type = type;
	}
	
    public static TypeTransaction valueOf(int type) {
        for(TypeTransaction value : TypeTransaction.values()) {
            if(value.getType() == type) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid TypeTransaction Code");
    }
}
