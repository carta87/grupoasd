package com.asd.back.Web.Controller;


import com.asd.back.Domain.Dto.Active;
import com.asd.back.Domain.Service.ActiveService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Activo")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ActivoController {

    @Autowired
    private ActiveService activeService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public List<Active> getAllActive() {return activeService.getAllActive(); }

    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Active> getActive(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return activeService.getActive(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Active saveActive(@RequestBody Active active){
        return activeService.saveActive(active);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteActive(@PathVariable("id") int activeId) {
        return activeService.deleteActive(activeId);
    }

    @GetMapping("/tipo/{type}")
    public List<Active> getActiveByType(@PathVariable("type") int type) {
        return activeService.getActiveByType(type);}

}
