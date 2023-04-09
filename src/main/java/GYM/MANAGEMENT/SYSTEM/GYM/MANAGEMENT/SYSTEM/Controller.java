package GYM.MANAGEMENT.SYSTEM.GYM.MANAGEMENT.SYSTEM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Service service;

    //add gym
    @PostMapping("/addGym")
    public ResponseEntity addGym(@RequestBody Gym gym){
        service.addGym(gym);
        return new ResponseEntity<>("added", HttpStatus.OK);
    }
    //add member
    @PostMapping("/addMember")
    public ResponseEntity addMember(@RequestBody Member member){
        service.addMember(member);
        return new ResponseEntity<>("added", HttpStatus.OK);
    }
// add trainer
     @PostMapping("/addtrainer")
     public ResponseEntity addTrainer(@RequestBody Trainer trainer){
       service.addTrainer(trainer);
       return new ResponseEntity<>("added", HttpStatus.OK);
      }
      @GetMapping("/get_member_trained_by_most_trainers")
      public Member memberTrainedByMostNoOfTrainers(){
        return service.memberTrainedByMostNoOfTrainers();
      }
      @GetMapping("/gym_with_most_members")
    public Gym gymWithMostMembers(){
        return service.gymWithMostmembers();
      }


}
