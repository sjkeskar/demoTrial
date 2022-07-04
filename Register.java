class Register {
    public Boolean registerNow(String username, String password) {
        return username.equalsIgnoreCase(password);
    }
}
