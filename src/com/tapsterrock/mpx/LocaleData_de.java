/*
 * file:       LocaleData_de.java
 * author:     Jon Iles
 * copyright:  (c) Tapster Rock Limited 2004
 * date:       24/03/2004
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package com.tapsterrock.mpx;

import java.util.ListResourceBundle;


/**
 * This class defines the German translation of resource required by MPX files.
 */
public final class LocaleData_de extends ListResourceBundle
{
   /**
    * @see ListResourceBundle#getContents
    */
   public Object[][] getContents()
   {
      return (RESOURCE_DATA);
   }

   private static final Object[][] RESOURCE_DATA =
   {
      {LocaleData.YES, "Ja"},
      {LocaleData.NO, "Nein"}
   };
}