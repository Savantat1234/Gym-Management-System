package GYM.MANAGEMENT.SYSTEM.GYM.MANAGEMENT.SYSTEM;


import java.util.HashMap;

@org.springframework.stereotype.Repository
public class Repository {
    HashMap<Integer,Gym> gymdb = new HashMap<>();
    HashMap<Integer,Member> memberdb = new HashMap<>();
    HashMap<Integer,Trainer> trainerdb = new HashMap<>();

    //add gym
    public void addGym(Gym gym){
        gymdb.put(gym.getGymId(),gym);
    }
    //add member
    public void addMember(Member member){
        memberdb.put(member.getMemberId(),member);
    }
    //add trainer
    public void addTrainer(Trainer trainer){
        trainerdb.put(trainer.getTrainerId(),trainer);
    }

    //1.Find the member which is being trained by the most number of trainers....
    public Member memberTrainedByMostNoOfTrainers(){
        int maximum=0;
        Member reqMember= new Member();
        for(Member member: memberdb.values()){
           if(member.getTrainers().size() > maximum)
               maximum =member.getTrainers().size();
           reqMember =member;
        }
        return  reqMember;
    }

    // trainerdb...for(trainer)...trainer.getGyms...if(trainer.getgys.size>1){
//trainer= trainer;...trainer.getmembers..for(member meber: trainer.getmembers)
    //if(member.gettrainers.size()>maximum''max= member.gettrainer.size()...reqmember=member

    public int findNumOfMembersBeingTrainedByTrainerInMultiGyms() {
        int count = 0;
        for (Trainer trainer : trainerdb.values()) {
            if (trainer.getGyms().size() > 1) {
                for (Member member : trainer.getMembers()) {
                    if (member.getTrainers().size() > 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //find gym with most no of members
    public Gym gymWithMostMembers(){
        int maximum =0;
        Gym gym = new Gym();
        for(Gym currgym: gymdb.values()){
            if(currgym.getMembers().size() > maximum){
                maximum =currgym.getMembers().size();
                gym = currgym;
            }
        }
        return gym;
    }


}
