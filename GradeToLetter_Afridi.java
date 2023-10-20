                                             /******
                                                    Name: Zainab Afridi
                                                    Date: 09/13/2023
                                                    Purpose: Change grades to 
                                                    letters and use methods
                                                                            ******/
                                             
import javax.swing.JOptionPane;
public class GradeToLetter_Afridi 
{
    // DRIVER method
    public static void main(String[] args)
     {
        // get test score from user
        String temp1 = JOptionPane.showInputDialog("Please enter our test score: ");
        double testScore = Double.parseDouble(temp1);

        // Calculate the grade letter (calling method)
        String letter = calculateGradeLetter(testScore);

        // Return the grade letter
        JOptionPane.showMessageDialog(null, "Your letter grade is: " + letter);
    }
    
   // Method Purpose: take the input grade and convert it to a letter grade
    public static String calculateGradeLetter(double testScore) 
    {
      if (testScore > 92 && testScore <= 100) 
        {
            return "A";
        } 
        else if (testScore >= 89.5 && testScore <= 92) 
         {
            return "A-";
          } 
        else if (testScore >= 86.5 && testScore < 89.5) 
          {
            return "B+";
          } 
        else if (testScore >= 82.5 && testScore < 86.5)
          {
            return "B";
          } 
        else if (testScore >= 79.5 && testScore < 82.5) 
          {
            return "B-";
          } 
        else if (testScore >= 76.5 && testScore < 79.5) 
         {
            return "C+";
          } 
        else if (testScore >= 69.5 && testScore < 76.5) 
          {
            return "C";
          } 
        else 
         {
            return "F";
         }
    }
}
