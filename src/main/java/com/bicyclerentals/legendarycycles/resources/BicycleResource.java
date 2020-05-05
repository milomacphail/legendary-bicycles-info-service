package com.bicyclerentals.legendarycycles.resources;
import com.bicyclerentals.legendarycycles.models.Bicycle;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bicycles")
public class BicycleResource {

    @RequestMapping("/{bicycleId}")
    public Bicycle getBicycleInfo(@PathVariable("bicycleId")String bicycleId){
        return new Bicycle(bicycleId, "Test name");
    }
}







