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

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static final String VERSION = "v1.0";

    public static void main(String[] args) {
	    System.out.println("Kircle " + VERSION);
        System.out.println("Copyright (C) 2020 Karatek_HD. Licensed under GPL3.");
        System.out.println("");
        System.out.println("Bitte wählen Sie eine Aktion:");
        System.out.println("");
        help();
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
                        area(r, unit);
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
                        extent(r, unit);
                        System.out.println();
                        break;
                    case "l":
                        license();
                        break;
                    case "h":
                        help();
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
                        radiusFromExtent(u, unit);
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
                        areaFromExtent(u, unit);
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
                        radiusFromArea(A, unit);
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
                        extentFromArea(A, unit);
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
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }

        }

    }

    public static void license() {
        System.out.println("Kircle ist Freie Software: Sie können es unter den Bedingungen\n" +
                "der GNU General Public License, wie von der Free Software Foundation,\n" +
                "Version 3 der Lizenz oder (nach Ihrer Wahl) jeder neueren\n" +
                "veröffentlichten Version, weiter verteilen und/oder modifizieren.\n" +
                "\n" +
                "Kircle wird in der Hoffnung, dass es nützlich sein wird, aber\n" +
                "OHNE JEDE GEWÄHRLEISTUNG, bereitgestellt; sogar ohne die implizite\n" +
                "Gewährleistung der MARKTFÄHIGKEIT oder EIGNUNG FÜR EINEN BESTIMMTEN ZWECK.\n" +
                "Siehe die GNU General Public License für weitere Details.\n" +
                "\n" +
                "Sie sollten eine Kopie der GNU General Public License zusammen mit diesem\n" +
                "Programm erhalten haben. Wenn nicht, siehe <https://www.gnu.org/licenses/>.");
    }

    public static void help() {
        System.out.println("    [1] Flächeninhalt berrechnen (Radius ist bekannt)");
        System.out.println("    [2] Umfang berrechnen (Radius ist bekannt)");
        System.out.println("    [3] Radius berrechnen (Umfang ist bekannt)");
        System.out.println("    [4] Fläche berrechnen (Umfang ist bekannt)");
        System.out.println("    [5] Radius berrechnen (Fläche ist bekannt)");
        System.out.println("    [6] Umfang berrechnen (Fläche ist bekannt)");
        System.out.println("    [l] Lizensinformationen und Copyright");
        System.out.println("    [v] Versionsinformationen");
        System.out.println("    [h] Diese Liste anzeigen");
        System.out.println("    [i] Hilfe holen");
        System.out.println("    [s] Quellcode");
        System.out.println("    [q] Beenden");
    }

    public static void radiusFromExtent(double u, String unit) {
        System.out.println("u = " + u + " " + unit);
        double r = u / (2 * Math.PI);
        System.out.println("r = u : 2 * π");
        System.out.println("r = " + u + " : 2 * π");
        r = r * 100;
        r = Math.round(r);
        r = r / 100;
        System.out.println("r = " + r + " " +  unit);
    }

    public static void areaFromExtent(double u, String unit) {
        System.out.println("u = " + u + " " + unit);
        double r = u / (2 * Math.PI);
        System.out.println("r = u : 2 * π");
        System.out.println("r = " + u + " : 2 * π");
        r = r * 100;
        r = Math.round(r);
        r = r / 100;
        System.out.println("r = " + r + " " +  unit);
        double A = Math.PI * r * r;
        System.out.println("A = π * r * r");
        System.out.println("A = π * " + r + " * " + r);
        A = A * 100;
        A = Math.round(A);
        A = A / 100;
        System.out.println("A = " + A + " " +  unit);
    }

    public static void radiusFromArea(double A, String unit) {
        System.out.println("A = " + A + " " + unit);
        double r = Math.sqrt(A) / Math.sqrt(Math.PI);
        System.out.println("r = √A : √π");
        System.out.println("r = " + Math.sqrt(A) + " : √π");
        r = r * 100;
        r = Math.round(r);
        r = r / 100;
        System.out.println("r = " + r + " " +  unit.substring(0, unit.length() - 1));
    }

    public static void extentFromArea(Double A, String unit) {
        System.out.println("A = " + A + " " + unit);
        double r = Math.sqrt(A) / Math.sqrt(Math.PI);
        System.out.println("r = √A : √π");
        System.out.println("r = " + Math.sqrt(A) + " : √π");
        r = r * 100;
        r = Math.round(r);
        r = r / 100;
        System.out.println("r = " + r + " " +  unit.substring(0, unit.length() - 1));
        double u = 2 * Math.PI * r;
        System.out.println("u = 2 * π * r");
        System.out.println("u = 2 * π * " + r);
        u = u * 100;
        u = Math.round(u);
        u = u / 100;
        System.out.println("u = " + u + unit);
    }

    public static void area(double r, String unit) {
        System.out.println("r = " + r + " " + unit);

    }

    public static void extent(double r, String unit) {
        System.out.println("r = " + r + unit);
        double u = 2 * Math.PI * r;
        System.out.println("u = 2 * π * r");
        System.out.println("u = 2 * π * " + r);
        u = u * 100;
        u = Math.round(u);
        u = u / 100;
        System.out.println("u = " + u + unit);
    }

}
