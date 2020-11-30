package club.banyuan.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 基本异常类，用于表示计算器内可能发生的异常。
 * <p>
 * 此类扩展了Exception，其他计算器的异常类继承此类来提供更多的错误信息
 */
public class CalculatorException extends Exception {
    public CalculatorException() {
    }

    public CalculatorException(String message) {
        super(message);
    }
}
class QuitException extends  CalculatorException{
    public QuitException() {
    }

    public QuitException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
class IllegalInputException extends CalculatorException{
    public IllegalInputException() {
    }

    public IllegalInputException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class DivideByZeroException extends  CalculatorException{
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}