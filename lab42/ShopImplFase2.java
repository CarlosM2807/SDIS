package servidor;

public class ShopImplFase2 extends java.rmi.server.UnicastRemoteObject implements shopping.Shop {
  
  private String nombreTienda;
  private boolean estado;
  private shopping.Attendant dep;

  public ShopImplFase2(String nombreTienda, boolean estado, shopping.Attendant dep) throws java.rmi.RemoteException {
    super();
    this.nombreTienda = nombreTienda;
    this.estado = false;
    this.dep = att;
  }

  public String use(String peticion) throws java.rmi.RemoteException {
	  if(estado == true){
		String respuesta = dep.update(peticion);
	  }else{
		String cerrado = "Tienda esta cerrada";
		return cerrado;
  	}
  }


  public void abre(shopping.Attendant attAbrir){
  }

  //falta el codigo no dio tiempo

  public void cierra(shopping.Attendant attCerrar){
  }
}

