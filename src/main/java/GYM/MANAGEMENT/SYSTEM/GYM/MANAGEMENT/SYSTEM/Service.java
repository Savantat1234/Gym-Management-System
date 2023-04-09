package GYM.MANAGEMENT.SYSTEM.GYM.MANAGEMENT.SYSTEM;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;
    //Add gym
    public void addGym(Gym gym){
         repository.addGym(gym);
    }

    //add member
    public void addMember(Member member){
         repository.addMember(member);
    }
    // add trainer
    public void addTrainer(Trainer trainer){
         repository.addTrainer(trainer);
    }
    //memberTrainedByMostNoOfTrainers
    public Member memberTrainedByMostNoOfTrainers(){
       return repository.memberTrainedByMostNoOfTrainers();
    }
    public Gym gymWithMostmembers(){
        return repository.gymWithMostMembers();
    }
}
