import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FootballTeamTest {

    //private static final int THREE_GAMES_WON = 3;
    private static final int ANY_NUMBER = 123;

    /**
     * Prueba para verificar si el constructor establece correctamente el número de juegos ganados.
     *
     * @param nbOfGamesWon El número de juegos ganados para establecer.
     */
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 10})
    void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        //assertThat(team.getGamesWon()).isEqualTo(3);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(nbOfGamesWon);
    }

    /**
     * Prueba para verificar si el constructor lanza una IllegalArgumentException cuando el número de juegos ganados es negativo.
     *
     * @param illegalNbOfGames El número de juegos ganados inválido.
     */
    @ParameterizedTest
    @ValueSource(ints = {-10, -1})
    void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    new FootballTeam(illegalNbOfGames);
                });
    }

    /**
     * Prueba para verificar si es posible comparar equipos.
     */
    @Test
    void shouldBePossibleToCompareTeams() {
        FootballTeam team = new FootballTeam(ANY_NUMBER);
        assertThat(team).isInstanceOf(Comparable.class);
    }

    /**
     * Prueba para verificar si un equipo con más juegos ganados es mayor que otro equipo.
     */
    @Test
    void teamsWithMoreMatchesWonShouldBeGreater() {
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);
        assertThat(team_3.compareTo(team_2)).isGreaterThan(0);
    }

    /**
     * Prueba para verificar si un equipo con menos juegos ganados es menor que otro equipo.
     */
    @Test
    void teamsWithLessMatchesWonShouldBeLesser() {
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);
        assertThat(team_2.compareTo(team_3))
                .isLessThan(0);
    }

    /**
     * Prueba para verificar si equipos con el mismo número de juegos ganados son iguales.
     */
    @Test
    void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(2);
        assertThat(teamA.compareTo(teamB))
                .isEqualTo(0);
    }
}
