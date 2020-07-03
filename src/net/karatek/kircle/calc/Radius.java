package net.karatek.kircle.calc;

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

public class Radius {
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
}
