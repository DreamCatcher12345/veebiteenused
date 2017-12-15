package ee.ttu.idu0075.playlist;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import java.math.BigInteger;
import javax.ws.rs.POST;

/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("songs")
public class SongsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SongsResource
     */
    public SongsResource() {
    }

    @GET
    @Produces("application/json")
    public GetSongListResponse getSongList(@QueryParam("token") String token) {
        PlaylistWebService ws = new PlaylistWebService();
        GetSongListRequest request = new GetSongListRequest();
        request.setToken(token);
        return ws.getSongList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public SongType getSong(@PathParam("id") String id,
            @QueryParam("token") String token) {
        PlaylistWebService ws = new PlaylistWebService();
        GetSongRequest request = new GetSongRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getSong(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public SongType addSong(SongType content, 
                                @QueryParam("token") String token) {
        PlaylistWebService ws = new PlaylistWebService();
        AddSongRequest request = new AddSongRequest();
        request.setCode(content.getCode());
        request.setArtist(content.getArtist());
        request.setGenre(content.getGenre());
        request.setYear(content.getYear());
        request.setAlbum(content.getAlbum());
        request.setTitle(content.getTitle());
        request.setLength(content.getLength());
        request.setToken(token);
        return ws.addSong(request);
    }
}
