/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;
import javax.json.spi.JsonProvider;
import javax.websocket.Session;

/**
 *
 * @author philippnienhuser
 */
public class SessionHandler {
    
    // echa connected Client has its own Session
    private final Set<Session> sessions = new HashSet<>();
    
    //add to our hashset
    public void addSession(Session session){
        sessions.add(session);
        sessions.add(session);
        /*for (Device device : devices) {
            JsonObject addMessage = createAddMessage(device);
            sendToSession(session, addMessage);
        }*/
    }
    
    // remove session from our hashset
    public void removeSession(Session session){
        sessions.remove(session);
    }
}
