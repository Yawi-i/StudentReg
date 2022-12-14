package ie.atu;

public class StudID {
    //String studentID, studentReg;
    private String ID;
    private String Reg;


    public StudID(String id, String reg){      //Constructor
         Reg = reg;
         ID = id;
    }

    public void setID(String id) {
        if (String.valueOf(ID).length() > 7) {
            ID = id;
        } else {
            throw new IllegalArgumentException("Student ID number should be 8 numbers long. Please re- enter ID");
        }
    }

    public void setReg(String reg) {
        if (String.valueOf(reg).length() > 8) {
            Reg = reg;
        } else {
            throw new IllegalArgumentException("Registration number should be 9 numbers long. Please re- enter ID");
        }
    }

    public String getID(){
        return ID;
    }

    public String getReg(){
        return Reg;
    }
}