import java.util.ArrayList;
import java.util.List;

public class PartyMember implements Cloneable {
    private String name;
    private List<String>skills;

    public PartyMember(String name){
        this.name=name;
        this.skills=new ArrayList<>();
    }
    public void addSkill(String skill){
        skills.add(skill);
    }
    @Override
    public PartyMember clone(){
        PartyMember copy=new PartyMember(this.name);
        for(String skill:this.skills){
            copy.addSkill(skill);
        }
        return copy;
    }
    public void showSkills(){
        System.out.println("キャラクター「"+name+"」のスキル"+skills.toString().replace(",",","));
    }
}
