package LiftinE.Controller;


import LiftinE.Model.Lifter;
import LiftinE.Service.LifterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lifting")
public class LifterController {
    LifterService lifterService;
    @Autowired
    public LifterController(LifterService lifterService){
        this.lifterService = lifterService;
    }
    @GetMapping("lifters")
    public List<Lifter> getAllLifter(){
        return lifterService.getAllLifter();

    }
    @PostMapping
    public void saveLifter(@RequestBody Lifter lifter){
        lifterService.saveLifter(lifter);
    }
    @GetMapping("maxLifter")
        public Lifter getMaxLifter(){
       return lifterService.getMaxLifter();
    }
    @GetMapping("name/{userName}")
        public Lifter getLifterByUserName(@PathVariable String userName){
        return lifterService.getLifterByUserName(userName);
    }

    }

