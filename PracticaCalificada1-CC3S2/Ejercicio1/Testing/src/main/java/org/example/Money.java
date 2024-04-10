package org.example;

public class Money {
    // Variables privadas que representan la cantidad y la moneda
    private final int amount; // Cantidad de dinero
    private final String currency; // Moneda

    // Constructor que inicializa una instancia de Money con la cantidad y la moneda
    public Money(int amount, String currency) {
        // Verifica si la cantidad es negativa y lanza una excepción si lo es
        if (amount < 0){
            throw new IllegalArgumentException("Illegal amount: [" + amount + "]");
        }
        // Asigna los valores proporcionados a las variables de instancia
        this.amount = amount; // Asigna la cantidad
        this.currency = currency; // Asigna la moneda
    }

    // Método para obtener la cantidad de dinero
    public int getAmount() {
        return amount;
    }

    // Método para obtener la moneda
    public String getCurrency() {
        return currency;
    }

    // Método para comparar si dos objetos Money son iguales
    public boolean equals(Object anObject) {
        // Verifica si el objeto pasado es una instancia de Money
        if (anObject instanceof Money) {
            // Si es así, lo convierte a Money
            Money money = (Money) anObject;
            // Compara si la moneda y la cantidad son iguales en ambos objetos
            return getCurrency().equals(money.getCurrency())
                    && getAmount() == money.getAmount();
        }
        // Si el objeto no es una instancia de Money, devuelve falso
        return false;
    }
}
