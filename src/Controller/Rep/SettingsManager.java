/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Rep;

import Controller.Main.iMuzaMusic;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class SettingsManager {
    Integer Artist_Commission, Location_Commission, Max_Addon_Commission, 
            Max_Allowed_Showtime, Max_Presale_Tickets, Minimum_Days_Before_Presale, 
            Presale_Discount, Regular_Tickets_Sale, Show_Addon_Commission, Show_Approval_Timeout;
    String Birthday_Card;
    
    
    public static Map<String, String> getSettings(Date prior){
        Map<String, String> settingsMap = new HashMap<String, String>();
        
        //Get settings
        String qry = "SELECT GlobalSettings.Key\n" +
"FROM GlobalSettings\n" +
"GROUP BY GlobalSettings.Key;";
        ResultSet rs = iMuzaMusic.getDB().query(qry);
        try {
            while(rs.next()){
                settingsMap.put(rs.getString(1), "");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //For each setting get the recent one prior to the date
        for(String setting : settingsMap.keySet()){
        qry = "SELECT TOP 1 GlobalSettings.Key, GlobalSettings.Value\n" +
"FROM GlobalSettings\n" +
"GROUP BY GlobalSettings.Key, GlobalSettings.Value\n" +
"HAVING (((GlobalSettings.Key) In (\""+setting+"\")) AND ((Last(GlobalSettings.dateUpdated))<"+prior.getTime()+"))\n" +
"ORDER BY Last(GlobalSettings.dateUpdated) DESC;";
        
        rs = iMuzaMusic.getDB().query(qry);
            try {
                if(rs.next()){
                    settingsMap.put(setting, rs.getString(2));
                }   } catch (SQLException ex) {
                Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
         
        
        
        
        }
        
        
        
        //Test vars
        for(Map.Entry<String, String> e : settingsMap.entrySet()){
            iMuzaMusic.log(e.getKey().toString()+": "+e.getValue().toString());
        }
        return settingsMap;
    }
    
    
    
    
}