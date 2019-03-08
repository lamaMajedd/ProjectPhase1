
package project;

public class TrueFalseQ extends Question{
     private boolean correctAnswer ;
     
         public TrueFalseQ(boolean correctAnswer, String text, String qID, int pGrade) {
        super(text, qID, pGrade);
        this.correctAnswer = correctAnswer;
    }
        public TrueFalseQ(Question q ) {
        super(q.text, q.qID, q.pGrade);
        this.correctAnswer = correctAnswer;
    } 
    public String formattedQ(){
      return "True or False\n"+qID +":" +text;   
     }
        public String formattedQwithA(){
     return formattedQ()+"Correct Answer is :"+correctAnswer ;
}
}
