package com.asd.back.Web.Controller;

import com.asd.back.Domain.Dto.Position;
import com.asd.back.Domain.Service.PositionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Area")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AreaController {

    @Autowired
    private PositionService positionService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public ResponseEntity<List<Position>> getAllPosition() {return new ResponseEntity<>(positionService.getAllPosition(), HttpStatus.OK) ; }

    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public ResponseEntity<Position> getPosition(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return positionService.getPosition(id)
                .map(position -> new ResponseEntity<>(position, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public ResponseEntity<Position> savePosition(@RequestBody Position position){
        return new ResponseEntity<>(positionService.savePosition(position), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePosition(@PathVariable("id") int positionId) {
        if (positionService.deletePosition(positionId)){
            return  new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
