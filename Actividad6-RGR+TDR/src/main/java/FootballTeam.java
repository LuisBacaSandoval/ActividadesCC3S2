public class FootballTeam implements Comparable<FootballTeam>{
    private int gamesWon;
    /**
     * Constructor de la clase FootballTeam.
     *
     * @param gamesWon El número de juegos ganados por el equipo.
     * @throws IllegalArgumentException Si el número de juegos ganados es negativo.
     */
    public FootballTeam(int gamesWon) {
        if (gamesWon<0){
            throw new IllegalArgumentException(
                    "Not possible to have less than 0 games won! (was + " + gamesWon + ")"
            );
        }
        this.gamesWon = gamesWon;
    }
    /**
     * Devuelve el número de juegos ganados por el equipo.
     *
     * @return El número de juegos ganados por el equipo.
     */
    public int getGamesWon() {
        //return 0;
        //return 3;
        return gamesWon;
    }

    /*@Override
    public int compareTo(FootballTeam otherTeam) {
        if (gamesWon > otherTeam.getGamesWon()) {
            return 1;
        }
        else if (gamesWon < otherTeam.getGamesWon()) {
            return -1;
        }
        return 0;
    }*/

    /**
     * Compara este equipo con otro equipo basándose en el número de juegos ganados.
     *
     * @param otherTeam El otro equipo con el que comparar.
     * @return Un entero negativo, cero o un entero positivo si este equipo tiene menos juegos ganados, el mismo número de juegos ganados o más juegos ganados que el equipo especificado.
     */
    @Override
    public int compareTo(FootballTeam otherTeam) {
        return gamesWon - otherTeam.getGamesWon();
    }

}
