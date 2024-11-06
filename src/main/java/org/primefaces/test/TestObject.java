/*
 * Copyright 2024 verit Informationssysteme GmbH, Europaallee 10,
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
import java.util.UUID;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class TestObject implements Serializable {


    /**
     * @return Returns the id.
     */
    public String getId() {

        return id;
    }


    /**
     * @param id The id to set.
     */
    public void setId(String id) {

        this.id = id;
    }


    /**
     * @return Returns the name.
     */
    public String getName() {

        return name;
    }


    /**
     * @param name The name to set.
     */
    public void setName(String name) {

        this.name = name;
    }

    private String id;
    private String name;
    private String artist;
    private Integer released;

    public TestObject(String name, String artist, Integer released) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.artist = artist;
        this.released = released;
    }

}
