package gs.al.actuatorlogging.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class RestController {

    @GetMapping("get")
    public ResponseEntity getEndpoint() {
        return ResponseEntity.ok("Received your GET request");
    }

    @PostMapping("post")
    public ResponseEntity postEndpoint() {
        return ResponseEntity.ok("Received your POST request");
    }

    @PutMapping("put")
    public ResponseEntity putEndpoint() {
        return ResponseEntity.ok("Received your PUT request");
    }

    @DeleteMapping("delete")
    public ResponseEntity deleteEndpoint() {
        return ResponseEntity.ok("Received your DELETE request");
    }
}
