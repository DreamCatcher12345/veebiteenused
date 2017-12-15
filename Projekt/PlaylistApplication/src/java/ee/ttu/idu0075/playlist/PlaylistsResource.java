package ee.ttu.idu0075.playlist;

import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("playlists")
public class PlaylistsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PlaylistsResource
     */
    public PlaylistsResource() {
    }

    
    @GET
    @Produces("application/json")
    public GetPlaylistListResponse getPlaylistList(@QueryParam("token") String token) {
        PlaylistWebService ws = new PlaylistWebService();
        GetPlaylistListRequest request = new GetPlaylistListRequest();
        request.setToken(token);
        return ws.getPlaylistList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public PlaylistType getPlaylist(@PathParam("id") String id,
            @QueryParam("token") String token) {
        PlaylistWebService ws = new PlaylistWebService();
        GetPlaylistRequest request = new GetPlaylistRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getPlaylist(request);
    }
    
    @GET
    @Path("{id : \\d+}/songs")
    @Produces("application/json")
    public PlaylistSongListType getPlaylistSongList(@QueryParam("token") String token, 
                @PathParam("id") String id) {
        PlaylistWebService ws = new PlaylistWebService();
        GetPlaylistSongListRequest request = new GetPlaylistSongListRequest();
        request.setToken(token);
        request.setPlaylistId(BigInteger.valueOf(Integer.parseInt(id)));
        return ws.getPlaylistSongList(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public PlaylistType addPlaylist(PlaylistType content, 
                                @QueryParam("token") String token) {
        PlaylistWebService ws = new PlaylistWebService();
        AddPlaylistRequest request = new AddPlaylistRequest();
        request.setPlaylistCode(content.getPlaylistCode());
        request.setPlaylistName(content.getPlaylistName());
        request.setDescription(content.getDescription());
        request.setPlaylistSongList(new PlaylistSongListType());
        request.setToken(token);
        return ws.addPlaylist(request);
    }
    
    @POST
    @Path("{id : \\d+}/songs") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public PlaylistSongType addPlaylistSong(AddPlaylistSongRequest content, 
                                @QueryParam("token") String token,
                                @PathParam("id") String id) {
        PlaylistWebService ws = new PlaylistWebService();
        AddPlaylistSongRequest request = new AddPlaylistSongRequest();
        request.setToken(token);
        request.setPlaylistId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setSongId(content.getSongId());
        return ws.addPlaylistSong(request);    
    }
    
}
