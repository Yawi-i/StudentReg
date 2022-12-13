package ie.atu;

public class StudID {
    //String studentID, studentReg;
    private String ID;
    private String reg;


    public StudID(String ID, String reg){      //Constructor
       // studentReg = reg;
       // studentID = ID;
        setreg(reg);
        setID(ID);
    }



    public void setID(String ID) {
        if (String.valueOf(ID).length() > 6) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("Student ID number should be 8 numbers or more. Please re- enter ID");
        }
    }

    public void setreg(String reg) {
        if (String.valueOf(reg).length() > 6) {
            this.reg = reg;
        } else {
            throw new IllegalArgumentException("Registration number should be 8 numbers or more. Please re- enter ID");
        }
    }


    public String getID(){
        return ID;
    }

    public String getReg(){
        return reg;
    }
}