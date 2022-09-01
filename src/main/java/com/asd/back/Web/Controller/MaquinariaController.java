package com.asd.back.Web.Controller;

import com.asd.back.Domain.Dto.Machine;
import com.asd.back.Domain.Service.MachineService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public List<Machine> getAllPerson() {return machineService.getAllMachine(); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Machine> getPerson(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return machineService.getMachine(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Machine savePerson(@RequestBody Machine machine){
        return machineService.saveMachine(machine);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deletePerson(@PathVariable("id") int machineId) {
        return machineService.deleteMachine(machineId);
    }




    @RequestMapping("/espana")
    public String cadena(){
        return "desde el back";
    }

    @RequestMapping("/carnaval")
    public String cadena2(){
        return "desde el back jjjjjjj";
    }

}
