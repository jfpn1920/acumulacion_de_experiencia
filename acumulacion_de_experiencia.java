import java.util.Scanner;
public class acumulacion_de_experiencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] actividades = new String[10];
        String[] tipos = new String[10];
        String[] instituciones = new String[10];
        int[] horas = new int[10];
        String[] fechasInicio = new String[10];
        String[] fechasFinalizacion = new String[10];
        String[] niveles = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-----------------------------------------------//
        //--|menu_principal_acumulacion_de_experiencia|--//
        //-----------------------------------------------//
        do {
            System.out.println("menu principal acumulacion de experiencia");
            System.out.println("1) Registrar experiencia");
            System.out.println("2) Editar experiencia");
            System.out.println("3) Listar experiencias");
            System.out.println("4) Buscar experiencia");
            System.out.println("5) Eliminar experiencia");
            System.out.println("6) Mostrar acumulado");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //---------------------------//
                //--|registrar_experiencia|--//
                //---------------------------//
                case 1:
                    if (total >= actividades.length) {
                        System.out.println("No hay espacio para registrar mas experiencias.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de experiencia");
                    System.out.println("id de la experiencia a registrar: " + id);
                    System.out.print("nombre de la actividad o proyecto: ");
                    actividades[total] = entrada.nextLine();
                    System.out.print("tipo de experiencia: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("empresa o institucion: ");
                    instituciones[total] = entrada.nextLine();
                    System.out.print("cantidad de horas realizadas: ");
                    horas[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("fecha de inicio: ");
                    fechasInicio[total] = entrada.nextLine();
                    System.out.print("fecha de finalizacion: ");
                    fechasFinalizacion[total] = entrada.nextLine();
                    System.out.print("nivel de experiencia: ");
                    niveles[total] = entrada.nextLine();
                    System.out.print("estado: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Experiencia registrada correctamente.");
                    total++;
                    break;
                //------------------------//
                //--|editar_experiencia|--//
                //------------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen experiencias registradas.");
                        break;
                    }
                    System.out.println("Datos de las experiencias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Actividad: " + actividades[i] + " | Tipo: " + tipos[i] + " | Institucion: " + instituciones[i] + " | Horas: " + horas[i] + " | Inicio: " + fechasInicio[i] + " | Finalizacion: " + fechasFinalizacion[i] + " | Nivel: " + niveles[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la experiencia: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato de la experiencia");
                        System.out.print("Nueva actividad o proyecto: ");
                        actividades[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de experiencia: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nueva empresa o institucion: ");
                        instituciones[posicion] = entrada.nextLine();
                        System.out.print("Nueva cantidad de horas: ");
                        horas[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nueva fecha de inicio: ");
                        fechasInicio[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha de finalizacion: ");
                        fechasFinalizacion[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nivel de experiencia: ");
                        niveles[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Experiencia actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|listar_experiencias|--//
                //-------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen experiencias registradas.");
                    } else {
                        System.out.println("Lista de experiencias");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Actividad: " + actividades[i] + " | Tipo: " + tipos[i] + " | Institucion: " + instituciones[i] + " | Horas: " + horas[i] + " | Inicio: " + fechasInicio[i] + " | Finalizacion: " + fechasFinalizacion[i] + " | Nivel: " + niveles[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //------------------------//
                //--|buscar_experiencia|--//
                //------------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen experiencias registradas.");
                        break;
                    }
                    System.out.println("busqueda de experiencia");
                    System.out.print("ingresa la id para buscar experiencia: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la experiencia encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Actividad: " + actividades[posicion] + " | Tipo: " + tipos[posicion] + " | Institucion: " + instituciones[posicion] + " | Horas: " + horas[posicion] + " | Inicio: " + fechasInicio[posicion] + " | Finalizacion: " + fechasFinalizacion[posicion] + " | Nivel: " + niveles[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------------//
                //--|eliminar_experiencia|--//
                //--------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen experiencias registradas.");
                        break;
                    }
                    System.out.println("Datos de las experiencias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Actividad: " + actividades[i] + " | Tipo: " + tipos[i] + " | Institucion: " + instituciones[i] + " | Horas: " + horas[i] + " | Inicio: " + fechasInicio[i] + " | Finalizacion: " + fechasFinalizacion[i] + " | Nivel: " + niveles[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la experiencia a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            actividades[i] = actividades[i + 1];
                            tipos[i] = tipos[i + 1];
                            instituciones[i] = instituciones[i + 1];
                            horas[i] = horas[i + 1];
                            fechasInicio[i] = fechasInicio[i + 1];
                            fechasFinalizacion[i] = fechasFinalizacion[i + 1];
                            niveles[i] = niveles[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Experiencia eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|mostrar_acumulado|--//
                //-----------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen experiencias registradas.");
                        break;
                    }
                    int horasAcumuladas = 0;
                    for (int i = 0; i < total; i++) {
                        horasAcumuladas += horas[i];
                    }
                    String nivelAcumulado;
                    if (horasAcumuladas < 200) {
                        nivelAcumulado = "Inicial";
                    } else if (horasAcumuladas < 500) {
                        nivelAcumulado = "Intermedio";
                    } else {
                        nivelAcumulado = "Avanzado";
                    }
                    System.out.println("resumen de experiencia");
                    System.out.println("Actividades realizadas: " + total);
                    System.out.println("Horas acumuladas: " + horasAcumuladas);
                    System.out.println("Nivel de experiencia: " + nivelAcumulado);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Acumulacion de Experiencia.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}