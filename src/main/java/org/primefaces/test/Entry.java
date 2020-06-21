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


public class Entry {

    private EntryType type;
    private String name;
    private String value;
    
    public Entry( EntryType type, String name, String value) {
    
        this.type = type;
        this.name = name;
        this.setValue(value);
    }
    
    public boolean isBoolean() {
        
        return EntryType.BOOLEAN == type;
    }
    
    public boolean isString() {
        
        return EntryType.STRING == type;
    }
    
    public boolean isDate() {
        
        return EntryType.DATE == type;
    }
    
    public void setType(EntryType type) {
    
        this.type = type;
    }
    
    public String getName() {
    
        return name;
    }
    
    public void setName(String name) {
    
        this.name = name;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        System.out.println("Setting: " + value);
        this.value = value;
    }
    
}
