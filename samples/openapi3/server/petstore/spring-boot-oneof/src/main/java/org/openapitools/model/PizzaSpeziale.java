package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import org.openapitools.model.Pizza;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PizzaSpeziale
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class PizzaSpeziale extends Pizza {

  private String toppings;

  public PizzaSpeziale() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PizzaSpeziale(String atType) {
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

  public PizzaSpeziale toppings(String toppings) {
    this.toppings = toppings;
    return this;
  }

  /**
   * Get toppings
   * @return toppings
  */
  
  @Schema(name = "toppings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toppings")
  public String getToppings() {
    return toppings;
  }

  public void setToppings(String toppings) {
    this.toppings = toppings;
  }

  public PizzaSpeziale href(String href) {
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

  public PizzaSpeziale id(String id) {
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

  public PizzaSpeziale atSchemaLocation(String atSchemaLocation) {
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

  public PizzaSpeziale atBaseType(String atBaseType) {
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

  public PizzaSpeziale atType(String atType) {
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

  public PizzaSpeziale pizzaSize(BigDecimal pizzaSize) {
    super.setPizzaSize(pizzaSize);
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
    PizzaSpeziale pizzaSpeziale = (PizzaSpeziale) o;
    return Objects.equals(this.toppings, pizzaSpeziale.toppings) &&
        Objects.equals(this.href, pizzaSpeziale.href) &&
        Objects.equals(this.id, pizzaSpeziale.id) &&
        Objects.equals(this.atSchemaLocation, pizzaSpeziale.atSchemaLocation) &&
        Objects.equals(this.atBaseType, pizzaSpeziale.atBaseType) &&
        Objects.equals(this.atType, pizzaSpeziale.atType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toppings, href, id, atSchemaLocation, atBaseType, atType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PizzaSpeziale {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    toppings: ").append(toIndentedString(toppings)).append("\n");
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
  
  public static class Builder extends Pizza.Builder {

    private PizzaSpeziale instance;

    public Builder() {
      this(new PizzaSpeziale());
    }

    protected Builder(PizzaSpeziale instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(PizzaSpeziale value) { 
      super.copyOf(instance);
      this.instance.setToppings(value.toppings);
      return this;
    }

    public PizzaSpeziale.Builder toppings(String toppings) {
      this.instance.toppings(toppings);
      return this;
    }
    
    @Override
    public PizzaSpeziale.Builder pizzaSize(BigDecimal pizzaSize) {
      this.instance.pizzaSize(pizzaSize);
      return this;
    }
    
    @Override
    public PizzaSpeziale.Builder href(String href) {
      this.instance.href(href);
      return this;
    }
    
    @Override
    public PizzaSpeziale.Builder id(String id) {
      this.instance.id(id);
      return this;
    }
    
    @Override
    public PizzaSpeziale.Builder atSchemaLocation(String atSchemaLocation) {
      this.instance.atSchemaLocation(atSchemaLocation);
      return this;
    }
    
    @Override
    public PizzaSpeziale.Builder atBaseType(String atBaseType) {
      this.instance.atBaseType(atBaseType);
      return this;
    }
    
    @Override
    public PizzaSpeziale.Builder atType(String atType) {
      this.instance.atType(atType);
      return this;
    }
    
    /**
    * returns a built PizzaSpeziale instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public PizzaSpeziale build() {
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
  public static PizzaSpeziale.Builder builder() {
    return new PizzaSpeziale.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PizzaSpeziale.Builder toBuilder() {
    PizzaSpeziale.Builder builder = new PizzaSpeziale.Builder();
    return builder.copyOf(this);
  }

}

