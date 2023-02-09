package ar.com.inviu.movements;

public interface MovementMessage {
    record CashIn(double amount) implements MovementMessage {}
    record CashOut(double amount) implements MovementMessage {}
}
