package net.karatek.kircle;

/*
 * This file is part of Kircle.
 *
 * Kircle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Kircle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Diese Datei ist Teil von Kircle.
 *
 * Kircle ist Freie Software: Sie können es unter den Bedingungen
 * der GNU General Public License, wie von der Free Software Foundation,
 * Version 3 der Lizenz oder (nach Ihrer Wahl) jeder neueren
 * veröffentlichten Version, weiter verteilen und/oder modifizieren.
 *
 * Kircle wird in der Hoffnung, dass es nützlich sein wird, aber
 * OHNE JEDE GEWÄHRLEISTUNG, bereitgestellt; sogar ohne die implizite
 * Gewährleistung der MARKTFÄHIGKEIT oder EIGNUNG FÜR EINEN BESTIMMTEN ZWECK.
 * Siehe die GNU General Public License für weitere Details.
 *
 * Sie sollten eine Kopie der GNU General Public License zusammen mit diesem
 * Programm erhalten haben. Wenn nicht, siehe <https://www.gnu.org/licenses/>.
 */

import net.karatek.kircle.calc.Area;
import net.karatek.kircle.calc.Extent;
import net.karatek.kircle.calc.Radius;
import net.karatek.kircle.utils.Utils;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

@SuppressWarnings("DuplicatedCode")
public class Main {

    public static final String VERSION = "v1.0";

    public static void main(String[] args) {
        Area area = new Area();
        Utils utils = new Utils();
        Radius radius = new Radius();
        Extent extent = new Extent();
        if(args.length == 0 || args[0].equalsIgnoreCase("-i") || args[0].equals("")) {
            System.out.println("Kircle " + VERSION);
            System.out.println("Copyright (C) 2020 Karatek_HD. Licensed under GPL3.");
            System.out.println("");
            System.out.println("Bitte wählen Sie eine Aktion:");
            System.out.println("");
            utils.help();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                try {
                    System.out.print("Aktion [1/2/3/4/5/6/l/v/h/i/s/q]: ");
                    String input = br.readLine();
                    Double r = null;
                    Double u = null;
                    Double A = null;
                    String unit = null;
                    switch (input.toLowerCase()) {
                        case "1":
                            System.out.println("\nFlächeninhalt berrechnen");
                            System.out.print("Radius: ");
                            r = null;
                            input = br.readLine();
                            input = input.replace(",", ".");
                            try {
                                r = Double.valueOf(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                System.exit(1);
                            }
                            System.out.print("Einheit: ");
                            unit = null;
                            unit = br.readLine();
                            area.fromRadius(r, unit);
                            System.out.println();
                            break;
                        case "2":
                            System.out.println("\nUmfang berrechnen");
                            System.out.print("Radius: ");
                            r = null;
                            input = br.readLine();
                            input = input.replace(",", ".");
                            try {
                                r = Double.valueOf(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                System.exit(1);
                            }
                            System.out.print("Einheit: ");
                            unit = null;
                            unit = br.readLine();
                            extent.fromRadius(r, unit);
                            System.out.println();
                            break;
                        case "l":
                            utils.license();
                            break;
                        case "h":
                            utils.help();
                            break;
                        case "v":
                            System.out.println("Kircle " + VERSION);
                            break;
                        case "q":
                            System.out.println("Goodbye.");
                            System.exit(0);
                            break;
                        case "3":
                            System.out.println("\nRadius berrechnen");
                            System.out.print("Umfang: ");
                            u = null;
                            input = br.readLine();
                            input = input.replace(",", ".");
                            try {
                                u = Double.valueOf(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                System.exit(1);
                            }
                            System.out.print("Einheit: ");
                            unit = null;
                            unit = br.readLine();
                            radius.fromExtent(u, unit);
                            System.out.println();
                            break;
                        case "4":
                            System.out.println("\nFlächeninhanlt berrechnen");
                            System.out.print("Umfang: ");
                            u = null;
                            input = br.readLine();
                            input = input.replace(",", ".");
                            try {
                                u = Double.valueOf(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                System.exit(1);
                            }
                            System.out.print("Einheit: ");
                            unit = null;
                            unit = br.readLine();
                            area.fromExtent(u, unit);
                            System.out.println();
                            break;
                        case "5":
                            System.out.println("\nRadius berrechnen");
                            System.out.print("Fläche: ");
                            A = null;
                            input = br.readLine();
                            input = input.replace(",", ".");
                            try {
                                A = Double.valueOf(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                System.exit(1);
                            }
                            System.out.print("Einheit: ");
                            unit = null;
                            unit = br.readLine();
                            radius.fromArea(A, unit);
                            System.out.println();
                            break;
                        case "6":
                            System.out.println("\nUmfang berrechnen");
                            System.out.print("Fläche: ");
                            A = null;
                            input = br.readLine();
                            input = input.replace(",", ".");
                            try {
                                A = Double.valueOf(input);
                            } catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                System.exit(1);
                            }
                            System.out.print("Einheit: ");
                            unit = null;
                            unit = br.readLine();
                            extent.fromArea(A, unit);
                            System.out.println();
                            break;
                        case "i":
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                                Desktop.getDesktop().browse(new URI("https://github.com/KaratekHD/Kircle/issues"));
                            } else {
                                System.out.println("Besuche https://github.com/KaratekHD/Kircle/issues");
                            }
                            break;
                        case "s":
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                                Desktop.getDesktop().browse(new URI("https://github.com/KaratekHD/Kircle/"));
                            } else {
                                System.out.println("Besuche https://github.com/KaratekHD/Kircle/");
                            }
                            break;
                        default:
                            if(!input.equals("")) System.out.println("Ungültige Eingabe.");
                            break;
                    }
                } catch (IOException e) {
                    utils.trouble();
                } catch (URISyntaxException e) {
                    utils.trouble();
                }
        }


        } else {
            if(args[0].equalsIgnoreCase("-h") || args[0].equalsIgnoreCase("--help")) {
                System.out.println("Verwendung: kircle [OPTIONS]\n\n" +
                        "-c --area-from-radius         Flächeninhalt berrechnen (Radius ist bekannt)\n" +
                        "-c --extent-from-radius       Umfang berrechnen (Radius ist bekannt)\n" +
                        "-c --radius-from-extent       Radius berrechnen (Umfang ist bekannt)\n" +
                        "-c --area-from-extent         Fläche berrechnen (Umfang ist bekannt)\n" +
                        "-c --radius-from-area         Radius berrechnen (Fläche ist bekannt)\n" +
                        "-c --extent-from-area         Umfang berrechnen (Fläche ist bekannt)\n" +
                        "-i                            Interaktiver Modus (Standart)\n" +
                        "-h                            Diese Liste anzeigen\n" +
                        "-v                            Versionsinformationen und Copyrighthinweise anzeigen");
                System.exit(0);
            }
            if(args[0].equalsIgnoreCase("-v") || args[0].equalsIgnoreCase("--version")) {
                System.out.println("Kircle " + VERSION + "\n");
                utils.license();
                System.exit(0);
            }
            if(args[0].equals("-c") || args[0].equalsIgnoreCase("--script-mode")) {
                if(args.length == 1) {
                    System.out.println("Kircle wurde im Scriptmodus gestartet.\n" +
                            "Bitte verwenden Sie \"kircle -h\" für weitere Informationen und Hilfe.");
                    System.exit(2);
                }
                if(args[1].equalsIgnoreCase("--area-from-radius")) {
                    if(args.length != 5) {
                        System.out.println("Verwendung: kircle -c --area-from-radius [Aufgabe] [Radius] [Einheit]");
                        System.exit(3);
                    }
                    try {
                        System.out.println("Aufgabe " + args[2] + "\n");
                        area.fromRadius(Double.valueOf(args[3]), args[4]);
                        System.out.println();
                    } catch (Exception e) {
                        utils.trouble();
                    }
                    System.exit(0);
                }
                if(args[1].equalsIgnoreCase("--extent-from-radius")) {
                    if(args.length != 5) {
                        System.out.println("Verwendung: kircle -c --extent-from-radius [Aufgabe] [Radius] [Einheit]");
                        System.exit(3);
                    }
                    try {
                        System.out.println("Aufgabe " + args[2] + "\n");
                        extent.fromRadius(Double.valueOf(args[3]), args[4]);
                        System.out.println();
                    } catch (Exception e) {
                        utils.trouble();
                    }
                    System.exit(0);
                }
                if(args[1].equalsIgnoreCase("--radius-from-extent")) {
                    if(args.length != 5) {
                        System.out.println("Verwendung: kircle -c --radius-from-extent [Aufgabe] [Umfang] [Einheit]");
                        System.exit(3);
                    }
                    try {
                        System.out.println("Aufgabe " + args[2] + "\n");
                        radius.fromExtent(Double.valueOf(args[3]), args[4]);
                        System.out.println();
                    } catch (Exception e) {
                        utils.trouble();
                    }
                    System.exit(0);
                }
                if(args[1].equalsIgnoreCase("--area-from-extent")) {
                    if(args.length != 5) {
                        System.out.println("Verwendung: kircle -c --area-from-extent [Aufgabe] [Umfang] [Einheit]");
                        System.exit(3);
                    }
                    try {
                        System.out.println("Aufgabe " + args[2] + "\n");
                        area.fromExtent(Double.valueOf(args[3]), args[4]);
                        System.out.println();
                    } catch (Exception e) {
                        utils.trouble();
                    }
                    System.exit(0);
                }
                if(args[1].equalsIgnoreCase("--radius-from-area")) {
                    if(args.length != 5) {
                        System.out.println("Verwendung: kircle -c --radius-from-area [Aufgabe] [Fläche] [Einheit]");
                        System.exit(3);
                    }
                    try {
                        System.out.println("Aufgabe " + args[2] + "\n");
                        radius.fromArea(Double.valueOf(args[3]), args[4]);
                        System.out.println();
                    } catch (Exception e) {
                        utils.trouble();
                    }
                    System.exit(0);
                }
                if(args[1].equalsIgnoreCase("--extent-from-area")) {
                    if(args.length != 5) {
                        System.out.println("Verwendung: kircle -c --extent-from-area [Aufgabe] [Fläche] [Einheit]");
                        System.exit(3);
                    }
                    try {
                        System.out.println("Aufgabe " + args[2] + "\n");
                        extent.fromArea(Double.valueOf(args[3]), args[4]);
                        System.out.println();
                    } catch (Exception e) {
                        utils.trouble();
                    }
                    System.exit(0);
                }
            }
            utils.trouble();
        }

    }

}
