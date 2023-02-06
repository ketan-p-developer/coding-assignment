package com.be.coding.assignment.demo.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * BulkLocationBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-04T14:42:02.620Z[GMT]")


public class BulkLocationBody   {
  @JsonProperty("fileType")
  private FileType fileType = null;

  @JsonProperty("documentFileURL")
  private String documentFileURL = null;

  public BulkLocationBody fileType(FileType fileType) {
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

  public BulkLocationBody documentFileURL(String documentFileURL) {
    this.documentFileURL = documentFileURL;
    return this;
  }

  /**
   * Get documentFileURL
   * @return documentFileURL
   **/
  @Schema(example = "https://dropbox/myfilelocation", description = "")
  
    public String getDocumentFileURL() {
    return documentFileURL;
  }

  public void setDocumentFileURL(String documentFileURL) {
    this.documentFileURL = documentFileURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkLocationBody bulkLocationBody = (BulkLocationBody) o;
    return Objects.equals(this.fileType, bulkLocationBody.fileType) &&
        Objects.equals(this.documentFileURL, bulkLocationBody.documentFileURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, documentFileURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkLocationBody {\n");
    
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    documentFileURL: ").append(toIndentedString(documentFileURL)).append("\n");
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
