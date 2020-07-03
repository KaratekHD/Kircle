package net.karatek.kircle.utils;

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

public class Utils {
    public void license() {
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

    public void help() {
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



    public void trouble() {
        System.out.println("Error\n\n" +
                "If you're seeing this, the code is in what\n" +
                "I thought was an unreachable state.\n\n" +
                "I could give you advice for what to do.\n" +
                "But honestly, why should you trust me?\n" +
                "I clearly screwed this up. I'm writing a\n" +
                "message that should never appear, yet\n" +
                "I know it will probably appear someday.\n\n" +
                "On a deep level, I know I'm not\n" +
                "up to this task. I'm sorry.");
    }
}
