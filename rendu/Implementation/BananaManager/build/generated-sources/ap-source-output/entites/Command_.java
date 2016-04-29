package entites;

import entites.Package;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-29T12:31:12")
@StaticMetamodel(Command.class)
public class Command_ { 

    public static volatile CollectionAttribute<Command, Package> packageCollection;
    public static volatile SingularAttribute<Command, Date> datePayement;
    public static volatile SingularAttribute<Command, Date> dateOrder;
    public static volatile SingularAttribute<Command, Integer> id;
    public static volatile SingularAttribute<Command, String> userid;

}