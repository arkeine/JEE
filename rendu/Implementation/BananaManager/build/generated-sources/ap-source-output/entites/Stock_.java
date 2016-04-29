package entites;

import entites.Address;
import entites.Package;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-29T12:31:12")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile CollectionAttribute<Stock, Package> packageCollection;
    public static volatile SingularAttribute<Stock, Integer> capacityMax;
    public static volatile SingularAttribute<Stock, Integer> capacityCurrent;
    public static volatile SingularAttribute<Stock, Integer> id;
    public static volatile SingularAttribute<Stock, String> label;
    public static volatile SingularAttribute<Stock, String> userid;
    public static volatile SingularAttribute<Stock, Address> addressid;

}