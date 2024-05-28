package com.ligabetplay;

import java.util.ArrayList;
import java.util.Scanner;

import com.ligabetplay.models.*;

public class Main {
    public static void main(String[] args) {
        // Reportes
        
        
        // Se debe instanciar el scanner//
        Scanner sc = new Scanner(System.in);
        // Creación del Array equipos
        ArrayList<Equipos> equipo = new ArrayList<>();

        // Creación del Array Partido
        ArrayList<Partidos> partido = new ArrayList<>();

        

        principal: while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar Equipo \n2. Ingresar Datos Partido \n3. Reportes \n4.Terminar");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarEquipo: while (true) {
                        int generarId = equipo.size() + 1;
                        // Ingresar Equipo
                        System.out.println("Ingrese el nombre del equipo a registrar:");
                        String nombreEquipo = sc.next();
                        equipo.add(new Equipos(generarId, nombreEquipo, 0, 0, 0, 0, 0, 0, 0));
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

                            System.out.println("Ingrese el id del equipo visitante: ");
                            // myPartido.setEquipoVisitante(sc.nextInt());
                            Equipos equipoVisitante = buscarPorId(sc.nextInt(), equipo);
                            

                            System.out.println(equipoVisitante.getNombreEquipo());

                            System.out.println("Ingrese el id del equipo Local:");
                            // myPartido.setEquipoLocal(sc.next());
                            Equipos equipoLocal = buscarPorId(sc.nextInt(), equipo);

                            // FALTA AÑADIR UN IF

                            System.out.println("Ingrese el marcador del equipo visitante: ");
                            // myPartido.setMarcadorVisitante(marcadorVisitante);

                            int marcadorVisitante = sc.nextInt();

                            System.out.println("Ingrese el marcador del equipo local: ");
                            // myPartido.setMarcadorLocal(sc.nextInt());

                            int marcadorLocal = sc.nextInt();
                    
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

                            // String ganador;
                            // String perdedor;
                            

                            

                        }

                            


                    }
                    break;
                case 3:
                    reportes: while (true) {
                        System.out.print("Selecione el reporte que desea visualizar: \n1. Equipo que más goles anotó \n2. Equipo con más puntos \n3. Equipo que ganó más partidos \n4. Total de goles por equipo \n5. Promedio de goles anotados en el torneo \n6. Regresar");

                        int op = sc.nextInt();


                        if (op == 1) {
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
                            
                        } else if (op == 2) {
                            Equipos equipoMasPuntos = null;
                            for (Equipos equipos : equipo) {
                                if (equipoMasPuntos == null || equipos.getTp() > equipoMasPuntos.getTp()) {
                                    equipoMasPuntos = equipos;
                                }
                            }

                            if (equipoMasPuntos != null) {
                                System.out.println("Equipo con más goles: " + equipoMasPuntos.getNombreEquipo());
                            }
                        }else if (op == 3) {
                            Equipos equipoMasPartidosGanados = null;
                            for (Equipos equipos : equipo) {
                                if (equipoMasPartidosGanados == null || equipos.getPg() > equipoMasPartidosGanados.getPg()) {
                                    equipoMasPartidosGanados = equipos;
                                }
                            }

                            if (equipoMasPartidosGanados != null) {
                                System.out.println("Equipo con más goles: " + equipoMasPartidosGanados.getNombreEquipo());
                            }
                        }else if (op == 4) {
                            int totalGoles = 0;
                            for (Equipos equipos : equipo) {
                                totalGoles += equipos.getGf();
                            }
                            System.out.println(totalGoles);
                        }else if (op == 5) {
                            int totalGoles = 0;
                            for (Equipos equipos : equipo) {
                                totalGoles += equipos.getGf();
                              
                            }
                            System.out.println(totalGoles/equipo.size()); 
                        }else {
                            break reportes;
                        }
                    }
                    


                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break principal;

                default:
                    System.out.println("Debe ingresar una opción válida");
                    break;
            }
        }
        





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