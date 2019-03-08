package project;
import java.io.*;
public class QuestionBank {

    private String courseName;
    private Question[] qList;
    private int nOfQ;

    public QuestionBank(String courseName) {
        this.courseName = courseName;
        qList = new Question[100];
        nOfQ = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public Question[] getqList() {
        return qList;
    }

    public int getnOfQ() {
        return nOfQ;
    }

    public boolean addQuestion(Question q) {

        if (nOfQ == qList.length) {
            return false;
        }
        if (q instanceof FillBlankQ) {
            qList[nOfQ++] = new FillBlankQ((FillBlankQ) q);
        }
        if (q instanceof MCQ) {
            qList[nOfQ++] = new MCQ((MCQ) q);
        }
        if (q instanceof TrueFalseQ) {
            qList[nOfQ++] = new TrueFalseQ((TrueFalseQ) q);
        }
        return true;
    }

    public void removeAllQuestion(String[] ids) {

        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < nOfQ; j++) {
                if (ids[i].equals(qList[j].getqID())) {
                    qList[j] = qList[j + 1];
                }
            }
            qList[--nOfQ] = null;
        }
    }

    public int findQuestion(Question q){
        for (int i = 0; i < nOfQ; i++) {
            if (qList[i].text.equals(q.text) && qList[i].qID.equals(q.qID))
                return i ; 
        }
        return -1 ;
                
        }
    
    public int countChapterQuestion(String cName){
        
      int count = 0 ; 
        for (int i = 0; i < nOfQ ; i++) {
            int underscore = qList[i].getqID().indexOf("_") ;
            if (cName.toLowerCase().equals(qList[i].getqID().substring(0,underscore).toLowerCase()))
                count++;
        }
        return count ;
    }
      
    public void loadQuestions()throws IllegalArgumentException, IOException,ClassNotFoundException{
        File fname = new File (courseName);
        FileInputStream f = new FileInputStream(fname);
        ObjectInputStream inFile = new ObjectInputStream(f);
         
        while (fname.canRead())
        addQuestion( ((Question) inFile.readObject()) );
            inFile.close();
        }
   
    
    public Question[] getChapterQuestion(String cName) {
        return qList;
    }
    public void SaveQuestions()throws IOException,FileNotFoundException{
       ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(courseName.toLowerCase()+".ser"));
       for(int i=0;i<nOfQ;i++){
           
       obj.writeObject(qList[i]);
            
        }
       
    }
    }
    
