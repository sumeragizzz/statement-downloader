package com.sumeragizzz.statementdownloader.web.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class IndexBean implements Serializable {

    private String status;

    private Date now;

    public String execute() {
        now = new Date();
        return null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

}
