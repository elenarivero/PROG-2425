package vista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import excepciones.ManaNegativoException;
import excepciones.VidaNegativaException;
import interfaces.Ataque;
import interfaces.Cura;
import interfaces.Defensa;
import personajes.Guerrero;
import personajes.Mago;
import personajes.Personaje;
import personajes.Picaro;
import personajes.Pocion;

public class PrincipalPersonaje {

	public static void main(String[] args) {
		List<Personaje> personajes = new ArrayList<Personaje>();
		Pocion p = new Pocion("mana", 5);
		try {
			Personaje per1 = new Guerrero("Minsc", 100, 20);
			Personaje per2 = new Mago("Gale", 120, 80);
			Personaje per3 = new Picaro("Imoen", 80, 60);

			Pocion p1 = new Pocion("MANA", 20);
			Pocion p2 = new Pocion("VIDA", 20);
			Pocion p3 = new Pocion("MANA", 40);
			Pocion p4 = new Pocion("VIDA", 60);
			Pocion p5 = new Pocion("MANA", 20);
			Pocion p6 = new Pocion("VIDA", 30);
			Pocion p7 = new Pocion("MANA", 80);

			per1.cogerPocion(p1);
			per2.cogerPocion(p2);
			per3.cogerPocion(p3);
			per1.cogerPocion(p4);
			per2.cogerPocion(p5);
			per3.cogerPocion(p6);

			personajes.add(per1);
			personajes.add(per2);
			personajes.add(per3);

			Collections.sort(personajes);

			for (Personaje per : personajes) {
				System.out.println(per);
				System.out.println("----------------------------------------------");
			}

			per1.setNivel(15);
			per2.setNivel(5);
			per3.setNivel(25);

			personajes.sort((pers1, pers2) -> {
				return pers2.getNivel() - pers1.getNivel();
			});

			for (Personaje per : personajes) {
				System.out.println(per);
				System.out.println("----------------------------------------------");
			}

			for (Personaje per : personajes) {
				
				System.out.println(per);
				
				per.recibirDaño(5);
				per.recuperarMana(20);
				per.cogerPocion(p7);
				per.cogerPocion(p6);
				per.cogerPocion(p5);

				per.usarPocion(p6);
				per.usarPocion(p7);

				if (per instanceof Ataque) {
					((Ataque) per).atacar(per3);
				} else if (per instanceof Defensa) {
					((Defensa) per).defender(per3);
				} else if (per instanceof Cura) {
					((Cura) per).curar(per3);
				}
				
				System.out.println(per);
			}

		} catch (VidaNegativaException e) {
			System.out.println(e.getMessage());
		} catch (ManaNegativoException e) {
			System.out.println(e.getMessage());
		}

	}

}
