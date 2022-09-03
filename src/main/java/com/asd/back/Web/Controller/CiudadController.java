package com.asd.back.Web.Controller;

import com.asd.back.Domain.Dto.City;
import com.asd.back.Domain.Service.CityService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Ciudad")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CiudadController {

    @Autowired
    private CityService cityService;

    @GetMapping(value = "status")
    String checkStatus(){
        return "ok";
    }

    @GetMapping("/todos")
    @ApiOperation("Get all Register")
    @ApiResponse(code = 200 , message = "Data of DB")
    public List<City> getAllCity() {return cityService.getAllCity(); }


    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<City> getCity(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return cityService.getCity(id);
    }

    @PostMapping("/save")
    @ApiOperation("Add new user")
    public City saveCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCity(@PathVariable("id") int cityId) {
        return cityService.deleteCity(cityId);
    }


}
