
package ee.ttu.idu0075.playlist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075.playlist package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddPlaylistResponse_QNAME = new QName("http://www.ttu.ee/idu0075/playlist", "addPlaylistResponse");
    private final static QName _GetSongResponse_QNAME = new QName("http://www.ttu.ee/idu0075/playlist", "getSongResponse");
    private final static QName _GetPlaylistResponse_QNAME = new QName("http://www.ttu.ee/idu0075/playlist", "getPlaylistResponse");
    private final static QName _GetPlaylistSongListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/playlist", "getPlaylistSongListResponse");
    private final static QName _AddPlaylistSongResponse_QNAME = new QName("http://www.ttu.ee/idu0075/playlist", "addPlaylistSongResponse");
    private final static QName _AddSongResponse_QNAME = new QName("http://www.ttu.ee/idu0075/playlist", "addSongResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075.playlist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlaylistType }
     * 
     */
    public PlaylistType createPlaylistType() {
        return new PlaylistType();
    }

    /**
     * Create an instance of {@link GetPlaylistSongListRequest }
     * 
     */
    public GetPlaylistSongListRequest createGetPlaylistSongListRequest() {
        return new GetPlaylistSongListRequest();
    }

    /**
     * Create an instance of {@link AddPlaylistSongRequest }
     * 
     */
    public AddPlaylistSongRequest createAddPlaylistSongRequest() {
        return new AddPlaylistSongRequest();
    }

    /**
     * Create an instance of {@link GetPlaylistListRequest }
     * 
     */
    public GetPlaylistListRequest createGetPlaylistListRequest() {
        return new GetPlaylistListRequest();
    }

    /**
     * Create an instance of {@link SongType }
     * 
     */
    public SongType createSongType() {
        return new SongType();
    }

    /**
     * Create an instance of {@link GetSongListResponse }
     * 
     */
    public GetSongListResponse createGetSongListResponse() {
        return new GetSongListResponse();
    }

    /**
     * Create an instance of {@link PlaylistSongType }
     * 
     */
    public PlaylistSongType createPlaylistSongType() {
        return new PlaylistSongType();
    }

    /**
     * Create an instance of {@link PlaylistSongListType }
     * 
     */
    public PlaylistSongListType createPlaylistSongListType() {
        return new PlaylistSongListType();
    }

    /**
     * Create an instance of {@link GetPlaylistRequest }
     * 
     */
    public GetPlaylistRequest createGetPlaylistRequest() {
        return new GetPlaylistRequest();
    }

    /**
     * Create an instance of {@link GetSongListRequest }
     * 
     */
    public GetSongListRequest createGetSongListRequest() {
        return new GetSongListRequest();
    }

    /**
     * Create an instance of {@link GetSongRequest }
     * 
     */
    public GetSongRequest createGetSongRequest() {
        return new GetSongRequest();
    }

    /**
     * Create an instance of {@link GetPlaylistListResponse }
     * 
     */
    public GetPlaylistListResponse createGetPlaylistListResponse() {
        return new GetPlaylistListResponse();
    }

    /**
     * Create an instance of {@link AddSongRequest }
     * 
     */
    public AddSongRequest createAddSongRequest() {
        return new AddSongRequest();
    }

    /**
     * Create an instance of {@link AddPlaylistRequest }
     * 
     */
    public AddPlaylistRequest createAddPlaylistRequest() {
        return new AddPlaylistRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaylistType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/playlist", name = "addPlaylistResponse")
    public JAXBElement<PlaylistType> createAddPlaylistResponse(PlaylistType value) {
        return new JAXBElement<PlaylistType>(_AddPlaylistResponse_QNAME, PlaylistType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SongType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/playlist", name = "getSongResponse")
    public JAXBElement<SongType> createGetSongResponse(SongType value) {
        return new JAXBElement<SongType>(_GetSongResponse_QNAME, SongType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaylistType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/playlist", name = "getPlaylistResponse")
    public JAXBElement<PlaylistType> createGetPlaylistResponse(PlaylistType value) {
        return new JAXBElement<PlaylistType>(_GetPlaylistResponse_QNAME, PlaylistType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaylistSongListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/playlist", name = "getPlaylistSongListResponse")
    public JAXBElement<PlaylistSongListType> createGetPlaylistSongListResponse(PlaylistSongListType value) {
        return new JAXBElement<PlaylistSongListType>(_GetPlaylistSongListResponse_QNAME, PlaylistSongListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaylistSongType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/playlist", name = "addPlaylistSongResponse")
    public JAXBElement<PlaylistSongType> createAddPlaylistSongResponse(PlaylistSongType value) {
        return new JAXBElement<PlaylistSongType>(_AddPlaylistSongResponse_QNAME, PlaylistSongType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SongType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/playlist", name = "addSongResponse")
    public JAXBElement<SongType> createAddSongResponse(SongType value) {
        return new JAXBElement<SongType>(_AddSongResponse_QNAME, SongType.class, null, value);
    }

}
