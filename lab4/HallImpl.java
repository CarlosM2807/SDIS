package servidor;
import java.util.Map;
import java.util.HashMap;

public class HallImpl extends java.rmi.server.UnicastRemoteObject implements shopping.Hall {
 
  private String nombreTienda;
  //Map<String,servidor.ShopImpl> tiendasHashMap = new HashMap<>();

  public HallImpl(String nombreTienda) throws java.rmi.RemoteException {
    super();
    this.nombreTienda = nombreTienda;
  }

  public shopping.Shop lookup(String nombreTienda) throws java.rmi.RemoteException {
       ShopImpl tiendaNueva = new ShopImpl(nombreTienda);
       //tiendasHashMap.put(tiendaNueva,nombreTienda);
       return tiendaNueva;
  }
}
