
package login;

public class BananaPrincipal implements java.security.Principal {
    private String name;
 
    public BananaPrincipal(String name) {
        System.out.println("VOICI UNE CREATION AVEC "+name);
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
}
