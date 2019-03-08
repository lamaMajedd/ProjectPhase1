
package project;

public class ExamManager {
    private QuestionBank qBank;
    
    public ExamManager(String courseNme){
        
    }
    
    public QuestionBank getqBank(){
        return qBank;
    }
    
    public boolean addNewQuestion(Question q){
        return qBank.addQuestion(q);      
    }
    
    public void removeChapterQuestions(String chapterName){
        
    }
    
    public double generateExam (String header, int n, String chapterName, boolean withAnswers ){
        
    }
    
    public void exportQBank(){
       qBank.SaveQuestions(); 
    }
}
