package com.be.coding.assignment.demo.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * BulkFileBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-04T14:42:02.620Z[GMT]")


public class BulkFileBody   {
  @JsonProperty("fileType")
  private FileType fileType = null;

  @JsonProperty("documentFile")
  private Resource documentFile = null;

  public BulkFileBody fileType(FileType fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * Get fileType
   * @return fileType
   **/
  @Schema(description = "")
  
    @Valid
    public FileType getFileType() {
    return fileType;
  }

  public void setFileType(FileType fileType) {
    this.fileType = fileType;
  }

  public BulkFileBody documentFile(Resource documentFile) {
    this.documentFile = documentFile;
    return this;
  }

  /**
   * Get documentFile
   * @return documentFile
   **/
  @Schema(description = "")
  
    @Valid
    public Resource getDocumentFile() {
    return documentFile;
  }

  public void setDocumentFile(Resource documentFile) {
    this.documentFile = documentFile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkFileBody bulkFileBody = (BulkFileBody) o;
    return Objects.equals(this.fileType, bulkFileBody.fileType) &&
        Objects.equals(this.documentFile, bulkFileBody.documentFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, documentFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkFileBody {\n");
    
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    documentFile: ").append(toIndentedString(documentFile)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
