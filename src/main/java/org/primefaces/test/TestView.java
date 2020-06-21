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
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {
    
    private static final long serialVersionUID = 1L;
 
    private List<Entry> entries;
    
    @PostConstruct  
    public void init() {
        
        entries = new ArrayList<>();
        entries.add(new Entry(EntryType.BOOLEAN, "Boolean", "true"));
        entries.add(new Entry(EntryType.STRING, "String", "Hello World!"));
        entries.add(new Entry(EntryType.DATE, "Date", "02.06.20"));
        
    }

    public List<Entry> getEntries() {

        return entries;
    }

    public void setEntries(List<Entry> entries) {

        this.entries = entries;
    }

}
