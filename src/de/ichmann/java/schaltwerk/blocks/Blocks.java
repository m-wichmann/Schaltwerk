/*****************************************************************************
 * Schaltwerk - A free and extensible digital simulator
 * Copyright (c) 2013 Christian Wichmann
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 *****************************************************************************/
package de.ichmann.java.schaltwerk.blocks;

/**
 * Enumeration defining all possible common blocks (base blocks and compound
 * blocks) that can be generated by the <code>BlockFactory</code>.
 * 
 * @author Christian Wichmann
 */
public enum Blocks {

	/**
	 * Block that has one output which is one when all inputs are one.
	 */
	AND,

	/**
	 * Block that has one output which is one when one or more inputs are one.
	 */
	OR,

	/**
	 * Block with one input and one output that has always the inverted value of
	 * the input.
	 */
	NOT,

	/**
	 * Block with one output that is zero only when all inputs are one.
	 */
	NAND,

	/**
	 * Block with one output that is zero when one or more inputs are one.
	 */
	NOR,

	/**
	 * Block with two outputs ("Q", "~Q") that can be set or reset through two
	 * inputs ("S", "R"). One output has the inverted value of the other.
	 */
	RS_FLIPFLOP
}
