package com.asd.back.Web.Controller;



import com.asd.back.Domain.Dto.Possession;
import com.asd.back.Domain.Service.FurnitureService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Inmueble")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class InmuebleController {

    @Autowired
    private FurnitureService furnitureService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public ResponseEntity<List<Possession>> getAllPerson() {return new ResponseEntity<>(furnitureService.getAllFurniture(), HttpStatus.OK); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public ResponseEntity<Possession> getPerson(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return furnitureService.getFurniture(id)
                .map(possession -> new ResponseEntity<>(possession, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public ResponseEntity<Possession> savePerson(@RequestBody Possession furniture){
        return new ResponseEntity<>(furnitureService.saveFurniture(furniture), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePerson(@PathVariable("id") int furnitureId) {
        if (furnitureService.deleteFurniture(furnitureId)){
            return  new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}