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
 * Foo
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class Foo extends Entity implements FooRefOrValue {

  private String fooPropA;

  private String fooPropB;

  public Foo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Foo(String atType) {
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

  public Foo fooPropA(String fooPropA) {
    this.fooPropA = fooPropA;
    return this;
  }

  /**
   * Get fooPropA
   * @return fooPropA
  */
  
  @Schema(name = "fooPropA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fooPropA")
  public String getFooPropA() {
    return fooPropA;
  }

  public void setFooPropA(String fooPropA) {
    this.fooPropA = fooPropA;
  }

  public Foo fooPropB(String fooPropB) {
    this.fooPropB = fooPropB;
    return this;
  }

  /**
   * Get fooPropB
   * @return fooPropB
  */
  
  @Schema(name = "fooPropB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fooPropB")
  public String getFooPropB() {
    return fooPropB;
  }

  public void setFooPropB(String fooPropB) {
    this.fooPropB = fooPropB;
  }


  public Foo href(String href) {
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

  public Foo id(String id) {
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

  public Foo atSchemaLocation(String atSchemaLocation) {
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

  public Foo atBaseType(String atBaseType) {
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

  public Foo atType(String atType) {
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
    Foo foo = (Foo) o;
    return Objects.equals(this.fooPropA, foo.fooPropA) &&
        Objects.equals(this.fooPropB, foo.fooPropB) &&
        Objects.equals(this.href, foo.href) &&
        Objects.equals(this.id, foo.id) &&
        Objects.equals(this.atSchemaLocation, foo.atSchemaLocation) &&
        Objects.equals(this.atBaseType, foo.atBaseType) &&
        Objects.equals(this.atType, foo.atType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fooPropA, fooPropB, href, id, atSchemaLocation, atBaseType, atType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Foo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fooPropA: ").append(toIndentedString(fooPropA)).append("\n");
    sb.append("    fooPropB: ").append(toIndentedString(fooPropB)).append("\n");
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

    private Foo instance;

    public Builder() {
      this(new Foo());
    }

    protected Builder(Foo instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(Foo value) { 
      super.copyOf(instance);
      this.instance.setFooPropA(value.fooPropA);
      this.instance.setFooPropB(value.fooPropB);
      return this;
    }

    public Foo.Builder fooPropA(String fooPropA) {
      this.instance.fooPropA(fooPropA);
      return this;
    }
    
    public Foo.Builder fooPropB(String fooPropB) {
      this.instance.fooPropB(fooPropB);
      return this;
    }
    
    @Override
    public Foo.Builder href(String href) {
      this.instance.href(href);
      return this;
    }
    
    @Override
    public Foo.Builder id(String id) {
      this.instance.id(id);
      return this;
    }
    
    @Override
    public Foo.Builder atSchemaLocation(String atSchemaLocation) {
      this.instance.atSchemaLocation(atSchemaLocation);
      return this;
    }
    
    @Override
    public Foo.Builder atBaseType(String atBaseType) {
      this.instance.atBaseType(atBaseType);
      return this;
    }
    
    @Override
    public Foo.Builder atType(String atType) {
      this.instance.atType(atType);
      return this;
    }
    
    /**
    * returns a built Foo instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public Foo build() {
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
  public static Foo.Builder builder() {
    return new Foo.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Foo.Builder toBuilder() {
    Foo.Builder builder = new Foo.Builder();
    return builder.copyOf(this);
  }

}

