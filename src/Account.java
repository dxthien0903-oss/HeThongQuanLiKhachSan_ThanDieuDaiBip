public class Account {
    private String username;
    private String password;
    private String role;      
    private Employee employee; 

    public Account(String username, String password, String role, Employee employee) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.employee = employee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public boolean isAdmin() {
        return role != null && role.equalsIgnoreCase("ADMIN");
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", employee=" + employee +
                '}';
    }
}
