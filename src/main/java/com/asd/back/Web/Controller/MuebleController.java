package com.asd.back.Web.Controller;



import com.asd.back.Domain.Dto.Possession;
import com.asd.back.Domain.Service.FurnitureService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Mueble")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MuebleController {

    @Autowired
    private FurnitureService furnitureService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public List<Possession> getAllPerson() {return furnitureService.getAllFurniture(); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Possession> getPerson(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return furnitureService.getFurniture(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Possession savePerson(@RequestBody Possession furniture){
        return furnitureService.saveFurniture(furniture);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deletePerson(@PathVariable("id") int furnitureId) {
        return furnitureService.deleteFurniture(furnitureId);
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