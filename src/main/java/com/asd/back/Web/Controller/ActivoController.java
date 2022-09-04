package com.asd.back.Web.Controller;


import com.asd.back.Domain.Dto.Active;
import com.asd.back.Domain.Service.ActiveService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public ResponseEntity<List<Active>> getAllActive() {return new ResponseEntity<>(activeService.getAllActive(), HttpStatus.OK); }

    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public ResponseEntity<Active> getActive(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return activeService.getActive(id)
                .map(active -> new ResponseEntity<>(active, HttpStatus.OK))
                .orElse( new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public ResponseEntity<Active> saveActive(@RequestBody Active active){
        return new ResponseEntity<>(activeService.saveActive(active),  HttpStatus.CREATED);
    }
    /*
    @PostMapping("/save")
    @ApiOperation("Add new user")
    public Active saveActive(@RequestBody Active active){
        return activeService.saveActive(active);
    }*/


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteActive(@PathVariable("id") int activeId) {
        if (activeService.deleteActive(activeId)){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/Tipo/{type}")
    public ResponseEntity<List<Active>> getActiveByType(@PathVariable("type") String type) {

        return activeService.getActiveByType(type)
                .map(activo -> new ResponseEntity<>(activo, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @GetMapping("/Serial/{serial}")
    public ResponseEntity<List<Active>> getActiveBySerial (@PathVariable("serial") String serial){
        return activeService.getActiveBySerial(serial)
                .map(activo -> new ResponseEntity<>(activo, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/FechaCompra/{dateImput}")
    public ResponseEntity<List<Active>> getActiveByDate (@PathVariable("dateImput") String dateImput){

        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
             date = format.parse(dateImput);
            System.out.println(date);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

        return activeService.getActiveByDate(date)
                .map(activo -> new ResponseEntity<>(activo, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));


    }

}
