package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.Entity;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Pasta
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class Pasta extends Entity {

  private String vendor;

  public Pasta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Pasta(String atType) {
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

  public Pasta vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Get vendor
   * @return vendor
  */
  
  @Schema(name = "vendor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public Pasta href(String href) {
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

  public Pasta id(String id) {
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

  public Pasta atSchemaLocation(String atSchemaLocation) {
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

  public Pasta atBaseType(String atBaseType) {
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

  public Pasta atType(String atType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pasta pasta = (Pasta) o;
    return Objects.equals(this.vendor, pasta.vendor) &&
        Objects.equals(this.href, pasta.href) &&
        Objects.equals(this.id, pasta.id) &&
        Objects.equals(this.atSchemaLocation, pasta.atSchemaLocation) &&
        Objects.equals(this.atBaseType, pasta.atBaseType) &&
        Objects.equals(this.atType, pasta.atType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendor, href, id, atSchemaLocation, atBaseType, atType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pasta {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
  
  public static class Builder extends Entity.Builder {

    private Pasta instance;

    public Builder() {
      this(new Pasta());
    }

    protected Builder(Pasta instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(Pasta value) { 
      super.copyOf(instance);
      this.instance.setVendor(value.vendor);
      return this;
    }

    public Pasta.Builder vendor(String vendor) {
      this.instance.vendor(vendor);
      return this;
    }
    
    @Override
    public Pasta.Builder href(String href) {
      this.instance.href(href);
      return this;
    }
    
    @Override
    public Pasta.Builder id(String id) {
      this.instance.id(id);
      return this;
    }
    
    @Override
    public Pasta.Builder atSchemaLocation(String atSchemaLocation) {
      this.instance.atSchemaLocation(atSchemaLocation);
      return this;
    }
    
    @Override
    public Pasta.Builder atBaseType(String atBaseType) {
      this.instance.atBaseType(atBaseType);
      return this;
    }
    
    @Override
    public Pasta.Builder atType(String atType) {
      this.instance.atType(atType);
      return this;
    }
    
    /**
    * returns a built Pasta instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public Pasta build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field (except for the default values).
  */
  public static Pasta.Builder builder() {
    return new Pasta.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Pasta.Builder toBuilder() {
    Pasta.Builder builder = new Pasta.Builder();
    return builder.copyOf(this);
  }

}

