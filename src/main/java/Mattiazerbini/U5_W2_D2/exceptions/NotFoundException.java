package Mattiazerbini.U5_W2_D2.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super(String.valueOf(id));
    }
}
