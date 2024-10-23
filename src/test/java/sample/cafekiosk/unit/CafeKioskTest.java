package sample.cafekiosk.unit;

import org.junit.jupiter.api.*;
import sample.cafekiosk.unit.beverage.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CafeKioskTest {
    @Test
    @DisplayName("")
    void add_manual_test() throws Exception {
        // Given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage beverage = new Americano();


        // When
        cafeKiosk.add(beverage);

        System.out.println(">>> 담긴 음료 수 : " + cafeKiosk.getBeverages().size());
        System.out.println(">>> 담긴 음료 : " + cafeKiosk.getBeverages().get(0));

        // Then
        assertEquals(1, cafeKiosk.getBeverages().size());
    }

    @Test
    @DisplayName("")
    void add() throws Exception {
        // Given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage beverage = new Americano();

        // When
        cafeKiosk.add(beverage);

        // Then
        assertThat(cafeKiosk.getBeverages()).hasSize(1);
        assertThat(cafeKiosk.getBeverages().get(0).getName()).isEqualTo("아메리카노");
    }

    @Test
    @DisplayName("")
    void remove() throws Exception {
        // Given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage beverage = new Americano();
        cafeKiosk.add(beverage);

        // When
        cafeKiosk.remove(beverage);

        // Then
        assertThat(cafeKiosk.getBeverages()).hasSize(0);
    }

    @Test
    @DisplayName("")
    void clear() throws Exception {
        // Given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage beverage = new Americano();
        cafeKiosk.add(beverage);

        // When
        cafeKiosk.clear();

        // Then
        assertThat(cafeKiosk.getBeverages()).hasSize(0);
    }
}