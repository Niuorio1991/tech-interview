package ar.com.inviu;

import ar.com.inviu.movements.MovementMessage;
import ar.com.inviu.movements.MovementMessage.CashIn;
import ar.com.inviu.movements.MovementMessage.CashOut;
import java.util.stream.Stream;

/**
 * Modelar una clase AccountBalance que consuma los movimientos de CashIn y CashOut, y calcule el balance total de la cuenta del cliente
 * 1 - Solo hacer la clase AccountBalance, no es necesario integrarlo al MessageConsumer.
 * 2 - Usar TDD (opcional).
 * 3 - No es necesario terminar el ejercicio.
 */
class AccountBalanceTest {
    private static Stream<MovementMessage> movementMessageStream = Stream.of(
        new CashIn(100.0),
        new CashIn(200.0),
        new CashOut(100.0)
    );

}
