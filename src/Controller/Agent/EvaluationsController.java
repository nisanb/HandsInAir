/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Agent;
import Controller.Main.DBManager;
import Controller.Main.iMuzaMusic;
import Entity.Artist;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nisan
 */
public abstract class EvaluationsController{
    DBManager DB = Controller.Main.iMuzaMusic.getDB();
    
    public static void getEvaluatedArtist(Artist artist, List<Artist> list1, List<Artist> list2){
        
        iMuzaMusic.log("Getting unevaluated and evaluated artists for artist "+artist.getID());
        ResultSet rs = iMuzaMusic.getDB().query("SELECT Artists.*, Artists.ArtistID\n" +
"FROM Artists\n" +
"WHERE (((Artists.ArtistID) Not In (\""+artist.getID()+"\")))");
        try {
            while(rs.next()){
                Artist a = new Artist(rs.getString(1));
                a.setStageName(rs.getString(2));
                list1.add(a);
                System.err.println("Added artist to unevaluated");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EvaluationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rs = iMuzaMusic.getDB().query("SELECT Artists.*\n" +
"FROM Artists INNER JOIN ArtistLikes ON Artists.ArtistID = ArtistLikes.LikeID\n" +
"WHERE (((ArtistLikes.ArtistID) In (\""+artist.getID()+"\")) AND ((ArtistLikes.LikeID)=[Artists].[ArtistID]));");
        try {
            while(rs.next()){
                Artist a = new Artist(rs.getString(1));
                a.setStageName(rs.getString(2));
                list1.remove(a);
                list2.add(a);
                System.err.println("Removed artist from unevaluated");
            }
        
        
    }   catch (SQLException ex) {
            Logger.getLogger(EvaluationsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void addEvaluation(Artist of, Artist fan){
        String qry = "INSERT INTO ArtistLikes (ArtistID, LikeID)"
                    + " VALUES ('"+of.getID()+"',\""+fan.getID()+"\")";
            iMuzaMusic.getDB().updateReturnID(qry);
            
            
    }
    
    public static void wipeEvaluations(Artist of){
        String qry = "DELETE FROM ArtistLikes WHERE ArtistID in(\""+of.getID()+"\")";
            iMuzaMusic.getDB().updateReturnID(qry);
                //Success
                iMuzaMusic.log("Successfully wiped artist evaluation ("+of.getID()+" "+of.getID());
            
    }
}
