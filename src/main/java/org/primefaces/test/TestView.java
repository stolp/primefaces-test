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
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.faces.model.SelectItem;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;
    private List<TestObject> list;
    private List<TestObject> selection;

    @PostConstruct
    public void init() {
        string = "Welcome to PrimeFaces!!!";
        list = new ArrayList<>(Arrays.asList(
                new TestObject("", "Michael Jackson", 1982),
                new TestObject("Back in Black", "AC/DC", 1980),
                new TestObject("The Bodyguard", "Whitney Houston", 1992),
                new TestObject("The Dark Side of the Moon", "Pink Floyd", 1973)
        ));
        selection = new ArrayList<>();
    }

    public List<SelectItem> getSelectItems() {

        List<SelectItem> selectItemsList = new ArrayList<>(list.size());

        for (final TestObject item : list) {

            SelectItem selectItem = new SelectItem(item.getId(), item.getName());
            selectItemsList.add(selectItem);
        }

        return selectItemsList;
    }

    public List<TestObject> getSelection() {

        return selection;
    }

    public void setSelection(List<TestObject> value) {

        selection = value;
    }
}
