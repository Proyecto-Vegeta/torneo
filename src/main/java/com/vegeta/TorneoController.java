package com.vegeta;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
public class TorneoController {
    private final Torneo torneo;

    public TorneoController() {
        torneo = new Torneo();
    }

    @GetMapping("/luchadores")
    public ResponseEntity<Map<String, Luchador>> getLuchadores() {
        return ResponseEntity.ok(torneo.getLuchadores());
    }

    @GetMapping("/luchadores/{nombre}")
    public ResponseEntity getLuchadores(@PathVariable(value="nombre") String nombre) {
        torneo.nuevoLuchador(nombre);
        return ResponseEntity.ok().build();
    }

}
