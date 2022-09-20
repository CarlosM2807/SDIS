package cliente;

public class AttendantImpl extends java.rmi.server.UnicastRemoteObject implements shopping.Attendant{
	private final String nombreAt;

	public AttendantImpl(String nombreTienda) throws java.rmi.RemoteException{
		super();
		this.nombreAt = nombreTienda;
	}

	public String update(String peticion) throws java.rmi.RemoteException{
		String responder = nombreAt + "su peticion: "+peticion;
		return responder;
	}
}
