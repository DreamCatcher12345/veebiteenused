package ee.ttu.idu0075.playlist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Dmitri Bizjulin
 */
@WebService(serviceName = "PlaylistService", portName = "PlaylistPort", endpointInterface = "ee.ttu.idu0075.playlist.PlaylistPortType", targetNamespace = "http://www.ttu.ee/idu0075/playlist", wsdlLocation = "WEB-INF/wsdl/PlaylistWebService/PlaylistService.wsdl")
public class PlaylistWebService {
    
    static int nextSongId = 1;
    static int nextPlaylistId = 1;
    static List<SongType> songList = new ArrayList<SongType>();
    static List<PlaylistType> playlistList = new ArrayList<PlaylistType>();
    
    public SongType getSong(GetSongRequest parameter) {
        SongType st = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < songList.size(); i++) {
                if (songList.get(i).getId().equals(parameter.getId())) {
                    st = songList.get(i);
                }
            }
            
        }
        return st;
    }

    public SongType addSong(AddSongRequest parameter) {
        SongType st = new SongType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            st.setCode(parameter.getCode());
            st.setArtist(parameter.getArtist());
            st.setGenre(parameter.getGenre());
            st.setYear(parameter.getYear());
            st.setAlbum(parameter.getAlbum());
            st.setTitle(parameter.getTitle());
            st.setLength(parameter.getLength());
            st.setId(BigInteger.valueOf(nextSongId++));
            songList.add(st);
        }
        return st;
        
    }

    public GetSongListResponse getSongList(GetSongListRequest parameter) {
        GetSongListResponse response = new GetSongListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (SongType songType : songList) {
                response.getSong().add(songType);
            }
        }
        return response;
    }

    public PlaylistType getPlaylist(GetPlaylistRequest parameter) {
        PlaylistType pl = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < playlistList.size(); i++) {
                if (playlistList.get(i).getId().equals(parameter.getId())) {
                    pl = playlistList.get(i);
                }

            }    
        }
        return pl;
    }

    public PlaylistType addPlaylist(AddPlaylistRequest parameter) {
        PlaylistType pl = new PlaylistType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            pl.setId(BigInteger.valueOf(nextPlaylistId++));
            pl.setPlaylistCode(parameter.getPlaylistCode());
            pl.setPlaylistName(parameter.getPlaylistName());
            pl.setDescription(parameter.getDescription());
            pl.setPlaylistSongList(new PlaylistSongListType());
            playlistList.add(pl);
        }
        return pl;
    }

    public GetPlaylistListResponse getPlaylistList(GetPlaylistListRequest parameter) {
        GetPlaylistListResponse response = new GetPlaylistListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (PlaylistType playlistType : playlistList) {
                String hasRelatedSongs = parameter.getHasRelatedSongs();
                
                if (hasRelatedSongs == null) {
                    response.getPlaylist().add(playlistType);
                } else if (hasRelatedSongs.equalsIgnoreCase("jah")) {
                    if (!isPlaylistEmpty(playlistType)) {
                        response.getPlaylist().add(playlistType);
                    }
                } else if (hasRelatedSongs.equalsIgnoreCase("ei")) {
                    if (isPlaylistEmpty(playlistType)) {
                        response.getPlaylist().add(playlistType);
                    }
                }
            }
        }
        return response;
    }
    
    private boolean isPlaylistEmpty(PlaylistType playlistType) {
        return playlistType.getPlaylistSongList().getPlaylistSong().isEmpty();
    }

    public PlaylistSongListType getPlaylistSongList(GetPlaylistSongListRequest parameter) {
        PlaylistSongListType playlistSongList = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < playlistList.size(); i++) {
                if (playlistList.get(i).getId().equals(parameter.getPlaylistId())) {
                    playlistSongList = playlistList.get(i).getPlaylistSongList();
                }

            }    
        }
        return playlistSongList;
    }

    public PlaylistSongType addPlaylistSong(AddPlaylistSongRequest parameter) {
        PlaylistSongType playlistSong = new PlaylistSongType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            GetSongRequest songRequest = new GetSongRequest();
            songRequest.setId(parameter.getSongId());
            songRequest.setToken(parameter.getToken());
            playlistSong.setSong(getSong(songRequest));
            
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            XMLGregorianCalendar currentDate = null;
            
            try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            currentDate = 
            datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            currentDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
            } catch (DatatypeConfigurationException ex) {
                ex.printStackTrace();
            }
            playlistSong.setDateAdded(currentDate);
        
            for (int i = 0; i < playlistList.size(); i++) {
                if (playlistList.get(i).getId().equals(parameter.getPlaylistId())) {
                    playlistList.get(i).getPlaylistSongList().getPlaylistSong().add(playlistSong);
                    return playlistSong;
                }

            } 
        }
        return null;
    }
    
}
