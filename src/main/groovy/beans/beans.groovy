class EmployeeBean implements Serializable {

    // private properties
    private String first
    private String last
    private String email
    // public non args constructor
    public EmployeeBean() {

    }

    // toString


    // getters setters
    String getFirst() {
        return first
    }

    void setFirst(String first) {
        this.first = first
    }

    String getLast() {
        return last
    }

    void setLast(String last) {
        this.last = last
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


EmployeeBean employeeBean = new EmployeeBean();

// wartosci z gettera
employeeBean.first = "bigos"
employeeBean.last = "last"

// wartosc jaka jest przypisana do zmiennej
employeeBean.@first




















