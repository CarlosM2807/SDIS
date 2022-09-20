package servidor;

public class ShopImpl extends java.rmi.server.UnicastRemoteObject implements shopping.Shop {
  
  private String nombreTienda;
  public ShopImpl(String nombreTienda) throws java.rmi.RemoteException {
    super();
    this.nombreTienda = nombreTienda;
  }

  public String use(String peticion) throws java.rmi.RemoteException {
	  System.out.println("Peticion: "+peticion);
    	return "Soy una tienda de nombre " + nombreTienda;
  }
}

