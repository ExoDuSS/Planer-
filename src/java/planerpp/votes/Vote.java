/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planerpp.votes;

import java.util.ArrayList;

import planerpp.util.Date;
/**
 *
 * @author nolde
 */
public class Vote {
    private int id;
    private String name;
    private String desc;
    
    private ArrayList<Integer> user;
    private ArrayList<Appointment> apppoints;
    private Date deadline;
}
