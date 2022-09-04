package com.asd.back.Web.Controller;

import com.asd.back.Domain.Dto.Person;
import com.asd.back.Domain.Service.PersonService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Empleado")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EmpleadoController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public ResponseEntity<List<Person>> getAllPerson() {return new ResponseEntity<>(personService.getAllPerson(), HttpStatus.OK); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public ResponseEntity<Person> getPerson(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return personService.getPerson(id)
                .map(person ->  new ResponseEntity<>(person, HttpStatus.OK))
                .orElse( new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public ResponseEntity<Person> savePerson(@RequestBody Person person){

        return new ResponseEntity<>(personService.savePerson(person), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePerson(@PathVariable("id") int personId) {
        if(personService.deletePerson(personId)){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return  new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
