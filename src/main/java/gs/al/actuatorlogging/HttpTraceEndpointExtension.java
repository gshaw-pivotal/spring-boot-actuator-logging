package gs.al.actuatorlogging;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.trace.http.HttpTraceEndpoint;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EndpointWebExtension(endpoint = HttpTraceEndpoint.class)
public class HttpTraceEndpointExtension {

    private TraceRepository traceRepository;

    public HttpTraceEndpointExtension(TraceRepository traceRepository) {
        super();
        this.traceRepository = traceRepository;
    }

    @ReadOperation
    public CustomTraceDescriptor contents() {
        List<CustomHttpTrace> traces = traceRepository.findAllCustom();
        return new CustomTraceDescriptor(traces);
    }

    public class CustomTraceDescriptor {
        protected List<CustomHttpTrace> traces;

        public CustomTraceDescriptor(List<CustomHttpTrace> traces) {
            super();
            this.traces = traces;
        }

        public List<CustomHttpTrace> getTraces() {
            return traces;
        }

        public void setTraces(List<CustomHttpTrace> traces) {
            this.traces = traces;
        }
    }
}