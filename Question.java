/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


public abstract class Question {
    
    protected String text ;
    protected String qID  ;
    protected int pGrade ;

    public Question(String text, String qID, int pGrade) {
        this.text = text;
        this.qID = qID;
        this.pGrade = pGrade;
    }
    
     public Question(Question q) {
        this.text = q.text;
        this.qID = q.qID;
        this.pGrade = q.pGrade;
    }
    
    

    public String getText() {
        return text;
    }

    public String getqID() {
        return qID;
    }

    public int getpGrade() {
        return pGrade;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setqID(String qID) {
        this.qID = qID;
    }

    public void setpGrade(int pGrade) {
        this.pGrade = pGrade;
    }
    
   public abstract String formattedQ();
   public abstract String formattedQwithA();
    
}
