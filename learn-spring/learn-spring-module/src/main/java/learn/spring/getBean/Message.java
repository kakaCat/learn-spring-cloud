package learn.spring.getBean;

/**
 * @ClassName Message
 * @Description Message
 * @Author yunp
 * @Date 2020/7/28 17:06
 * @Version 1.0
 **/
public class Message {


    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println("消息是: " + message);
    }

}
