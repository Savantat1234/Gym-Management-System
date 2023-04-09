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
public class Member {
    //Member: MemberId, List<Trainer>,Gym
    private int memberId;
    private List<Trainer> trainers = new ArrayList<>();
    private Gym gym;
}
