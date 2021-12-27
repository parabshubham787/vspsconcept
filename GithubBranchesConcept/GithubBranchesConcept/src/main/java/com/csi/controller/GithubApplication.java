package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class GithubApplication {

    @GetMapping()
    public ResponseEntity<String> heyHello()
    {
        return ResponseEntity.ok("VSPS Concept");
    }

    @GetMapping("/address")
    public ResponseEntity<String> address()
    {
        //Changes By Prasad Gunjal
        return ResponseEntity.ok("INSPIRIA MALL | PCMC | PUNE | MH |INDIA ");
    }

    @GetMapping("/service")
    public ResponseEntity<String> service()
    {
        //Changes By Prasad Gunjal
        return ResponseEntity.ok("Application Software development ");
    }
}
