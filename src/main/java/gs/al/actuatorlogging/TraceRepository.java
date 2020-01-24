package gs.al.actuatorlogging;

import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TraceRepository implements HttpTraceRepository {

    private List traceList = new ArrayList<HttpTrace>();

    @Override
    public List<HttpTrace> findAll() {
        return traceList;
    }

    @Override
    public void add(HttpTrace trace) {
        traceList.add(trace);
    }

    public List<CustomHttpTrace> findAllCustom() {
        List<CustomHttpTrace> customHttpTraceList = new ArrayList<>();
        findAll().forEach(httpTrace -> {
            CustomHttpTrace customTrace = new CustomHttpTrace();
            customTrace.setHttpTrace(httpTrace);
            customTrace.setUuid(UUID.randomUUID().toString());
            customHttpTraceList.add(customTrace);
        });

        return customHttpTraceList;
    }
}
