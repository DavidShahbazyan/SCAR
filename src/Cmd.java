/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 12/5/15 <br/>
 * <b>Time:</b> 11:18 AM <br/>
 */
public enum Cmd {
    DATE("date", new String[]{"-d", "-t"}),
    SAY_HELLO("say-hello", new String[0]),
    ;

    private final String cmdName;
    private final String[] args;

    Cmd(String cmdName, String[] args) {
        this.cmdName = cmdName;
        this.args = args;
    }

    public static Cmd getCmdByName(String cmdName) {
        for (Cmd cmd : values()) {
            if (cmd.cmdName.equalsIgnoreCase(cmdName)) {
                return cmd;
            }
        }
        return null;
    }

    public String getCmdName() {
        return cmdName;
    }

    public String[] getArgs() {
        return args;
    }
}
