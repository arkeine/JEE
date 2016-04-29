package entites;

import entites.Stock;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-29T12:31:12")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> number;
    public static volatile SingularAttribute<Address, String> country;
    public static volatile SingularAttribute<Address, String> distric;
    public static volatile SingularAttribute<Address, String> town;
    public static volatile CollectionAttribute<Address, Stock> stockCollection;
    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, Integer> id;
    public static volatile SingularAttribute<Address, String> userid;
    public static volatile SingularAttribute<Address, String> npa;

}