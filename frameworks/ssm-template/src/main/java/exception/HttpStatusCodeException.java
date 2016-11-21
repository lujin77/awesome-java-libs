package exception;

import lombok.Data;

/**
 * HttpStatusCodeException
 *
 * @author lujin
 * @date 16/11/21
 */
@Data public class HttpStatusCodeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private int statusCode;
    private String reson;

    public HttpStatusCodeException(int statusCode) {
        super();
        this.statusCode = statusCode;

    }

    public HttpStatusCodeException(int statusCode, String reson) {
        super();
        this.statusCode = statusCode;
        this.reson = reson;
    }
}
