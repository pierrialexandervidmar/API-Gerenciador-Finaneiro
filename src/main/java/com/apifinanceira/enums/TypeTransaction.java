package com.apifinanceira.enums;

public enum TypeTransaction {
	DESPESA(1),
	RECEITA(2);
	
	
	private int code;
	
	
    public int getCode() {
        return code;
    }

	private TypeTransaction(int code) {
		this.code = code;
	}
	
    public static TypeTransaction valueOf(int code) {
        for(TypeTransaction value : TypeTransaction.values()) {
            if(value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus Code");
    }
}
