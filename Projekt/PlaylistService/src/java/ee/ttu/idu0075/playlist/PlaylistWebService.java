/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.playlist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "PlaylistService", portName = "PlaylistPort", endpointInterface = "PlaylistPortType", targetNamespace = "http://www.ttu.ee/idu0075/playlist", wsdlLocation = "WEB-INF/wsdl/PlaylistWebService/PlaylistService.wsdl")
public class PlaylistWebService {

/*private int nextSongId = 1; 
private List<SongType> songList = new ArrayList<SongType>(); */

public SongType getSong(GetSongRequest parameter) { 
    /*SongType songType = null; 
    if (parameter.getToken().equalsIgnoreCase("salajane")) { 
        for (int i = 0; i < songList.size(); i++) { 
            if (songList.get(i).getId().equals(parameter.getId())) { 
                songType = songList.get(i); 
            } 
        } 
    } 
    return songType; */
    throw new UnsupportedOperationException("Not implemented yet.");
} 

public SongType addSong(AddSongRequest parameter) { 
    throw new UnsupportedOperationException("Not implemented yet.");
}

    public GetSongListResponse getSongList(GetSongListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public PlaylistType getPlaylist(GetPlaylistRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public PlaylistType addPlaylist(AddPlaylistRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public GetPlaylistListResponse getPlaylistList(GetPlaylistListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public PlaylistSongListType getPlaylistSongList(GetPlaylistSongListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public PlaylistSongType addPlaylistSong(AddPlaylistSongRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
