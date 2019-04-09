package hello;
public class Calorierechnen {
    int BMR;
    char genderChar;
     boolean moderately = false;
     boolean intensely = false;
     boolean five;
     double cal;
     String exercise;
    private boolean frau;
    private double alter;
    private double gewicht;
    private double grosse;
    
    public void rechnen(){
     if (frau=false)
        {
            BMR = (int) (66 + (6.23 * gewicht) + (12.7 * grosse) - (6.8 * alter));
        }
        else
        {
            BMR = (int) (665 + (4.35 * gewicht) + (4.7 * gewicht) - (4.7 * alter));
        }

        //Show BMR

        if (frau=true)
        {
            System.out.println("Your BMR is " + BMR);
        }
        else
            System.out.println("Your BMR is " + BMR);

        //Level of Exercises

        if (exercise=="none")
        {
            cal =  (BMR * 1.2);
        }
        else if (exercise=="light")
        {
            cal = (BMR * 1.375);
        }
        else if (exercise=="moderately")
        {
            cal = (BMR * 1.55);
        }
        else if (exercise=="intensely")
        {   
            cal = (BMR * 1.725);
        }
        else
        {
            cal = (BMR * 1.9);
        }

        System.out.println("What is your level of exercise? ");
        System.out.println("Type in none if you do not exercise. ");
        System.out.println("Type in 2 if you engage in light exercise one to three days a week.");
        System.out.println("Type in 3 if you do exercise moderately three to five times a week.");
        System.out.println("Type in 4 if you do intensely six to seven days a week.");
        System.out.println("Type in 5 if you do exercise intensely six to seven days a week and have a physically active job.");

        
      
        System.out.println("Your daily calorie needs " + cal);
    }

}

