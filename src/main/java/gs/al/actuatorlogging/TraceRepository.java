package gs.al.actuatorlogging;

import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;

import java.util.ArrayList;
import java.util.List;

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
}
