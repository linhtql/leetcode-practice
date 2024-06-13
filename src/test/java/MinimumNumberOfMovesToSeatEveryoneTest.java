import algorithms.MinimumNumberOfMovesToSeatEveryone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfMovesToSeatEveryoneTest {
    @Test
    void testCase1() {
        final var seats = new int[]{3, 1, 5};
        final var students = new int[]{2, 7, 4};
        assertEquals(4, MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students));
    }

    @Test
    void testCase2() {
        final var seats = new int[]{4, 1, 5, 9};
        final var students = new int[]{1, 3, 2, 6};
        assertEquals(7, MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students));
    }

    @Test
    void testCase3() {
        final var seats = new int[]{2, 2, 6, 6};
        final var students = new int[]{1, 3, 2, 6};
        assertEquals(4, MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students));
    }
}
