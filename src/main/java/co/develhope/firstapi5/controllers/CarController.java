package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CarController {

    @GetMapping("/cars")
    public CarDTO getCars(@RequestParam(required = true)String id, @RequestParam (required = true)String modelName){
        return new CarDTO(id,modelName);
    }

    @PostMapping("/cars")
    @ResponseStatus(HttpStatus.CREATED)
    public HttpStatus postCars(@Valid @RequestBody CarDTO carDTO){
        System.out.println(carDTO);
        return HttpStatus.CREATED ;
    }

}