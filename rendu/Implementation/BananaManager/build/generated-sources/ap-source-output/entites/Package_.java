package entites;

import entites.Bananatype;
import entites.Command;
import entites.Stock;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-29T12:31:12")
@StaticMetamodel(Package.class)
public class Package_ { 

    public static volatile SingularAttribute<Package, Date> gatherdate;
    public static volatile SingularAttribute<Package, Integer> hangar;
    public static volatile CollectionAttribute<Package, Stock> stockCollection;
    public static volatile SingularAttribute<Package, Integer> client;
    public static volatile SingularAttribute<Package, Bananatype> bananatypeid;
    public static volatile CollectionAttribute<Package, Command> commandCollection;
    public static volatile SingularAttribute<Package, Integer> id;
    public static volatile SingularAttribute<Package, Integer> productor;
    public static volatile SingularAttribute<Package, Boolean> isTransit;

}