/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlistservicejavaapplication;

import ee.ttu.idu0075.playlist.AddSongRequest;
import ee.ttu.idu0075.playlist.GetSongListRequest;
import ee.ttu.idu0075.playlist.GetSongListResponse;
import ee.ttu.idu0075.playlist.GetSongRequest;
import ee.ttu.idu0075.playlist.SongType;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Admin
 */
public class PlaylistServiceJavaApplication {
    
    static final String TOKEN = "salajane";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Application for testing addSong and getSong operations.");
        System.out.println("Choose operation(add/get):");
        String userInput = scanner.nextLine();
        
        switch (userInput) {
                case "add":
                    AddSongRequest addSongRequest = new AddSongRequest();
                    addSongRequest.setToken(TOKEN);
                    System.out.println("Enter song code:");
                    addSongRequest.setCode(scanner.nextLine());
                    System.out.println("Enter song title:");
                    addSongRequest.setTitle(scanner.nextLine());
                    System.out.println("Enter artist:");
                    addSongRequest.setArtist(scanner.nextLine());
                    System.out.println("Enter album:");
                    addSongRequest.setAlbum(scanner.nextLine());
                    System.out.println("Enter genre:");
                    addSongRequest.setGenre(scanner.nextLine());
                    System.out.println("Enter year:");
                    try {
                    BigInteger year = scanner.nextBigInteger();
                    addSongRequest.setYear(year);
                    } catch (InputMismatchException ex) {
                        System.out.println("Datatype is not correct. Operation failed");
                        break;
                    }
                    System.out.println("Enter song length in format hh:mm:ss");
                    try {
                    XMLGregorianCalendar length = DatatypeFactory.newInstance()
                            .newXMLGregorianCalendar(scanner.next());
                    addSongRequest.setLength(length);
                    } catch (DatatypeConfigurationException | IllegalArgumentException ex) {
                        System.out.println("Datatype is not correct. Operation failed");
                        break;
                    }
                    SongType addSongResponse = addSong(addSongRequest);
                    System.out.println("Song has been added with id " + addSongResponse.getId());
                    
                    break;
                case "get":
                    System.out.println("Enter song id:");
                    GetSongRequest getSongRequest = new GetSongRequest();
                    getSongRequest.setToken(TOKEN);
                    getSongRequest.setId(BigInteger.valueOf(Integer.parseInt(
                            scanner.next())));
                    SongType getSongResponse = getSong(getSongRequest);
                    if (getSongResponse == null) {
                        System.out.println("Song not found");
                    } else {
                    System.out.println("Id: " + getSongResponse.getId());
                    System.out.println("Code: " + getSongResponse.getCode());
                    System.out.println("Artist: " + getSongResponse.getArtist());
                    System.out.println("Album: " + getSongResponse.getAlbum());
                    System.out.println("Genre: " + getSongResponse.getGenre());
                    System.out.println("Year: " + getSongResponse.getYear());
                    System.out.println("Length: " + getSongResponse.getLength());
                    }
                    break;
                default:
                    System.out.println("Wrong input");
        }
                    
    }

    private static SongType addSong(AddSongRequest parameter) {
        ee.ttu.idu0075.playlist.PlaylistService service = new ee.ttu.idu0075.playlist.PlaylistService();
        ee.ttu.idu0075.playlist.PlaylistPortType port = service.getPlaylistPort();
        return port.addSong(parameter);
    }

    private static SongType getSong(GetSongRequest parameter) {
        ee.ttu.idu0075.playlist.PlaylistService service = new ee.ttu.idu0075.playlist.PlaylistService();
        ee.ttu.idu0075.playlist.PlaylistPortType port = service.getPlaylistPort();
        return port.getSong(parameter);
    }

    private static GetSongListResponse getSongList(GetSongListRequest parameter) {
        ee.ttu.idu0075.playlist.PlaylistService service = new ee.ttu.idu0075.playlist.PlaylistService();
        ee.ttu.idu0075.playlist.PlaylistPortType port = service.getPlaylistPort();
        return port.getSongList(parameter);
    }
    
    
    
}
