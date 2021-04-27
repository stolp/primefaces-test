/*
 * Copyright 2021 verit Informationssysteme GmbH, Europaallee 10,
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

import org.primefaces.extensions.model.monacoeditor.ELanguage;
import org.primefaces.extensions.model.monacoeditor.EditorOptions;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

    private static final long serialVersionUID = 1L;

    private String string;

    /**
     * @return Returns the string.
     */
    public String getString() {

        return string;
    }


    /**
     * @param string The string to set.
     */
    public void setString(String string) {

        this.string = string;
    }

    @PostConstruct
    public void init() {
        string = "Welcome to PrimeFaces!!!";
    }

    public EditorOptions getScriptEditorOptions() {

        final EditorOptions options = new EditorOptions();
        options.setLanguage(ELanguage.JAVA);
        options.setLargeFileOptimizations(false);
        options.setTabSize(4);

        return options;
    }

    public EditorOptions getTemplateEditorOptions() {

        final EditorOptions options = new EditorOptions();
        options.setLanguage(ELanguage.XML);
        options.setLargeFileOptimizations(false);
        options.setTabSize(2);

        return options;
    }


}
