package com.be.coding.assignment.demo.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets fileType
 */
public enum FileType {
  TEXT("text"),
    SQL("sql"),
    BINARY("binary");

  private String value;

  FileType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FileType fromValue(String text) {
    for (FileType b : FileType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
