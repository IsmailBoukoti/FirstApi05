package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("/get")
    public CarDTO getCars(@RequestParam(required = true)String id, @RequestParam (required = true)String modelName){
        return new CarDTO(id,modelName);
    }

    @PostMapping("/post")
    @ResponseBody
    public String printCar(@Validated @RequestBody CarDTO car){
        System.out.println(car);
        return HttpStatus.CREATED.toString();
    }
}