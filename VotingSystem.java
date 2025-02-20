import java.util.*;
public class VotingSystem{
    private Map<String, Integer> votes=new HashMap<>();
    private Map<String, Integer> voteOrder=new LinkedHashMap<>();
    public void castVote(String candidate){
        votes.put(candidate,votes.getOrDefault(candidate,0)+1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate,0)+1);
    }
    public void displayResults(){
        TreeMap<String, Integer> sortedVotes=new TreeMap<>(votes);
        System.out.println("Voting Results");
        for(Map.Entry<String,Integer> entry:sortedVotes.entrySet()){
            System.out.println(entry.getKey()+" :- "+entry.getValue()+" votes");
        }
    }
    public void displayVoteOrder(){
        System.out.println("Order of Votes Cast");
        for(Map.Entry<String,Integer> entry:voteOrder.entrySet()){
            System.out.println(entry.getKey()+" :- "+entry.getValue()+" votes");
        }
    }
    public static void main(String[] args){
        VotingSystem system=new VotingSystem();
        String[] votes={"Jon","Smith","Kohli","Warner","Warner","Kohli"};
        for(String candidate:votes){
            system.castVote(candidate);
        }
        system.displayResults();
        system.displayVoteOrder();
    }
}
