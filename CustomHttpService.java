/* Authors: Benjamin Wireman, Joshua Smith
 * -----------------------------------------------------------------------
 * Copyright 2016 Dynetics, Inc.
 *
 * This file is a part of ManScanAdd
 * 
 * ManScanAdd is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * ManScanAdd is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
----------------------------------------------------------------------- */

package burp;

public class CustomHttpService implements IHttpService {

    private String _host = "";
    private String _protocol = "";
    private int _port = 0;
    
    CustomHttpService(String host, int port, String protocol) {
        this._host = host;
        this._port = port;
        this._protocol = protocol;
    }
    
    @Override
    public String getHost() { return this._host; }

    @Override
    public int getPort() { return this._port; }

    @Override
    public String getProtocol() { return this._protocol; }
    
}
