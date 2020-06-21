/*
 * Copyright 2020 verit Informationssysteme GmbH, Europaallee 10,
 * 67657 Kaiserslautern, Germany, http://www.verit.de.
 * 
 * All rights reserved.
 * 
 * This product or document is protected by copyright and distributed
 * under licenses restricting its use, copying, distribution, and
 * decompilation. No part of this product or documentation may be
 * reproduced in any form by any means without prior written authorization
 * of verit Informationssysteme GmbH and its licensors, if any.
 */
package org.primefaces.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String testString;
    private boolean disabled;
    
    @PostConstruct  
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
    
    public void action() {
        
        setDisabled(!isDisabled());
    }

    public void enableAction() {
        
        setDisabled(false);
    }

    public boolean isDisabled() {

        return disabled;
    }

    public void setDisabled(boolean disabled) {

        this.disabled = disabled;
    }
    
}
