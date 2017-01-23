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

public class CustomHttpRequestResponse implements IHttpRequestResponse {    

    private String _comment = "";
    private String _highlight = "";
    private byte[] _request = null;
    private byte[] _response = null;
    private CustomHttpService _httpService = null;
    
    CustomHttpRequestResponse(String comment, String highlight, CustomHttpService httpService, byte[] request, byte[] response) {
        this._comment = comment;
        this._highlight = highlight;
        this._httpService = httpService; 
        this._request = request;
        this._response = response;
    }
    
    @Override
    public byte[] getRequest() { return this._request; }

    @Override
    public void setRequest(byte[] message) { this._request = message; }

    @Override
    public byte[] getResponse() { return this._response; }

    @Override
    public void setResponse(byte[] message) { this._response = message; }

    @Override
    public String getComment() { return this._comment; }

    @Override
    public void setComment(String comment) { this._comment = comment; }

    @Override
    public String getHighlight() { return this._highlight; }

    @Override
    public void setHighlight(String color) { this._highlight = color; }

    @Override
    public IHttpService getHttpService() { return this._httpService; }

    @Override
    public void setHttpService(IHttpService httpService) { this._httpService = (CustomHttpService)httpService; }
    
}
