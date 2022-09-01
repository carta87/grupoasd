package com.asd.back.Web.Controller;

import com.asd.back.Domain.Service.TypeService;
import com.asd.back.Domain.Dto.Type;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Tipo")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class TipoController {

    @Autowired
    private TypeService typeService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }


    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public List<Type> getAllType() {return typeService.getAllType(); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Type> getRegister(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return typeService.getType(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Type saveRegister(@RequestBody Type type){
        return typeService.saveType(type);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int typeId) {
        return typeService.deleteType(typeId);
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
