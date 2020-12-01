package club.banyuan.homework.randNumber;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 7:05 下午
 */
public class ObjectRepeatException extends RuntimeException{
    public ObjectRepeatException() {
    }

    public ObjectRepeatException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
