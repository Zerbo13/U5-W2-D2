package Mattiazerbini.U5_W2_D2.controllers;

import Mattiazerbini.U5_W2_D2.entities.Autore;
import Mattiazerbini.U5_W2_D2.payloads.AutorePayload;
import Mattiazerbini.U5_W2_D2.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")
public class AutoreController {

    private final AutoreService autoreService;

    @Autowired
    public AutoreController(AutoreService autoreService){
        this.autoreService = autoreService;
    }

    //LISTA DI AUTORI (GET)
    @GetMapping
    public List<Autore> findAll() {
        return this.autoreService.findAll();
    }

    //RITORNA UN SINGOLO AUTORE (GET) http://localhost:3001/users/{userId}
    @GetMapping("/{idAutore}")
    public Autore getAutoreById(@PathVariable long idAutore) {
        return this.autoreService.findById(idAutore);
    }


    //CREAZIONE DI UN NUOVO AUTORE (POST) http://localhost:3001/users (+payload)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    public Autore createAutore(@RequestBody AutorePayload payload) {
        return this.autoreService.salvaAutore(payload);
    }



    //MODIFICA LO SPECIFICO AUTORE (PUT) http://localhost:3001/users/{userId} (+payload)
    @PutMapping("/{idAutore}")
    public Autore getAutoreByIdAndUpdate(@PathVariable long idAutore, @RequestBody AutorePayload payload) {
        return this.autoreService.findByIdAndUpdate(idAutore, payload);
    }

    //ELIMINA LO SPECIFICO AUTORE (DELETE) http://localhost:3001/users/{userId}
    @DeleteMapping("/{idAutore}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    public void getAutoreByIdAndDelete(@PathVariable long idAutore) {
        this.autoreService.findByIdAndDelete(idAutore);
    }
}
