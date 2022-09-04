package com.asd.back.Web.Controller;

import com.asd.back.Domain.Dto.MaterialOffice;
import com.asd.back.Domain.Service.TypeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/MaterialOficina")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MaterialOficinaController {

    @Autowired
    private TypeService typeService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }


    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public ResponseEntity<List<MaterialOffice>> getAllType() {return new ResponseEntity<>(typeService.getAllType(), HttpStatus.OK); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public ResponseEntity<MaterialOffice> getRegister(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return typeService.getType(id)
                .map(materialOffice -> new ResponseEntity<>(materialOffice, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public ResponseEntity<MaterialOffice> saveRegister(@RequestBody MaterialOffice type){
        return new ResponseEntity<>(typeService.saveType(type), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int typeId) {
        if(typeService.deleteType(typeId)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

}
