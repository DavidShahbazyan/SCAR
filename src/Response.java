/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 12/5/15 <br/>
 * <b>Time:</b> 11:29 AM <br/>
 */
public class Response {
    public static final Response OK = new Response(200, "Ok!");
    public static final Response DONE = new Response(200, "Done!");
    public static final Response ERROR = new Response(500, "Error!");
    public static final Response NO_PERM = new Response(401, "You have no permission! Are you a root?");
    public static final Response DATE = new Response(200, "Date: %s");
    public static final Response HELLO = new Response(200, "Well, hello!");

    private final Integer respCode;
    private final String respMsg;

    Response(Integer respCode, String respMsg) {
        this.respCode = respCode;
        this.respMsg = respMsg;
    }

    public Integer getRespCode() {
        return respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }
}
