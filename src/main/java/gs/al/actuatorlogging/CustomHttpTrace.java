package gs.al.actuatorlogging;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.actuate.trace.http.HttpTrace;

@Getter
@Setter
public class CustomHttpTrace {
    protected HttpTrace httpTrace;

    protected String uuid;

    public CustomHttpTrace() {}
}
