/*
  Processing Sound (c) 2013-2015 Wilm Thoben
  Part of the Processing project - http://processing.org

  Copyright (c) 2011-12 Ben Fry and Casey Reas

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation; either
  version 2.1 of the License, or (at your option) any later version.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General
  Public License along with this library; if not, write to the
  Free Software Foundation, Inc., 59 Temple Place, Suite 330,
  Boston, MA  02111-1307  USA
*/
  
package processing.sound;
import processing.core.PApplet;

/**
* Audio Device allows for configuring the audio server. If you need a low latency server you can reduce the buffer size. Allowed values are power of 2. For changing the sample rate pass the appropriate value in the constructor. 
* @webref sound
* @param parent PApplet: typically use "this"
* @param sampleRate Sets the sample rate (44100, 48000, or 96000).
* @param bufferSize Sets the buffer size (32, 64, or 128).
**/

public class AudioDevice {

	PApplet parent;
	static int m_test;
	private Engine m_engine;

    public AudioDevice(PApplet theParent, int sampleRate, int bufferSize) {
    	m_engine.setPreferences(theParent, bufferSize, sampleRate);
    	m_engine.start();
    }
	
	public void engineStop() {
		m_engine.engineStop();
	}
	
	public void dispose() {
		m_engine.engineStop();
	}

}