import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Mascota {
    // Atributos
	int codigo;
    String nombre;
    String especie;
    int edad;
    ArrayList<Mascota> listaAnimales = new ArrayList<>();


//    //Constructor sin parametros
//    public Mascota() {
//    	  nombre = "Firu";
//          especie = "Default";
//          edad = 0;
//    }
    
    public void iniciar() {
    	int valid;
		do {
			valid = Integer.parseInt(JOptionPane.showInputDialog(null, "Programa para calcular IMC\n"
					+ "\n1) Ingresar mascota"
					+ "\n2) Consulta individual"
					+ "\n3) Consultar lista de mascotas"
					+ "\n4) ¿Que sonido hace mi mascota?"
					+ "\n5) Calcular edad humana"
					+ "\n6) Mayor o Menor de edad"
					+ "\n7) Salir"
					+ "\nIngrese una opcion:"));
			switch(valid) {
				case 1:
					ingresar();
					break;
				case 2:
					mostrarInformacionIndividual();
					break;
				case 3:
					mostrarInformacion();
					break;
				case 4:
					hacerSonido();
					break;
				case 5:
					obtenerEdadHumana();
					break;
				case 6:
					esMayorDeEdad();
					break;
				case 7:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta", "ALERTA", JOptionPane.WARNING_MESSAGE);
			}
		}while(valid != 7);
    }
    
    
    
    public void ingresar() {
    	codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID")); 
    	nombre = JOptionPane.showInputDialog("Ingrese nombre");
        especie = JOptionPane.showInputDialog("Ingrese especie");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad")); 
        Mascota Pets = new Mascota(codigo, nombre, especie, edad);
        listaAnimales.add(new Mascota(Pets.codigo, Pets.nombre, Pets.especie, Pets.edad));    
    }

    
    // Constructor con parametros
    public Mascota(int codigo, String nombre, String especie, int edad) {
    	this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInformacionIndividual() {
		String name = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
			for (int i = 0; i < listaAnimales.size(); i++) {
				if (listaAnimales.get(i).nombre.equalsIgnoreCase(name)) {
					System.out.println("mascota #" + (i+1)
							+ "\nID: " + listaAnimales.get(i).codigo
							+ "\nNombre: "+listaAnimales.get(i).nombre
							+ "\nEspecie:" + listaAnimales.get(i).especie
							+ "\nEdad: " + listaAnimales.get(i).edad + "\n");
				}
			}	
	}
    
    
    // Método para mostrar información de la mascota
    public void mostrarInformacion() {
    	for (int i = 0; i < listaAnimales.size(); i++) {
			System.out.println("mascota #" + (i+1)
					+ "\nID: " + listaAnimales.get(i).codigo
					+ "\nNombre: "+listaAnimales.get(i).nombre
					+ "\nEspecie:" + listaAnimales.get(i).especie
					+ "\nEdad: " + listaAnimales.get(i).edad+"\n");
		}
    }

    // Método para hacer que la mascota realice un sonido
    public void hacerSonido() {
    	String name = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
		for (int i = 0; i < listaAnimales.size(); i++) {
			if (listaAnimales.get(i).nombre.equalsIgnoreCase(name)) {
				if (listaAnimales.get(i).especie.equalsIgnoreCase("perro")) {
		            System.out.println("¡Guau guau!");
		        } else if (listaAnimales.get(i).especie.equalsIgnoreCase("gato")) {
		            System.out.println("¡Miau miau!");
		        } else {
		            System.out.println("La mascota no hace sonidos conocidos.");
		        }
			}
		}	
    }
    
 // Método para obtener la edad humana de la mascota
    public void obtenerEdadHumana() {
    	int edadHumana;
    	String name = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
    	for (int i = 0; i < listaAnimales.size(); i++) {
			if (listaAnimales.get(i).nombre.equalsIgnoreCase(name)) {
				if (listaAnimales.get(i).especie.equalsIgnoreCase("perro")) {
					edadHumana = listaAnimales.get(i).edad * 7;
					JOptionPane.showMessageDialog(null, "Su perr@ tendria " + edadHumana + " años en edad humana");
		        } else if (listaAnimales.get(i).especie.equalsIgnoreCase("gato")) {
		        	edadHumana = listaAnimales.get(i).edad * 5;
		        	JOptionPane.showMessageDialog(null, "Su gat@ tendria " + edadHumana + " años en edad humana");
		        } else {
		        	edadHumana = -1; // Valor no válido para especie desconocida
		        	JOptionPane.showMessageDialog(null, "No se puede calcular la edad humana de esta especie");
		        }
			}
		}	
    }

    // Método para verificar si la mascota es mayor de edad
    public void esMayorDeEdad() {
    	String name = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
		for (int i = 0; i < listaAnimales.size(); i++) {
			if (listaAnimales.get(i).nombre.equalsIgnoreCase(name)) {
				if (listaAnimales.get(i).edad >= 18) {
		            System.out.println("Su mascota es Mayor de edad");
		        }
				else {
		            System.out.println("Su mascota es Menor de edad");
		        }
			}
		}
    }
}

