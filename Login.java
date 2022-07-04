class Login {
    public Boolean loginNow(String username, String password){
        System.out.println("Hello from login");
        return username.equalsIgnoreCase(password);
    } 
}
