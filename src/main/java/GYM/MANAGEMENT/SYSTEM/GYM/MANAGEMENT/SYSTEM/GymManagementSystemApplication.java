package GYM.MANAGEMENT.SYSTEM.GYM.MANAGEMENT.SYSTEM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymManagementSystemApplication.class, args);
	}

}
// //Gym: GymId, Location, List<Members>, List<Trainers>
//    //Member: MemberId, List<Trainer>,Gym
//    //Trainer: TrainerId, List<Member>, List<Gym>
//    //
//    //POST: Add Gym, Member, Trainer
//    //
//    //
//    //1.Find the member which is being trained by the most number of trainers....
//    //2.Find the number of members who are being trained by a trainer working in more than 1 gym.....
//    //3.Find the gym with the most number of members...
