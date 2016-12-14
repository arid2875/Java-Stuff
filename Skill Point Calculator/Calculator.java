import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {    
            private static int total, skillCost3To42, skillCost42To90;
        public static int calcUltimate(int currentLevel, int desiredLevel){
            total = 0;
            
            while(currentLevel<desiredLevel){
                skillCost3To42 = 500*(currentLevel-1);
                skillCost42To90 = 1000*(currentLevel-21);
                if(currentLevel == 1)
                    total += 100;                
                else if (currentLevel<42)
                    total += skillCost3To42;
                else
                    total += skillCost42To90;
                currentLevel++;
            }
            return total;
        }
        
        public static int calcGreen(int currentLevel, int desiredLevel){
            int total = 0;            
            while(currentLevel<desiredLevel){
                skillCost3To42 = 500*(currentLevel-1);
                skillCost42To90 = 1000*(currentLevel-21);
                if(currentLevel == 1)
                    total += 100*currentLevel;                  
                else if (currentLevel<42)
                    total += skillCost3To42;
                else
                    total += skillCost42To90;
                currentLevel++;
            }
            return total;            
        }
        
        public static int calcBlue(int currentLevel, int desiredLevel){
            int total = 0;            
            while(currentLevel<desiredLevel){
                skillCost3To42 = 500*(currentLevel-1);
                skillCost42To90 = 1000*(currentLevel-21);
                if (currentLevel> 20 && currentLevel<42)
                    total += skillCost3To42;
                else if (currentLevel >41)
                    total += skillCost42To90;
                currentLevel++;
            }
            return total;
        }
        
        public static int calcPurple(int currentLevel, int desiredLevel){
            int total = 0;            
            while(currentLevel<desiredLevel){                 
                skillCost42To90 = 1000*(currentLevel-21);
                if(currentLevel>40)
                    total += skillCost42To90;
                currentLevel++;
            }
            return total;
        }
        
        public static int calcLegendary(int currentLevel, int desiredLevel){
            int total = 0;
            while(currentLevel<=desiredLevel){
                if(currentLevel > 90){
                    total += 1000;
                }
            }
            return total;
        }
        
        public static int calcTotal( ArrayList<Integer> currentLevels, int desiredLevel){
            
           return calcUltimate(currentLevels.get(0), desiredLevel) + calcGreen(currentLevels.get(1), desiredLevel) + calcBlue(currentLevels.get(2), desiredLevel) + calcPurple(currentLevels.get(3),desiredLevel);
            
        }
        public static int calcSkillPoints( ArrayList<Integer> currentLevels, int desiredLevel){
            int ultPoints = desiredLevel - currentLevels.get(0);
            int greenPoints = desiredLevel - currentLevels.get(1);
            int bluePoints = desiredLevel - currentLevels.get(2) - 20;
            int purplePoints = desiredLevel - currentLevels.get(3) - 40;            
            if(desiredLevel < 22){
                return ultPoints + greenPoints;
            }
            else if(desiredLevel < 42){
                return ultPoints + greenPoints + bluePoints;
            }
            else
                return ultPoints + greenPoints + bluePoints + purplePoints;
             
         }
        public static String calcSkillPointTime(int skillPoints){
            int minutes = skillPoints*5;
            int HH,MM;
            if(minutes < 60)
                return Integer.toString(minutes);                
            else {
                HH = minutes/60;
                MM = minutes % 60;
                return HH + " Hours and " + MM + " Minutes to generate skill points";
                
            }
        }
        
        
        public static void main(String[] args){
                String TITLE = "Skill Point Calculator";
                int desiredLevel,skillPointsRequired;
                ArrayList<Integer> currentSkillLevels = new ArrayList(4);
                boolean keepGoing = true;
                Scanner in = new Scanner(System.in);
                
                while(keepGoing){
                    
                    System.out.println("What level is your hero?");                    
                    desiredLevel = in.nextInt();
                    System.out.println("What level is your Ultimate Skill?");
                    currentSkillLevels.add(0,in.nextInt());
                    System.out.println("What level is your Green Skill?");                    
                    currentSkillLevels.add(1,in.nextInt());
                    System.out.println("What level is your Blue Skill?");
                    currentSkillLevels.add(2,in.nextInt());
                    System.out.println("What level is your Purple Skill?");
                    currentSkillLevels.add(3,in.nextInt());
                    System.out.println("Your skill upgrades will cost : " + calcTotal(currentSkillLevels,desiredLevel) + " gold and " + calcSkillPoints(currentSkillLevels,desiredLevel) + " skill points. (" + calcSkillPointTime(calcSkillPoints(currentSkillLevels,desiredLevel)) + ")");
                    
                    //System.out.println("\n\nUltimate: " + calcUltimate(currentSkillLevels.get(0), desiredLevel) + "\nGreen: " + calcGreen(currentSkillLevels.get(1), desiredLevel) + "\nBlue: "+ calcBlue(currentSkillLevels.get(2), desiredLevel) +"\nPurple: " + calcPurple(currentSkillLevels.get(3), desiredLevel));
                    
                    System.out.println("Would you like to calculate another? (Y/N)");
                    if(in.next().trim().toUpperCase() == "N")
                        keepGoing = false;
                    
                        
                    
                    
                }

            }

    }
