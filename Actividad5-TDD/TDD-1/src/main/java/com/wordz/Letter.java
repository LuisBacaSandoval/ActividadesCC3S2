package com.wordz;

/**
 * Representa el estado de una letra en una palabra intentada.
 */
public enum Letter {
    /**
     * La letra es correcta y está en la posición correcta.
     */
    CORRECT,
    /**
     * La letra es correcta pero no está en la posición correcta.
     */
    PART_CORRECT,
    /**
     * La letra es incorrecta.
     */
    INCORRECT
}
