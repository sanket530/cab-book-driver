package dev.sanket.controller;

import dev.sanket.service.CabLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class CabLocationController {
    private final CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity<Map<String, String>> updateLocation() throws InterruptedException {
        int range = 100;
        while (range > 0) {
            cabLocationService.updateLocation(Math.random() + ", " + Math.random());
            Thread.sleep(500);
            range--;
        }
        return new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
    }
}
