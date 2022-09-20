package servidor;

public class HallImplFase2 extends java.rmi.server.UnicastRemoteObject implements shopping.Hall{
        private final String nombre;

	public HallImplFase2(String nombre) throws java.rmi.RemoteException{
		super();
		this.nombre = nombre;
	}
	
	public shoping.Shop lookup(String nombreTienda) throws java.rmi.RemoteException{
		return tiendasMapa.get(nombreTienda);
	}

	public boolean create(String nombreTienda, Attendant att) throws java.rmi.RemoteException{
		ShopImpl tiendas = tiendasMapa.get(nombreTienda);
		if(tiendas == null){
			tienda = new ShopImpl(nombreTienda, att);
			System.out.println("El nombre de su tienda es: "+tienda);
			tiendasMapa.put(nombreTienda,tienda);
			return true;
		}else{
			return false;
		}
	}

	public void shut(String nombreTienda, Attendant att) throws java.rmi.RemoteException{
		System.out.println("Se va a cerrar: "+nombreTienda);
		ShopImpl tienda = tiendasMapa.get(nombreTienda);
		tienda.cierra(att);
	}
	
	public void open(String nombreTienda, Attendant att) throws java.rmi.RemoteException{
		System.out.println("Se va a abrir: "+nombreTienda);
		ShopImpl tienda = tiendasMapa.get(nombreTienda);
                tienda.abre(att);

	}
}
