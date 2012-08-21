/*
 *   casmi-ext-bvh
 *   https://github.com/casmi/casmi-ext-bvh
 *   Copyright (C) 2012, Xcoo, Inc.
 *
 *  casmi is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package casmi.extension.bvh;

import casmi.graphics.group.Group;

/**
 * Bvh Class.
 * 
 * @author Y. Ban
 */
abstract public class Bvh extends Group {
	public BvhParser parser;
	
	public Bvh(String[] data)
	{
		parser = new BvhParser();
		parser.init();
		parser.parse(data);
		addObjects();
	}
	
	public void update(int ms)
	{
		parser.moveMsTo(ms);
		parser.update();
		updateObjects();
	}

	@Override
	public void update() {
		
	}
	
	abstract public void updateObjects();
	
	abstract public void addObjects();
	
	public void addEndCallback(BvhEndCallback endCallback){
		this.parser.addEndCallback(endCallback);
	}
	

}
