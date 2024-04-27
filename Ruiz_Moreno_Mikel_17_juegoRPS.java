import java.util.Scanner;

public class Ruiz_Moreno_Mikel_17_juegoRPS {

	public static void main(String[] args) {
		// Creo el escaner para recojer los datos que introduzca cada jugador, también creo las variables que usaré, las dos primeras para almacenar los nombres de los jugadores,
		//las dos siguientes para almacenar las jugadas de cada jugador y las dos últimas son los marcadores de cada jugador, para llevar la cuenta de los puntos de cada jugador.
		//a lo largo de la partida.
				Scanner entrada; 
				entrada = new Scanner(System.in);
				String NombreJugador1; 
				NombreJugador1 = "";
				String NombreJugador2; 
				NombreJugador2 = "";
				char JugadaJugador1; 
				JugadaJugador1 = ' ';
				char JugadaJugador2; 
				JugadaJugador2 = ' ';
				int marcador1; 
				marcador1 = 0; 
				int marcador2;
				marcador2 = 0;
				//Explico las reglas del juego para que los jugadores sepan como jugar:
				System.out.println("Bienvenidos al juego de Piedra, Papel o Tijera. Las reglas son las siguientes:");
				System.out.println("-Se deberá indicar el nombre del jugador.");
				System.out.println("-Cada jugador indicará su jugada de la siguiente manera: P = papael | S = Tijeras | R = Piedra");
				System.out.println("-Las jugadas se deben de indicar con letras mayúsculas.");
				System.out.println("-Se jugarán 3 partidas en total, el empate cuenta como una partida, por lo que si se da el caso");
				System.out.println(" de tener 3 empates, nadie ganará la partida.");
				System.out.println(""); //Esta línea simplemente la utilizo para saltar un parrafo.
			
				//Las cuatro siguientes líneas las uso para preguntar el nombre de cada jugador y almacenar cada nombre en una variable con el escaner.
				System.out.println("Indique el nombre del jugador 1:");
				NombreJugador1 = entrada.nextLine();
				System.out.println("Indique el nombre del jugado 2:");
				NombreJugador2 = entrada.nextLine();
				
				//Creo un bucle con for, este me servirá para que se repita 3 veces (3 partidas).
				for(int i=0 ; i<3 ; i++)
				{  //Le pregunto al jugador uno que desea sacar, le indico las posibilidades que tiene 
					//y almaceno en una variable su decisión/jugada.
					System.out.println("Que desea sacar " + NombreJugador1 + ": P = papel | S = Tijeras | R = Piedra");
					JugadaJugador1 = entrada.next().charAt(0);
					
					//Creo un switch el cual imprimira diferentes mensajes dependiendo que decisión escoja el primer jugador.
					//Este switch tendra 3 casos, para las 3 posibles opciones del jugador 1 (P/S/R). En cada caso de este switch,
					//hago dentro otro switch, el cual tendrá otros 3 casos con las 3 opciones del jugador 2; P, S o R. 
					switch(JugadaJugador1)
					{
					case 'P': //Esto es en caso de que el jugador 1 saque papel, imprimirá lo que hay dentro del caso.
						//Le pregunto al jugador dos que desea sacar y almaceno su jugada en una variable.
						System.out.println("Que desea sacar " + NombreJugador2 + ": P = papel | S = Tijeras | R = Piedra");
						JugadaJugador2 = entrada.next().charAt(0);
						//Este switch se "activará" en caso de que el jugador 1 escoga papel e imprimirá un mensaje diferente dependiendo
						//de lo que escoga el jugador 2.
						switch(JugadaJugador2) { 
							case 'P': //En caso de que el jugador 2 saque papel se activará este caso e imprimirá el siguiente mensaje.
								System.out.println("La jugada queda en empate, se debe de repetir la ronda.");
								i--; //En caso de que empate, restará un valor a "i", para que la ronda se repita.
							break; //El break es para indicar donde termina el caso "p".
							case 'S': //En caso de que el jugador 2 saque tijera se activará este caso.
								System.out.println("Gana " + NombreJugador2 + ", ya que la tijera gana al papel. " + NombreJugador2 + " ganas un punto.");
								marcador2 = marcador2 + 1; //Esto suma un punto a la variable marcador2, este es el marcador del jugador 2.
							break;//El break es para indicar donde termina el caso "s".
							case 'R': //En caso de que el jugador 2 saque piedra, se activará este caso.
								System.out.println("Gana " + NombreJugador1 + ", ya que el papel gana a la piedra. " + NombreJugador1 + " ganas un punto.");
								marcador1 = marcador1 +1; //Esto sumará uno a la variable marcador1, que pertenece a los puntos del jugador 1. 
							break;//El break es para indicar donde termina el caso "r".
												}
					break; //Este break indica que termina el segundo switch, el siwtch de JugadaJugador2.
						
					case 'S': //Este es el segundo caso del primer switch (Del switch "Principal") y se activará en caso de que el jugador 1
								//saque tijera.
						//Le pregunto al jugador dos que desea sacar y almaceno su jugada en una variable.
						System.out.println("Que desea sacar " + NombreJugador2 + ": P = papel | S = Tijeras | R = Piedra");
						JugadaJugador2 = entrada.next().charAt(0);

						//Este switch se activará en caso de que el jugador 1 saque tijera y tendrá diferentes casos dependiendo de que saque el
						//jugador 2.
						switch(JugadaJugador2)
						{
							case 'S': //Este caso se activará en caso de que el jugador 2 saque tijera, lo que haría empatar la partida y se volverá
									 //a jugar la partida.
								System.out.println("La jugada queda en empate, se debe de repetir la ronda.");
								i--; //Esto le restaría uno al valor de la variable i, por lo que se repetiría la ronda. El break de la siguiente línea indica que termina el switch.
								break; 
							case 'P': //Este caso se activará en caso de que el jugador 2 saque piedra.
								System.out.println("Gana " + NombreJugador1 + ", ya que la tijera gana al papel. " + NombreJugador1 + " ganas un punto");
								marcador1 = marcador1 + 1; //Esto le suma un punto al marcador del jugador 1.
								break;
							case 'R': //Este caso se activará si el jugador 2 saca piedra.
								System.out.println("Gana " + NombreJugador2 + ", ya que la piedra gana a la tijera. " + NombreJugador2 + " ganas un punto");
								marcador2 = marcador2 + 1; //Esto le sumará un punto al marcador del jugador 2.
								break; //Esto indica que termina el caso de R.
							}
						break; //Este break indica que termina el tercer switch, el siwtch de JugadaJugador2.
						
					case 'R': //Este caso se activará en caso de que el jugador 1 saque piedra.
						//Le pregunto al jugador dos que desea sacar y almaceno su jugada en una variable.
						System.out.println("Que desea sacar " + NombreJugador2 + ": P = papel | S = Tijeras | R = Piedra");
						JugadaJugador2 = entrada.next().charAt(0);
						//Este switch imprimirá un mensaje diferente dependiendo de que decisión escoga el jugador 2. Dependiendo de cada decisión se activará uno de los casos.
						switch(JugadaJugador2)
						{
						case 'R': //Este caso se dará si el jugador 2 escoge piedra e imprimirá el siguiente mensaje.
							System.out.println("La jugada queda en empate, se debe de repetir la ronda.");
							i--; //Como la ronda es empate se debe repetir, asi que le resto un valor a la variable i, y asi se repetirá la ronda.
							break; //Este break hace que finalice el caso de r.
						case 'P': //Este caso se activará si el jugador eligé papel.
							System.out.println("Gana " + NombreJugador2 + ", ya que el papel gana a la piedra. " + NombreJugador2 + " ganas un punto");
							marcador2 = marcador2 +1; //Esto le sumará un punto al marcador del jugador 2.
							break; //Este break finaliza el caso P.
						case 'S': //Este caso se activará si el jugador 2 saca tijera.
							System.out.println("Gana " + NombreJugador1 + ", ya que la piedra gana a la tijera. " + NombreJugador1 + " ganas un punto");
							marcador1 = marcador1 +1; //Esto suma un punto al marcador del jugador 1.
							break; //Finaliza el caso S.
						}	
						break; //Terimina el primer siwtch del jugador 1.
						default: 
									
					}
					//Indicará los puntos que tiene cada jugador al final de cada partida.
					System.out.println("Puntos " + NombreJugador1 + " " + marcador1);
					System.out.println("Puntos " + NombreJugador2 + " " + marcador2);
					System.out.println("");
					
				}
				//Estos if indicaran quien ha ganado la partida.
				if(marcador1 > marcador2) //Si marcador 1 es mayor a marcador 2 gana juador 1.
				{
					System.out.println("Enhorabuena " + NombreJugador1 + " has ganado la partida con " + marcador1 + " puntos.");
				}
				if(marcador2 > marcador1) //Si marcador 2 es mayor a marcador 1 gana juador 2.
				{
					System.out.println("Enhorabuena " + NombreJugador2 + " has ganado la partida con " + marcador2 + " puntos.");
				}
				
				entrada.close(); 

	}

}
