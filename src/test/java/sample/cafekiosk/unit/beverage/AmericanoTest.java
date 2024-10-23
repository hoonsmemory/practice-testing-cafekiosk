package sample.cafekiosk.unit.beverage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {

    @Test
    @DisplayName("")
    void getName() throws Exception {
        // given
        Americano americano = new Americano();

        // when
        String name = americano.getName();

        // then
        assertThat(name).isEqualTo("아메리카노");
    }


    @Test
    @DisplayName("")
    void getPrice() throws Exception {
        // given
        Americano americano = new Americano();

        // when
        int price = americano.getPrice();

        // then
        assertThat(price).isEqualTo(4000);

    }
}