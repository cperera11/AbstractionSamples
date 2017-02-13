/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionsamplesgod;

/**
 *
 * @author CPere
 */
public class MythologicalGod {
    private String name;
    private boolean specialPowers;
    private boolean wellKnown;
    private boolean religious;
    private String gender;

    public void showSpecialPowers(){
        if(hasSpecialPowers() == true){
        System.out.println("Show special powers");
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasSpecialPowers() {
        return specialPowers;
    }

    public void setSpecialPowers(boolean specialPowers) {
        this.specialPowers = specialPowers;
    }

    public boolean isWellKnown() {
        return wellKnown;
    }

    public void setWellKnown(boolean wellKnown) {
        this.wellKnown = wellKnown;
    }

    public boolean isReligious() {
        return religious;
    }

    public void setReligious(boolean religious) {
        this.religious = religious;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
