
package login;

public class BananaPrincipal implements java.security.Principal {
    private final String name;
    private final String role;
    private final int accessLevel;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getAccessLevel() { return accessLevel; }

    public BananaPrincipal(String name, String role, int accessLevel) {
        this.name = name;
        this.role = role;
        this.accessLevel = accessLevel;
    }
    
    public BananaPrincipal(String name) {
        this.name = name;
        this.role = "";
        this.accessLevel = 1;
    }

}
