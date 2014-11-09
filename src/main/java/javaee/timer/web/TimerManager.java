/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaee.timer.web;

import java.io.Serializable;
import javaee.timer.ejb.TimerSessionBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TimerManager implements Serializable{
    
    @EJB
    private TimerSessionBean timerSession;
    
    private String lastProgrammaticTimeout;
    private String lastAutomaticTimeout;

    public String getLastProgrammaticTimeout() {
        lastProgrammaticTimeout = timerSession.getLastProgrammaticTimeout();
        return lastProgrammaticTimeout;
    }

    public void setLastProgrammaticTimeout(String lastProgrammaticTimeout) {
        this.lastProgrammaticTimeout = lastProgrammaticTimeout;
    }

    public void setTimer(){
        long timeoutDuration = 8000;
        timerSession.setTimer(timeoutDuration);
    }
    
    public String getLastAutomaticTimeout() {
        lastAutomaticTimeout = timerSession.getLastAutomaticTimeout();
        return lastAutomaticTimeout;
    }

    public void setLastAutomaticTimeout(String lastAutomaticTimeout) {
        this.lastAutomaticTimeout = lastAutomaticTimeout;
    }
    
    
}
