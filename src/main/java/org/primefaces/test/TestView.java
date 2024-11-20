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
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

    private List<UploadedFile> uploadedFiles;

    @PostConstruct
    public void init() {

        uploadedFiles = new ArrayList<>();
    }

    public boolean isFilePresent() {

        return !uploadedFiles.isEmpty();
    }

    public void fileUploadEvent(final FileUploadEvent event) {

        System.out.println("Upload!");

        final String error = validate(event.getFile());

        if (error != null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                error, ""));
        } else {
            final UploadedFile uploadedFile = new UploadedFile(event.getFile().getContent(), event.getFile()
                .getFileName(), event.getFile().getSize());
            uploadedFiles.add(uploadedFile);
        }
    }

    protected String validate(final org.primefaces.model.file.UploadedFile info) {

        if (!info.getContentType().startsWith("text/xml")) {
            return "Invalid content type: " + info.getContentType();
        } else {
            return null;
        }
    }

    public void fileUploadAction() {

        System.out.println("Action!");
    }

    public void cancelFileUploadDialog() {

        System.out.println("Cancel!");
    }
}
