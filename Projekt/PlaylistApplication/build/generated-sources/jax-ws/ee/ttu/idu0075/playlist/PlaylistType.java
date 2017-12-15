
package ee.ttu.idu0075.playlist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for playlistType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playlistType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="playlistCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="playlistName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="playlistSongList" type="{http://www.ttu.ee/idu0075/playlist}playlistSongListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "playlistType", propOrder = {
    "id",
    "playlistCode",
    "playlistName",
    "description",
    "playlistSongList"
})
public class PlaylistType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String playlistCode;
    @XmlElement(required = true)
    protected String playlistName;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected PlaylistSongListType playlistSongList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the playlistCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaylistCode() {
        return playlistCode;
    }

    /**
     * Sets the value of the playlistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaylistCode(String value) {
        this.playlistCode = value;
    }

    /**
     * Gets the value of the playlistName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaylistName() {
        return playlistName;
    }

    /**
     * Sets the value of the playlistName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaylistName(String value) {
        this.playlistName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the playlistSongList property.
     * 
     * @return
     *     possible object is
     *     {@link PlaylistSongListType }
     *     
     */
    public PlaylistSongListType getPlaylistSongList() {
        return playlistSongList;
    }

    /**
     * Sets the value of the playlistSongList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaylistSongListType }
     *     
     */
    public void setPlaylistSongList(PlaylistSongListType value) {
        this.playlistSongList = value;
    }

}
