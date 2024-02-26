package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	public static int numTV = 0;
	
	
	public TV (Marca marca, boolean estado) {
		this.marca= marca;
		this.estado= estado;
		this.canal=1;
		this.volumen=1;
		this.precio=500;	
		
		TV.numTV++;	
	}
	
	
		public static void setNumTV(int numTV) {
			TV.numTV = numTV;
		}
		public static int getNumTV() {
			return TV.numTV;
		}
	
	
	public void setMarca(Marca marca) {
		this.marca= marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	
	public void setCanal(int canal) {
		if (this.estado==true && canal>=1 && canal<=120) {
		   this.canal= canal;
		   }
	}
	public int getCanal() {
		return canal;
	}
	
	
	public void setPrecio(int precio) {
		this.precio= precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	
	public void setVolumen(int volumen) {
		if (this.estado==true && volumen>=0 && volumen<=7) {
		    this.volumen=volumen;
		}	
	}
	public int getVolumen() {
		return volumen;
	}
	 
	 public void setControl(Control control) {
		 this.control= control;
	 }
	 public Control getControl() {
		 return control;
	 }
	
	
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	
	 public void canalDown() {
		 if (estado==true) {
			 if (canal>1 && canal<=120) {
				 canal--;		 
			 }
		 }
	 }
	 public void canalUp() {
		 if (estado==true) {
			 if (canal>=1 && canal<120) {
				 canal++;
			 }
		 }	 
	 }
	 
	 public void volumenDown() {
		 if (estado==true) {
			 if (volumen>0 && canal<=7) {
				 volumen--;
			 }
		 }
	 }
	 public void volumenUp() {
		 if (estado==true) {
			 if(volumen>=0 && volumen<7) {
				 volumen++;
			 }
		 }
	 } 
}