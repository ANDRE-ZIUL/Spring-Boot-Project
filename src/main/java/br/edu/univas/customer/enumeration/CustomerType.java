package br.edu.univas.customer.enumeration;

public enum CustomerType {
    PHISICPERSON(0),
    JURIDICPERSON(1);

    private Integer type;

    CustomerType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}