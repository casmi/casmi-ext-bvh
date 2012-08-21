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

import java.util.ArrayList;
import java.util.List;
import casmi.matrix.Vertex;
import casmi.matrix.*;

/**
 * BvhBone Class.
 * 
 * @author Y. Ban
 */
public class BvhBone {

  private String name;
  
  public Vertex absPos = new Vertex();
  public Vertex absEndPos = new Vertex();
  
  private float offsetX = 0;
  private float offsetY = 0;
  private float offsetZ = 0;
  
  private int _nbChannels;
  private List<String> channels;
  
  private float endOffsetX = 0;
  private float endOffsetY = 0;
  private float endOffsetZ = 0;
  
  private BvhBone parent;
  private List<BvhBone> children;
  
  private float xPosition = 0;
  private float yPosition = 0;
  private float zPosition = 0;
  private float xRotation = 0;
  private float yRotation = 0;
  private float zRotation = 0;
  
  public Matrix3D global_matrix;
  
  public BvhBone(BvhBone parent) 
  {
    this.parent = parent;
    channels = new ArrayList<String>();
    children = new ArrayList<BvhBone>();
  }
  
  public BvhBone()
  {
    parent = null;
    channels = new ArrayList<String>();
    children = new ArrayList<BvhBone>();
  }
  
  public String toString() 
  {
    return "[BvhBone] " + name;
  }
  
  public String structureToString()
  {
    return structureToString(0);
  }
  
  public String structureToString(int indent)
  {
    String res = "";
    for (int i = 0; i < indent; i++)
      res += "=";
    
    res = res + "> " + name + "  " + offsetX + " " + offsetY+ " " + offsetZ + "\n";
    for (BvhBone child : children)
    res += child.structureToString(indent+1);
    
    return res;
  }
  
  
  
  
  
  
  
  public String getName()
  {
    return name;
  }
  
  public void setName( String value)
  {
    name = value;
  }
  
  public Boolean isRoot()
  {
    return (parent == null);
  }
  
  public Boolean hasChildren()
  {
    return children.size() > 0;
  }
  
  
  public List<BvhBone> getChildren()
  {
    return children;
  }
  
  public void setChildren(List<BvhBone> value)
  {
    children = value;
  }
  
  public BvhBone getParent()
  {
    return parent;
  }
  
  
  public void setParent(BvhBone value)
  {
    parent = value;
  }
  
  public List<String> getChannels()
  {
    return channels;
  }
  
  public void setChannels(List<String> value)
  {
    channels = value;
  }
  
  public int getNbChannels()
  {
    return _nbChannels;
  }
  
  public void setnbChannels( int value )
  {
    _nbChannels = value;
  }
  
  //------ position
  
  public float getZrotation()
  {
    return zRotation;
  }
  
  public void setZrotation(float value)
  {
    zRotation = value;
  }
  
  public float getYrotation()
  {
    return yRotation;
  }
  
  
  public void setYrotation(float value)
  {
    yRotation = value;
  }
  
  public float getXrotation()
  {
    return xRotation;
  }
  
  
  public void setXrotation(float value)
  {
    xRotation = value;
  }
  
  
  
  public float getZposition()
  {
    return zPosition;
  }
  
  public void setZposition(float value)
  {
    zPosition = value;
  }
  
  public float getYposition()
  {
    return yPosition;
  }
  
  public void setYposition(float value)
  {
    yPosition = value;
  }
  
  public float getXposition()
  {
    return xPosition;
  }
  
  public void setXposition(float value)
  {
    xPosition = value;
  }
  
  public float getEndOffsetZ()
  {
    return endOffsetZ;
  }
  public void setEndOffsetZ(float value)
  {
    endOffsetZ = value;
  }
  
  public float getEndOffsetY()
  {
    return endOffsetY;
  }
  
  public void setEndOffsetY(float value)
  {
    endOffsetY = value;
  }
  
  public float getEndOffsetX()
  {
    return endOffsetX;
  }
  
  public void setEndOffsetX(float value)
  {
    endOffsetX = value;
  }
  
  public float getOffsetZ()
  {
    return offsetZ;
  }
  
  public void setOffsetZ(float value)
  {
    offsetZ = value;
  }
  
  public float getOffsetY()
  {
    return offsetY;
  }
  
  public void setOffsetY(float value)
  {
    offsetY = value;
  }
  
  public float getOffsetX()
  {
    return offsetX;
  }
  
  public void setOffsetX(float value)
  {
    offsetX = value;
  }

  public void setAbsPosition(Vertex pos) {
    absPos = pos;
  }  
  
  public Vertex getAbsPosition()
  {
    return absPos;
  }
  

  public void setAbsEndPosition( Vertex pos)
  {
    absEndPos = pos;
  }
  
  public Vertex getAbsEndPosition()
  {
    return absEndPos;
  }
}