package org.example;

public class Money {
    private final int amount; // Variable de instancia para almacenar la cantidad de dinero
    private final String currency; // Variable de instancia para almacenar el tipo de moneda

    public Money(int amount, String currency) {
        if (amount < 0){
            throw new IllegalArgumentException("Illegal amount: [" + amount + "]"); // Lanza una excepción si la cantidad es negativa
        }
        this.amount = amount; // Inicializa la cantidad de dinero
        this.currency = currency; // Inicializa el tipo de moneda
    }

    public int getAmount() { // Método getter para la cantidad de dinero
        return amount;
    }

    public String getCurrency() { // Método getter para el tipo de moneda
        return currency;
    }

    public boolean equals(Object anObject) {
        if (anObject instanceof Money) { // Verifica si el objeto es una instancia de Money
            Money money = (Money) anObject; // Convierte el objeto a Money
            return getCurrency().equals(money.getCurrency()) // Compara el tipo de moneda
                    && getAmount() == money.getAmount(); // Compara la cantidad de dinero
        }
        return false; // Retorna falso si el objeto no es una instancia de Money
    }
}
