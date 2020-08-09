package modulo6ejercicio1;

import java.util.Scanner;

public class Inicio {
	
	public static void main( String[] args ) {
		/*
		System.out.println("");
		Empleado empleado = new Empleado();
		
		empleado.setDni(12345678);
		empleado.setNombre("Pepe");
		empleado.setSueldoBase(30000.0);
		empleado.setCantidadHijos(2);
		empleado.setCasado(true);
		empleado.setHorasExtrasRealizadasEnElMes(2);
		empleado.setId(300);
		empleado.setTipoIRPF(12);
		
		Empleado.setImporteHoraExtra(325.00);
		
		double horasExtras = empleado.calculoComplementoHorasExtra(empleado.getHorasExtrasRealizadasEnElMes());
		System.out.println(horasExtras);
		
		double sueldo = empleado.calculoSueldoBruto(empleado.getSueldoBase(), empleado.getHorasExtrasRealizadasEnElMes());
		System.out.println(sueldo);
		
		double retenciones = empleado.calculoRetenciones(empleado.getTipoIRPF(), empleado.isCasado(), empleado.getCantidadHijos(), empleado.getSueldoBase(), empleado.getHorasExtrasRealizadasEnElMes());
		System.out.println(retenciones);
		
		empleado.mostrarDatos();
		*/
		
		Scanner teclado = new Scanner(System.in);
		int cantidadEmpleados = 0;
		
		do {
			if(cantidadEmpleados > 20) {
				System.out.println("Debe ingresar una cantidad igual o menor a 20");
			}
			System.out.println("Ingrese la cantidad de empleados, no mayor a veinte: ");
			cantidadEmpleados = teclado.nextInt();
		}while(cantidadEmpleados > 0 && cantidadEmpleados > 20);
		
		Empleado[] empleados = new Empleado[cantidadEmpleados];
		
		for(int i = 0; i < empleados.length; i++) {
			Empleado empleado = new Empleado();
			
			System.out.println("Ingrese el nombre del empleado: ");
			teclado.nextLine();
			String nombre = teclado.nextLine();
			empleado.setNombre(nombre);
			
			System.out.println("Ingrese el dni del empleado: ");
			int dni = teclado.nextInt();
			empleado.setDni(dni);
			
			System.out.println("Ingrese el sueldo base del empleado: ");
			double sueldoBase = teclado.nextDouble();
			empleado.setSueldoBase(sueldoBase);
			
			System.out.println("Ingrese la cantidad de hijos del empleado: ");
			int cantidadHijos = teclado.nextInt();
			empleado.setCantidadHijos(cantidadHijos);
			
			int decision = 0;
			do {
			System.out.println("Ingrese si el empleado esta casado: ");
			System.out.println("SI -> 1");
			System.out.println("NO -> 2");
			decision = teclado.nextInt();
			}while(decision != 1 || decision != 2);
			if(decision == 1) {
				empleado.setCasado(true);
			} else {
				empleado.setCasado(false);
			}
			
			System.out.println("Ingrese la horas extras realizadas en el mes por el empleado: ");
			double horasExtras = teclado.nextDouble();
			empleado.setHorasExtrasRealizadasEnElMes(horasExtras);
			
			System.out.println("Ingrese el legajo del empleado: ");
			int legajo = teclado.nextInt(); 
			empleado.setId(legajo);
			
			System.out.println("Ingrese el tipo de IRPF: ");
			int tipoIRPF = teclado.nextInt();
			empleado.setTipoIRPF(tipoIRPF);
			
			empleados[i] = empleado;
		}
		
		System.out.println("Ingrese el importe de la hora extra: ");
		double valorHoraExtra = teclado.nextDouble();
		Empleado.setImporteHoraExtra(valorHoraExtra);
		
		Empleado empleadoMasCobra = empleados[0];
		Empleado empleadoMenosCobra = empleados[0];
		Empleado empleadoMasCobraHoraExtra = empleados[0];
		Empleado empleadoMenosCobraHoraExtra = empleados[0];
		Empleado aux;
		
		for(int i=0; i < empleados.length; i ++) {
	        			
			//Empleado que mas cobra
			if(empleados[i].getSueldoBase() > empleadoMasCobra.getSueldoBase() ) {
				empleadoMasCobra = empleados[i];
			}
			
			//Empleado que menos cobra
			if(empleados[i].getSueldoBase() > empleadoMenosCobra.getSueldoBase() ) {
				empleadoMenosCobra = empleados[i];
			}
			
			//Empleado que mas cobra por hora extra
			if(empleados[i].getHorasExtrasRealizadasEnElMes() > empleadoMasCobraHoraExtra.getHorasExtrasRealizadasEnElMes() ) {
				empleadoMasCobraHoraExtra = empleados[i];
			}
			
			//Empleado que menos cobra por hora extra
			if(empleados[i].getHorasExtrasRealizadasEnElMes() > empleadoMenosCobraHoraExtra.getHorasExtrasRealizadasEnElMes() ) {
				empleadoMenosCobraHoraExtra = empleados[i];
			}
			
		}
		
		for (int i = 0; i < empleados.length - 1; i++) {
            for (int j = 0; j < empleados.length - i - 1; j++) {
            	if (empleados[j + 1].calculoSueldoBruto(empleados[j + 1].getSueldoBase(), empleados[j + 1].getHorasExtrasRealizadasEnElMes()) < empleados[j].calculoSueldoBruto(empleados[j].getSueldoBase(), empleados[j].getHorasExtrasRealizadasEnElMes())) {
                    aux = empleados[j + 1];
                    empleados[j + 1] = empleados[j];
                    empleados[j] = aux;
                }
            }
        }
		
		System.out.println("El empleado que mas cobra es " + empleadoMasCobra.getNombre() + "con salario de $" + empleadoMasCobra.getSueldoBase());
		System.out.println("El empleado que menos cobra es " + empleadoMenosCobra.getNombre() + "con salario de $" + empleadoMenosCobra.getSueldoBase());
		System.out.println("El empleado que mas cobra por horas extras es " + empleadoMasCobraHoraExtra.getNombre() + "con un total de $" + empleadoMasCobraHoraExtra.calculoComplementoHorasExtra(empleadoMasCobraHoraExtra.getHorasExtrasRealizadasEnElMes()));
		System.out.println("El empleado que menos cobra por horas extras es " + empleadoMenosCobraHoraExtra.getNombre() + "con un total de $" + empleadoMenosCobraHoraExtra.calculoComplementoHorasExtra(empleadoMenosCobraHoraExtra.getHorasExtrasRealizadasEnElMes()));
		
		System.out.println("Lista de empleados: ");
		for (int i = 0; i < empleados.length; i++ ) {
			System.out.println("Nombre: " + empleados[i].getNombre() + " Salario: " + empleados[i].calculoSueldoBruto(empleados[i].getSueldoBase(), empleados[i].getHorasExtrasRealizadasEnElMes()));
		}
		
    }

}


