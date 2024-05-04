package skeleton;

public class Belly {
	// Atributos para almacenar la cantidad de pepinos comidos y el tiempo esperado
	int eatenCucumbers = 0; // Cantidad de pepinos comidos
	int timeWaited = 0; // Tiempo esperado

	// Método para restablecer los valores de los atributos a cero
	public void reset() {
		eatenCucumbers = 0; // Restablece la cantidad de pepinos comidos a cero
		timeWaited = 0; // Restablece el tiempo esperado a cero
	}

	// Método para comer una cierta cantidad de pepinos
	public void eat(int cukes) {
		System.out.println("I ate " + cukes + " cucumbers.");
		eatenCucumbers += cukes; // Añade la cantidad de pepinos comidos al total
	}

	// Método para esperar un cierto tiempo en horas
	public void wait(int timeInHours) {
		if (timeInHours > 0) { // Verifica si el tiempo es mayor que cero
			timeWaited += timeInHours; // Incrementa el tiempo esperado
		}
	}

	// Método para verificar si el estómago está gruñendo (vacío)
	public boolean isGrowling() {
		// Devuelve true si el tiempo esperado es al menos 2 horas y se han comido más de 10 pepinos
		return timeWaited >= 2 && eatenCucumbers > 10;
	}
}

