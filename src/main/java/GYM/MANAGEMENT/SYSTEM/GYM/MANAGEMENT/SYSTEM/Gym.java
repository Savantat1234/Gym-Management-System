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
public class Gym {
    //Gym: GymId, Location, List<Members>, List<Trainers>
    private int gymId;
    private String location;
    private List<Member> members = new ArrayList<>();
    private List<Trainer> trainers = new ArrayList<>();
}
