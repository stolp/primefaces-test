/*
 * Copyright 2003 - 2021 verit Informationssysteme GmbH, Europaallee 10,
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

/**
 * Class representing an uploaded file.
 */
public class UploadedFile {

    private final byte[] data;
    private final String name;
    private final long size;

    /**
     * Create a UploadedFile.
     *
     * @param uploadedFileData the uploaded file data
     * @param uploadedFileName the uploaded file name
     * @param uploadedFileSize the uploaded file size
     */
    public UploadedFile(final byte[] uploadedFileData, final String uploadedFileName,
            final long uploadedFileSize) {

        super();
        this.data = uploadedFileData;
        this.name = uploadedFileName;
        this.size = uploadedFileSize;
    }

    /**
     * Gets the uploadedFileData.
     *
     * @return the uploadedFileData.
     */
    public byte[] getUploadedFileData() {

        return data;
    }

    /**
     * Gets the uploadedFileName.
     *
     * @return the uploadedFileName.
     */
    public String getUploadedFileName() {

        return name;
    }

    /**
     * Gets the uploadedFileSize.
     *
     * @return the uploadedFileSize.
     */
    public long getUploadedFileSize() {

        return size;
    }
}
