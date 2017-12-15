
package ee.ttu.idu0075.playlist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for playlistSongListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playlistSongListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="playlistSong" type="{http://www.ttu.ee/idu0075/playlist}playlistSongType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "playlistSongListType", propOrder = {
    "playlistSong"
})
public class PlaylistSongListType {

    protected List<PlaylistSongType> playlistSong;

    /**
     * Gets the value of the playlistSong property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the playlistSong property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaylistSong().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaylistSongType }
     * 
     * 
     */
    public List<PlaylistSongType> getPlaylistSong() {
        if (playlistSong == null) {
            playlistSong = new ArrayList<PlaylistSongType>();
        }
        return this.playlistSong;
    }

}
