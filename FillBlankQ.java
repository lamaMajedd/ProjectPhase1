
package project;


public class FillBlankQ extends Question {
 
    private String  correctAnswer ;

    public FillBlankQ(String correctAnswer, String text, String qID, int pGrade) {
        super(text, qID, pGrade);
        this.correctAnswer = correctAnswer;
    }
    public FillBlankQ(Question q ) {
        super(q.text, q.qID, q.pGrade);
        this.correctAnswer = correctAnswer;
    } 
    public String formattedQ(){
      return"Fill the Following blank\n"+ qID +":" +text;   
     }
        public String formattedQwithA(){
     return formattedQ()+ "Correct Answer is :"+correctAnswer ;
}
    
}
