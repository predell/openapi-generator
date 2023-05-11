package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.EntityRef;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FooRef
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FooRef extends EntityRef implements FooRefOrValue {

  private String foorefPropA;

  public FooRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FooRef(String atType) {
    super(atType);
  }

  @JsonProperty("href")
  private String href;

  @JsonProperty("id")
  private String id;

  @JsonProperty("@schemaLocation")
  private String atSchemaLocation;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@type")
  private String atType;

  public FooRef foorefPropA(String foorefPropA) {
    this.foorefPropA = foorefPropA;
    return this;
  }

  /**
   * Get foorefPropA
   * @return foorefPropA
  */
  
  @Schema(name = "foorefPropA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foorefPropA")
  public String getFoorefPropA() {
    return foorefPropA;
  }

  public void setFoorefPropA(String foorefPropA) {
    this.foorefPropA = foorefPropA;
  }

  public FooRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  */

  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String href() {
    return href;
  }

  public void href(String href) {
    this.href = href;
  }

  public FooRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  */

  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String id() {
    return id;
  }

  public void id(String id) {
    this.id = id;
  }

  public FooRef atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */

  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String atSchemaLocation() {
    return atSchemaLocation;
  }

  public void atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public FooRef atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */

  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String atBaseType() {
    return atBaseType;
  }

  public void atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public FooRef atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  @NotNull
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  public String atType() {
    return atType;
  }

  public void atType(String atType) {
    this.atType = atType;
  }

  public FooRef name(String name) {
    super.setName(name);
    return this;
  }

  public FooRef atReferredType(String atReferredType) {
    super.setAtReferredType(atReferredType);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FooRef fooRef = (FooRef) o;
    return Objects.equals(this.foorefPropA, fooRef.foorefPropA) &&
        Objects.equals(this.href, fooRef.href) &&
        Objects.equals(this.id, fooRef.id) &&
        Objects.equals(this.atSchemaLocation, fooRef.atSchemaLocation) &&
        Objects.equals(this.atBaseType, fooRef.atBaseType) &&
        Objects.equals(this.atType, fooRef.atType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foorefPropA, href, id, atSchemaLocation, atBaseType, atType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FooRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    foorefPropA: ").append(toIndentedString(foorefPropA)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

