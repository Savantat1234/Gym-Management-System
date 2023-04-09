package GYM.MANAGEMENT.SYSTEM.GYM.MANAGEMENT.SYSTEM;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Trainer {
    //Trainer: TrainerId, List<Member>, List<Gym>
    private int trainerId;
    private List<Member> members =new ArrayList<>();
    private List<Gym> gyms = new ArrayList<>();
}
// trainerdb...for(trainer)...trainer.getGyms...if(trainer.getgys.size>1){
//trainer= trainer;...trainer.getmembers