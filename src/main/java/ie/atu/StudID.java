package ie.atu;

public class StudID {
    String studentID, studentReg;

    public StudID(String ID, String reg){      //Constructor
        studentReg = reg;
        studentID = ID;
    }

    public void setID(String ID) {
        if (ID.length() > 6) {
            studentID = ID;
        }
        else{
            throw new IllegalArgumentException("ID should be 6 numbers or more");
        }
    }


    public void Reg(String Reg){
        if (String.valueOf(Reg).length() < 7) {
            throw new IllegalArgumentException("Registration number should be 8 numbers or more");
        }
    }

    public String getID(){
        return studentID;
    }

    public String getReg(){
        return studentReg;
    }
}