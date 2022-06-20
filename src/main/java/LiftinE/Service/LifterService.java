package LiftinE.Service;

import LiftinE.DAO.LifterRepository;
import LiftinE.Model.Lifter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LifterService {
    LifterRepository lifterRepository;
    @Autowired
    public LifterService(LifterRepository lifterRepository){
        this.lifterRepository = lifterRepository;
    }
    public List<Lifter> getAllLifter(){
        return lifterRepository.findAllLifter();
    }
    public void saveLifter(Lifter lifter){
        lifterRepository.save(lifter);
    }
    public Lifter getMaxLifter(){
        return lifterRepository.findMaxLifter();
    }
    public Lifter getLifterByUserName(String userName){
        return lifterRepository.findLifterByUserName(userName);
    }

}
