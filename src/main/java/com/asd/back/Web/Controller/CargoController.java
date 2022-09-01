package com.asd.back.Web.Controller;

import com.asd.back.Domain.Dto.Position;
import com.asd.back.Domain.Service.PositionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Area")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CargoController {

    @Autowired
    private PositionService positionService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public List<Position> getAllPosition() {return positionService.getAllPosition(); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Position> getPosition(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return positionService.getPosition(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Position savePosition(@RequestBody Position position){
        return positionService.savePosition(position);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deletePosition(@PathVariable("id") int positionId) {
        return positionService.deletePosition(positionId);
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
