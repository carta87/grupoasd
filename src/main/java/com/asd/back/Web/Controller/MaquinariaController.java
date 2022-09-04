package com.asd.back.Web.Controller;

import com.asd.back.Domain.Dto.Machine;
import com.asd.back.Domain.Service.MachineService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Maquinaria")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MaquinariaController {

    @Autowired
    private MachineService machineService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public ResponseEntity<List<Machine>> getAllPerson() {return new ResponseEntity<>(machineService.getAllMachine(), HttpStatus.OK); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public ResponseEntity<Machine> getPerson(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return machineService.getMachine(id)
                .map(machine -> new ResponseEntity<>(machine, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public ResponseEntity<Machine> savePerson(@RequestBody Machine machine){
        return new ResponseEntity<>(machineService.saveMachine(machine), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePerson(@PathVariable("id") int machineId) {
        if (machineService.deleteMachine(machineId)){
            return  new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
