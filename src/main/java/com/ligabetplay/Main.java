package com.ligabetplay;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.ligabetplay.models.*;

public class Main {
    
    public static void main(String[] args) {
        // Reportes
        Scanner sc = new Scanner(System.in);
        // Creación del Array equipos
        ArrayList<Equipos> equipo = new ArrayList<>();

        // Creación del Array Partido
        ArrayList<Partidos> partido = new ArrayList<>();
        
        // Creación del Array Jugador
        ArrayList<Jugador> jugador = new ArrayList<>();

        // Creación del Array Cuerpo Médico
        ArrayList<CuerpoMedico> cuerpoMedico = new ArrayList<>();
        
        // Creación del Array Cuerpo Técnico
        ArrayList<CuerpoTecnico> cuerpoTecnico = new ArrayList<>();
        
        // Array rol Cuerpo Técnico
        String [] rolCuerpoTecnico = {"Técnico", "Asistente Técnico", "Preparador físico"};

        // Array rol cuerpo médico
        String [] rolCuerpoMedico = {"Médico", "Fisioterapeuta"};

        // Array posiciones
        String[] posiciones = {
            "Portero",
            "Defensa Central",
            "Lateral Derecho",
            "Lateral Izquierdo",
            "Defensa Central (Sweeper)",
            "Centrocampista Defensivo",
            "Centrocampista Central",
            "Centrocampista Ofensivo",
            "Extremo Derecho",
            "Extremo Izquierdo",
            "Delantero Centro",
            "Segundo Delantero",
            "Extremo Derecho (Delantero)",
            "Extremo Izquierdo (Delantero)"
    };


        // Creación del Array Partido
        principal: while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar Equipo \n2. Ingresar Datos Partido \n3. Reportes \n4.Terminar");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarEquipo: while (true) {
                        int generarId = equipo.size() + 1;
                        int generarIdCuerpoTecnico = cuerpoTecnico.size() + 1;
                        int generarIdCuerpoMedico = cuerpoMedico.size() + 1;
                        int generarIdJugador = jugador.size() + 1;

                        // Ingresar Equipo
                        System.out.println("Ingrese el nombre del equipo a registrar:");
                        String nombreEquipo = sc.next();
                        equipo.add(new Equipos(generarId, nombreEquipo, 0, 0, 0, 0, 0, 0, 0));
                        

                        // Ingresar cuerpo técnico
                        registrarCuerpoTecnico: while (true) {
                            System.out.println("Seleccione el rol del cuerpo técnico");
                            for (int i = 0; i < rolCuerpoTecnico.length; i++) {
                                System.out.println(i+1 + ". " + rolCuerpoTecnico[i]);
                            }
                            System.out.println("Seleccione el rol");
                            String rol = rolCuerpoTecnico[sc.nextInt()-1];

                            System.out.println("Ingrese el nombre");
                            String nombreCuerpoTecnico = sc.next();

                            System.out.println("Ingrese el apellido");
                            String apellidoCuerpoTecnico = sc.next();

                            System.out.println("Ingrese la edad");
                            String edadCuerpoTecnico = sc.next();
                           
                            cuerpoTecnico.add(new CuerpoTecnico(generarIdCuerpoTecnico, nombreCuerpoTecnico, apellidoCuerpoTecnico, edadCuerpoTecnico, rol, generarId));

                            System.out.println("1. Ingrear otro miembro del cuerpo técnico \nx. Volver");
                            String op = sc.next();
                            if (op.equals("x")) {
                                break registrarCuerpoTecnico;
                            }
                        }

                        registrarCuerpoMedico: while (true) {
                            System.out.println("Seleccione el rol del cuerpo médico");
                            for (int i = 0; i < rolCuerpoMedico.length; i++) {
                                System.out.println(i+1 + ". " + rolCuerpoMedico[i]);
                            }
                            System.out.println("Seleccione el rol");
                            String rol = rolCuerpoMedico[sc.nextInt()-1];

                            System.out.println("Ingrese el nombre");
                            String nombreCuerpoMedico = sc.next();

                            System.out.println("Ingrese el apellido");
                            String apellidoCuerpoMedico = sc.next();

                            System.out.println("Ingrese la edad");
                            String edadCuerpoMedico = sc.next();

                            cuerpoMedico.add(new CuerpoMedico(generarIdCuerpoMedico, nombreCuerpoMedico, apellidoCuerpoMedico, edadCuerpoMedico, rol, generarId));

                            System.out.println("1. Ingrear otro miembro del cuerpo Médico \nx. Volver");
                            String op = sc.next();
                            if (op.equals("x")) {
                                break registrarCuerpoMedico;
                            }
                        }

                        registrarJugador: while (true) {
                            System.out.println("Ingrese el nombre del jugador");
                            String nombreJugador = sc.next();

                            System.out.println("Ingrese el apellido del jugador");
                            String apellidoJugador = sc.next();

                            System.out.println("Ingrese la edad");
                            String edadJugador = sc.next();

                            System.out.println("Ingrese el dorsal");
                            int dorsalJugador = sc.nextInt();

                            System.out.println("Seleccione la posición de juego: ");
                            for (int i = 0; i < posiciones.length; i++) {
                                System.out.println(i+1 + ". " + posiciones[i]);
                            }
                            String posicionJuego = posiciones[sc.nextInt()];

                            System.out.println("Ingrese la nacionalidad del jugador");
                            String nacionalidadJugador = sc.next();

                            LocalDate fechaIngresoJugador = LocalDate.now();

                            jugador.add(new Jugador(generarIdJugador, nombreJugador, apellidoJugador, edadJugador, generarIdJugador, dorsalJugador, posicionJuego, nacionalidadJugador, fechaIngresoJugador));

                            System.out.println("1. Ingrear otro jugador \nx. Volver");
                            String op = sc.next();
                            if (op.equals("x")) {
                                break registrarJugador;
                            }

                        }

                        System.out.println("1. Ingrear otro Equipo \nx. Volver");
                        String op = sc.next();
                        if (op.equals("x")) {
                            break registrarEquipo;
                        }
                    }
                    break;
                    
                case 2:
                    registrarPartido: while (true) {
                        System.out.println("A continuación se muestran los equipos registrados");
                        equipo.forEach( equipos -> {
                            System.out.println(equipos.getId() + " " + equipos.getNombreEquipo());
                        });
                        
                        if (equipo.size() == 0) {
                            System.out.println("No hay Equipos Registrados \nDebe registrar un equipo: ");
                            break registrarPartido;
                        } else if (equipo.size() == 1) {
                            System.out.println("Sólo hay un equipo registrado \nDebe tener más de un equipo registrado");
                            break registrarPartido;
                        } else {
                            System.out.println("Ingrese el día, mes y año en que se jugó el partido");
                            Partidos myPartido = new Partidos(opcion, opcion, opcion, null, null, opcion, opcion);
                            System.out.println("Día: ");
                            myPartido.setDia(sc.nextInt());

                            System.out.println("Mes: ");
                            myPartido.setMes(sc.nextInt());

                            System.out.println("Año: ");
                            myPartido.setAnno(sc.nextInt());

                            // Ingresar Equipos:
                            System.out.println("A continuación se muestran los equipos registrados");
                            equipo.forEach( equipos -> {
                                System.out.println(equipos.getId() + " " + equipos.getNombreEquipo());
                            });

                            // Equipo visitante
                            System.out.println("Ingrese el id del equipo visitante: ");
                            Equipos equipoVisitante = buscarPorId(sc.nextInt(), equipo);
                            System.out.println("Ingrese el marcador del equipo visitante: ");
                            // myPartido.setMarcadorVisitante(marcadorVisitante);
                            int marcadorVisitante = sc.nextInt();
                            
                            System.out.println(equipoVisitante.getNombreEquipo());
                            // Mostrar los jugadores que pertenecen al equipo. Debe hacer lo mismo para los jugadores locales
                            if (marcadorVisitante > 0) {
                                registrarGoles: while(true){
                                    System.out.println("Lista de Jugadores: ");
                                    for(Jugador j: jugador){
                                        if (j.getIdEquipo() == equipoVisitante.getId()) {
                                            System.out.println(j.getId() + " " + j.getNombre().concat(j.getApellido()));
                                        }
                                    }
                                    System.out.println("Seleccione el jugador que hizo gol: ");
                                    int jugadorGol =Integer.parseInt(sc.nextLine());
                                    Jugador objetoJugadorVisitante =  buscarPorIdJugador(jugadorGol, jugador);

                                    System.out.println("Ingrese el número de goles que anotó " + objetoJugadorVisitante.getNombre());
                                    int golesAnotadosJuagorVisitante = sc.nextInt();

                                    objetoJugadorVisitante.setGolesAnotados(objetoJugadorVisitante.getGolesAnotados() + golesAnotadosJuagorVisitante);

                                    System.out.println("1. Ingrear otro Jugador \nx. Volver");
                                    String op = sc.next();
                                    if (op.equals("x")) {
                                        break registrarGoles;
                                    }
                                }

                                System.out.println("1.Registrar tarjetas a jugador \nx.Seguir");
                                int op = sc.nextInt();
                                if (op == 1) {
                                    registrarTarjetas: while (true) {
                                        System.out.println("Lista de Jugadores: ");
                                        for(Jugador j: jugador){
                                            if (j.getIdEquipo() == equipoVisitante.getId()) {
                                                System.out.println(j.getId() + " " + j.getNombre().concat(j.getApellido()));
                                            }
                                        }
                                        System.out.println("Seleccione el jugador: ");
                                        int idJugadorVisitante =Integer.parseInt(sc.nextLine());
                                        Jugador objetoTarjetaVisitante =  buscarPorIdJugador(idJugadorVisitante, jugador);

                                        System.out.println("Registre el tipo de tarjeta del jugador: ");
                                        System.out.println("1. Tarjeta Roja \n2.Tarjeta Amarilla");
                                        int tarjeta = sc.nextInt();
                                        if (tarjeta == 1) {
                                            objetoTarjetaVisitante.setGolesAnotados(objetoTarjetaVisitante.getTotalTr() + 1);
                                        } else if (tarjeta == 2) {
                                            objetoTarjetaVisitante.setGolesAnotados(objetoTarjetaVisitante.getTotalTa() + 1);
                                        }
                                        System.out.println("1.Ingresar tarjetas a otro jugador Visitante \nx. Volver");
                                        String ingresarTarget = sc.next();
                                        if (ingresarTarget.equals("x")) {
                                            break registrarTarjetas;
                        }
                                    }
                                }
                                
                                
                            }
                            


                            // Equipo Local
                            System.out.println("Ingrese el id del equipo Local:");
                            // myPartido.setEquipoLocal(sc.next());
                            Equipos equipoLocal = buscarPorId(sc.nextInt(), equipo);

                            System.out.println("Ingrese el marcador del equipo local: ");
                            // myPartido.setMarcadorLocal(sc.nextInt());

                            int marcadorLocal = sc.nextInt();
                    
                            if (marcadorLocal >0) {

                                            
                                
                            }












                            if (marcadorVisitante > marcadorLocal) {
                                modificacionEquipo(equipoVisitante, equipoLocal, marcadorVisitante, marcadorLocal);
                            } else {
                                modificacionEquipo(equipoLocal, equipoVisitante, marcadorLocal, marcadorVisitante);
                            }

                            System.out.println("1. Ingrear otro partido \nx. Volver");
                            String op = sc.next();
                            if (op.equals("x")) {
                                equipo.forEach(equipos -> {
                                    System.out.println("Equipo: " + equipos.getNombreEquipo());
                                    System.out.println("Partidos Jugados: " + equipos.getPj());
                                    System.out.println("Partidos Ganados: " + equipos.getPg());
                                    System.out.println("Partidos Perdidos: " + equipos.getPp());
                                    System.out.println("Partidos Empatados: " + equipos.getPr());
                                    System.out.println("Goles a favor: " + equipos.getGf());
                                    System.out.println("Goles en contra: " + equipos.getGc());
                                    System.out.println("Puntos totales: " + equipos.getTp());

                                });
                                break registrarPartido;
                            }
                        }
                    }
                    break;
                case 3:
                
                reportes: while (true) {
                    System.out.print("Selecione el reporte que desea visualizar: \n1. Equipo que más goles anotó \n2. Equipo con más puntos \n3. Equipo que ganó más partidos \n4. Total de goles por equipo \n5. Promedio de goles anotados en el torneo \n6. Regresar \n");
        
                    int op = sc.nextInt();
        
                    if (op == 1) {
                        registroMasGoles(equipo);
                    } else if (op == 2) {
                        registroMasPuntos(equipo);
                    }else if (op == 3) {
                        registroMasPartidosGanados(equipo);
                    }else if (op == 4) {
                        registroTotalGoles(equipo);
                    }else if (op == 5) {
                         registroPromedioGoles(equipo);
                    }else if (op == 6){
                        
                        break reportes;
                    }else {
                        System.out.println("Debe ingresar una opción válida");
                    }
                }
                break;
                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break principal;

                default:
                    System.out.println("Debe ingresar una opción válida");
                    break;
            }
        }
        
    }

    public static Jugador buscarPorIdJugador(int id, ArrayList<Jugador> team) {
        Jugador busqueda = null;
        
        for (Jugador jugador : team) {
            if (jugador.getId() == id) {
                busqueda = jugador;
            }
        }

        return busqueda;
    }

    public static Equipos buscarPorId(int id, ArrayList<Equipos> team) {
        Equipos busqueda = null;
        
        for (Equipos equipo : team) {
            if (equipo.getId() == id) {
                busqueda = equipo;
            }
        }

        return busqueda;
    }

    public static void registroMasGoles(ArrayList<Equipos> equipo){
        Equipos equipoMasGoles = null;
                        // Recorrer la lista
                        for (Equipos equipos : equipo) {
                            if (equipoMasGoles == null || equipos.getGf() > equipoMasGoles.getGf()) {
                                equipoMasGoles = equipos;
                            }
                        }
        
                        // Mostrar equipo con más goles:
                        if (equipoMasGoles != null) {
                            System.out.println("Equipo con más goles: " + equipoMasGoles.getNombreEquipo());
                        }
    }

    public static void registroMasPuntos(ArrayList<Equipos> equipo){    
        Equipos equipoMasPuntos = null;
                        for (Equipos equipos : equipo) {
                            if (equipoMasPuntos == null || equipos.getTp() > equipoMasPuntos.getTp()) {
                                equipoMasPuntos = equipos;
                            }
                        }
        
                        if (equipoMasPuntos != null) {
                            System.out.println("Equipo con más puntos: " + equipoMasPuntos.getNombreEquipo());
                        }
    }

    public static void registroMasPartidosGanados(ArrayList<Equipos> equipo) {
        Equipos equipoMasPartidosGanados = null;
                        for (Equipos equipos : equipo) {
                            if (equipoMasPartidosGanados == null || equipos.getPg() > equipoMasPartidosGanados.getPg()) {
                                equipoMasPartidosGanados = equipos;
                            }
                        }
        
                        if (equipoMasPartidosGanados != null) {
                            System.out.println("Equipo con más partidos ganados: " + equipoMasPartidosGanados.getNombreEquipo());
                        }
    }

    public static void registroTotalGoles(ArrayList<Equipos> equipo){
        int totalGoles = 0;
                        for (Equipos equipos : equipo) {
                            totalGoles += equipos.getGf();
                        }
                        System.out.println(totalGoles);
    }

    public static void registroPromedioGoles(ArrayList<Equipos> equipo){
        int totalGoles = 0;
                        for (Equipos equipos : equipo) {
                            totalGoles += equipos.getGf();
                          
                        }
                        System.out.println(totalGoles/equipo.size());
    }

    // El void se usa cuando no se retorna nada
    public static void modificacionEquipo(Equipos ganador, Equipos perdedor, int marcadorGanador, int marcadorPerdedor) {
        if (marcadorGanador == marcadorPerdedor) {
            // Empate
            ganador.setPj(ganador.getPj() + 1);
            ganador.setPr(ganador.getPr() + 1);
            ganador.setGf(ganador.getGf() + marcadorGanador);
            ganador.setGc(ganador.getGc() + marcadorPerdedor);
            ganador.setTp(ganador.getTp() + 1);

            perdedor.setPj(perdedor.getPj() + 1);
            perdedor.setPr(perdedor.getPr() + 1);
            perdedor.setGf(perdedor.getGf() + marcadorPerdedor);
            perdedor.setGc(perdedor.getGc() + marcadorPerdedor);
            perdedor.setTp(perdedor.getTp() + 1);
        } else {
            // Puntos ganador
            ganador.setPj(ganador.getPj() + 1);
            ganador.setPg(ganador.getPg() + 1);
            ganador.setGf(ganador.getGf() + marcadorGanador);
            ganador.setGc(ganador.getGc() + marcadorPerdedor);
            ganador.setTp(ganador.getTp() + 3);

            // Puntos perdedor
            perdedor.setPj(perdedor.getPj() + 1);
            perdedor.setPp(perdedor.getPp() + 1);
            perdedor.setGf(perdedor.getGf() + marcadorPerdedor);
            perdedor.setGc(perdedor.getGc() + marcadorGanador);
            
        }
    }



}