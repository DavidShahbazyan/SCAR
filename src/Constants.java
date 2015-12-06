import java.util.Objects;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 12/5/15 <br/>
 * <b>Time:</b> 1:42 PM <br/>
 */
public enum Constants {
    SOCKET_PORT(Integer.class, 9090),
    ;

    private final Class valueType;
    private final Object value;

    Constants(Class valueType, Object value) {
        this.valueType = valueType;
        this.value = value;
    }

    public Class getValueType() {
        return valueType;
    }

    public Object getValue() {
        return value;
    }
}
