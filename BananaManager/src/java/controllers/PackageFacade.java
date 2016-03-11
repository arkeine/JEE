/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entites.Package;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author arkeine
 */
@Stateless
public class PackageFacade extends AbstractFacade<Package> {
    @PersistenceContext(unitName = "BananaManagerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PackageFacade() {
        super(Package.class);
    }
    
}
