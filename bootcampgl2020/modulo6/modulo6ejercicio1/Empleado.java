package modulo6ejercicio1;

public class Empleado extends Persona {

	private int id;
	private double sueldoBase;
	private double horasExtrasRealizadasEnElMes;
	private int tipoIRPF;
	private boolean casado; 
	private int cantidadHijos;
	private static double importeHoraExtra;
	
	public Empleado() {}
	
	public Empleado(int dni) {
		super.setDni(dni);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getHorasExtrasRealizadasEnElMes() {
		return horasExtrasRealizadasEnElMes;
	}

	public void setHorasExtrasRealizadasEnElMes(double horasExtrasRealizadasEnElMes) {
		this.horasExtrasRealizadasEnElMes = horasExtrasRealizadasEnElMes;
	}

	public int getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(int tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}
	
	public double calculoComplementoHorasExtra(double cantidadHorasExtra) {
		double complementoHorasExtra = importeHoraExtra * cantidadHorasExtra; 
		return complementoHorasExtra;
	}
	
	public double calculoSueldoBruto(double sueldoBase, double cantidadHorasExtra) {
		double sueldoBruto = sueldoBase + this.calculoComplementoHorasExtra(cantidadHorasExtra);
		return sueldoBruto;
	}
	
	public double calculoRetenciones(int tipoIRPF, boolean casado, int cantidadHijos, double sueldoBase, double cantidadHorasExtra) {
		double porcentajeIRPF = tipoIRPF;
		if(casado) {
			porcentajeIRPF -= 2;			
		}
		
		if(cantidadHijos > 0) {
			porcentajeIRPF -= cantidadHijos;
		}
		
		double sueldoBruto = this.calculoSueldoBruto(sueldoBase, cantidadHorasExtra);
		double totalRetencion = sueldoBruto * (porcentajeIRPF/100);
		
		return totalRetencion;
	}
	
	public void mostrarDatos() {
		System.out.print(this.getDni());
		System.out.print("  ");
		System.out.println(this.getNombre());
		System.out.println("Sueldo base: " + this.getSueldoBase());
		System.out.println("Horas extras: " + this.getHorasExtrasRealizadasEnElMes());
		System.out.println("Tipo IRPF: " + this.getTipoIRPF());
		if(this.isCasado()) {
			System.out.println("Casado: Si");
		} else {
			System.out.println("Casado: No");
		}
		System.out.println("Número de hijos: " + this.getCantidadHijos());
	}
	
}
