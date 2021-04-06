public class Student {
    // state
    private String name;
    private String reg;
    // Subjects name
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    // Subject theory Marks
    private double m1;
    private double m2;
    private double m3;
    private double m4;
    private double m5;
    // Subject lab marks
    private double m11;
    private double m22;
    private double m33;
    private double m44;
    private double m55;
    // Subject Theory+lab marks
    private double sm1;
    private double sm2;
    private double sm3;
    private double sm4;
    private double sm5;
    // GPA and CGPA
    private double gpa;
    private double cgpa;

    // Methods
    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    // Setters for Subject name
    public void setName(String s1, int i) {
        switch (i) {
        case 1: {
            this.s1 = s1;
        }
            break;
        case 2: {
            this.s2 = s1;
        }
            break;
        case 3: {
            this.s3 = s1;
        }
            break;
        case 4: {
            this.s4 = s1;
        }
            break;
        case 5: {
            this.s5 = s1;
        }
            break;
        }
    }

    // setters for subject theory marks
    public void setMark(double marks, int i) {
        switch (i) {
        case 1: {
            if (marks <= 100 && marks >= 0) {
                m1 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        case 2: {
            if (marks <= 100 && marks >= 0) {
                m2 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        case 3: {
            if (marks <= 100 && marks >= 0) {
                m3 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        case 4: {
            if (marks <= 100 && marks >= 0) {
                m4 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        case 5: {
            if (marks <= 100 && marks >= 0) {
                m5 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        }
    }

    // setters for subject lab marks
    public void setLabMark(double marks, int i) {
        switch (i) {
        case 1: {
            if (marks <= 100 && marks >= 0) {
                m11 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        case 2: {
            if (marks <= 100 && marks >= 0) {
                m22 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        case 3: {
            if (marks <= 100 && marks >= 0) {
                m33 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        case 4: {
            if (marks <= 100 && marks >= 0) {
                m44 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        case 5: {
            if (marks <= 100 && marks >= 0) {
                m55 = marks;
            } else
                System.out.println("Invalid Marks");
        }
            break;
        }

    }

    // setter for Theory +lab marks
    public void setTMark(double th, double lab, int i) {
        switch (i) {
        case 1: {
            if (lab != 1.1)
                sm1 = ((th * 3) / 4) + (lab / 4);
            else
                sm1 = th;
        }
            break;
        case 2: {
            if (lab != 1.1)
                sm2 = ((th * 3) / 4) + (lab / 4);
            else
                sm2 = th;
        }
            break;
        case 3: {
            if (lab != 1.1)
                sm3 = ((th * 3) / 4) + (lab / 4);
            else
                sm3 = th;
        }
            break;
        case 4: {
            if (lab != 1.1)
                sm4 = ((th * 3) / 4) + (lab / 4);
            else
                sm4 = th;
        }
            break;
        case 5: {
            if (lab != 1.1)
                sm5 = ((th * 3) / 4) + (lab / 4);
            else
                sm5 = th;
        }
            break;
        }

    }

    // setter for GPA calculator
    public void setGpa(double marks) {
        if (marks >= 90 && marks <= 100)
            gpa = 4.0;
        else if (marks >= 85 && marks < 90)
            gpa = 3.7;
        else if (marks >= 80 && marks < 85)
            gpa = 3.3;
        else if (marks >= 75 && marks < 80)
            gpa = 3.0;
        else if (marks >= 70 && marks < 75)
            gpa = 2.7;
        else if (marks >= 65 && marks < 70)
            gpa = 2.3;
        else if (marks >= 60 && marks < 65)
            gpa = 2.0;
        else if (marks >= 55 && marks < 60)
            gpa = 1.7;
        else if (marks >= 50 && marks < 55)
            gpa = 1.3;
        else if (marks >= 0 && marks < 50)
            gpa = 0.0;
    }

    // setter for CGPA
    public void setCgpa(double total) {
        cgpa = (total * 3) / 15;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getReg() {
        return this.reg;
    }

    // getter for theory marks
    public double getMark(int i) {
        if (i == 1) {
            return m1;
        } else if (i == 2) {
            return m2;
        } else if (i == 3) {
            return m3;
        } else if (i == 4) {
            return m4;
        } else
            return m5;

    }

    // getter for lab marks
    public double getLabmark(int i) {
        if (i == 1) {
            return m11;
        } else if (i == 2) {
            return m22;
        } else if (i == 3) {
            return m33;
        } else if (i == 4) {
            return m44;
        } else
            return m55;
    }

    // getter for Subjects name
    public String getSub(int i) {
        if (i == 1) {
            return this.s1;
        } else if (i == 2) {
            return this.s2;
        } else if (i == 3) {
            return this.s3;
        } else if (i == 4) {
            return this.s4;
        } else
            return this.s5;

    }

    // getter for theory + lab marks
    public double getTmark(int i) {
        if (i == 1) {
            return sm1;
        } else if (i == 2) {
            return sm2;
        } else if (i == 3) {
            return sm3;
        } else if (i == 4) {
            return sm4;
        } else
            return sm5;

    }

    // getter for GPA and CGPA
    public double getGpa() {
        return gpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}
