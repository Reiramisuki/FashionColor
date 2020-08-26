package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.connectors.Connector;
import ar.org.centro8.curso.java.entidades.Cliente;
import ar.org.centro8.curso.java.entidades.Detalle;
import ar.org.centro8.curso.java.entidades.Factura;
import ar.org.centro8.curso.java.entidades.Rebaja;
import ar.org.centro8.curso.java.entidades.Ropa;
import ar.org.centro8.curso.java.enums.Color;
import ar.org.centro8.curso.java.enums.Estacion;
import ar.org.centro8.curso.java.enums.Genero;
import ar.org.centro8.curso.java.enums.GeneroRopa;
import ar.org.centro8.curso.java.enums.Promocion;
import ar.org.centro8.curso.java.enums.Talle;
import ar.org.centro8.curso.java.repositories.interfaces.I_ClienteRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_DetalleRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_FacturaRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_RebajaRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_RopaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.ClienteRepository;
import ar.org.centro8.curso.java.repositories.jdbc.DetalleRepository;
import ar.org.centro8.curso.java.repositories.jdbc.FacturaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.RebajaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.RopaRepository;
import java.util.List;

public class TestRepositories {
    public static void main(String[] args) {  
     I_ClienteRepository c=new ClienteRepository(Connector.getConnection());
        List<Cliente> l =c.getLikeDni(30001546);
        System.out.print(l);
       
  System.out.println("....Cliente....");
        I_ClienteRepository cl=new ClienteRepository(Connector.getConnection());
        List<Cliente> f =cl.getLikeApellido("Martinez");
        System.out.println(f);
        
        System.out.println("....save......");
        Cliente clie= new Cliente("Elisa", "sol", 43456789 , 44445555,"eliSol@gmail.com", Genero.f);
        cl.save(clie);
        System.out.println(clie);
        
        System.out.println("...update....");
        Cliente cliese= new Cliente("Elisa Ramires", "soledad",43456789, 44445555,"eliSol@gmail.com", Genero.f);
        cl.update(cliese);
        System.out.println(cliese);
        
        System.out.println("....remove....");
        Cliente clies= new Cliente("Elisa", "sol", 43456789 , 3456789,"eliSol@gmail.com", Genero.f);
        cl.remove(clies);
        System.out.println(clies);
        
        List<Cliente> ccl= cl.getAll();
        System.out.println(ccl);
        
System.out.println("....2....");
        I_ClienteRepository cr=new ClienteRepository(Connector.getConnection());
        List<Cliente> n =cr.getAll();
        System.out.println(n);
      
System.out.println("....Factura....");
        I_FacturaRepository fr=new FacturaRepository(Connector.getConnection());
        List<Factura> j=fr.getAll();
        System.out.println(j);
        
System.out.println("...Id_cliente.....");   
        I_FacturaRepository frr=new FacturaRepository(Connector.getConnection());
        List<Factura> t=frr.getLikeId_cliente(4);
        System.out.println(t);
        
System.out.println("....Id_rebaja...."); 
        I_RebajaRepository o=new RebajaRepository(Connector.getConnection());
        List<Rebaja>fat = o.getLikeId(2);
        System.out.println(fat);
  
        
 // tener cargada la base de datos sino al estar vacia dara error       
//System.out.println("....Detalle...."); 
//      I_DetalleRepository crw=new DetalleRepository(Connector.getConnection());
//      List<Detalle> nw = crw.getAll();
//      System.out.println(nw);
      
      
System.out.println("....lista ropas...."); 
      I_RopaRepository x=new RopaRepository(Connector.getConnection());
      List<Ropa> xx =x.getAll();
      System.out.println(xx);
    
System.out.println("....Camisa...."); 
      I_RopaRepository qtq=new RopaRepository(Connector.getConnection());
      List<Ropa> hqt =qtq.getLikeRopaD("camisa");
        System.out.println(hqt);
        
System.out.println("...UPDATe ROpa....."); 
        I_RopaRepository ve=new RopaRepository(Connector.getConnection());
        Ropa ropa=new Ropa(10,"campera",Talle.l,Color.amarillo,GeneroRopa.unisex,Estacion.primavera_verano,4,4500);
        ve.update(ropa);
        System.out.println(ropa);
        
         List<Ropa> ro =ve.getLikeRopaD("campera");
         System.out.println(ro);
        
         System.out.println("....remove......");
         Ropa ropaa=new Ropa(10,"campera",Talle.l,Color.amarillo,GeneroRopa.unisex,Estacion.primavera_verano,4,4500);
        ve.remove(ropaa);
        
        List<Ropa> ropp =ve.getAll();
        System.out.println(ropp);
        
System.out.println("....save Rebaja...."); 
      I_RebajaRepository ty=new RebajaRepository(Connector.getConnection());
      Rebaja rebaja=new Rebaja(8,"colores",Promocion.ninguna,25);
      ty.save(rebaja);
      System.out.println(rebaja);
      
       List<Rebaja> re= ty.getLikeDescripcion("colores");
        System.out.println(re);
      
      System.out.println("...........remove...........");
      Rebaja rebajas=new Rebaja(8, "colores", Promocion.ninguna, 25);
      ty.remove(rebajas);
      
      List<Rebaja> res= ty.getAll();
        System.out.println(res);
      
        
 }
}
