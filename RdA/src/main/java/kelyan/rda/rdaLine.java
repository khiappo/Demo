package kelyan.rda;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class rdaLine implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Codice")
   private java.lang.String code;
   @org.kie.api.definition.type.Label(value = "Descrizione")
   private java.lang.String description;
   @org.kie.api.definition.type.Label(value = "Quantit\u00E0")
   private java.lang.Integer quantity;
   @org.kie.api.definition.type.Label(value = "Prezzo")
   private java.lang.Float price;
   @org.kie.api.definition.type.Label(value = "Importo")
   private java.lang.Float amount;

   public rdaLine()
   {
   }

   public java.lang.String getCode()
   {
      return this.code;
   }

   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public java.lang.Integer getQuantity()
   {
      return this.quantity;
   }

   public void setQuantity(java.lang.Integer quantity)
   {
      this.quantity = quantity;
   }

   public java.lang.Float getPrice()
   {
      return this.price;
   }

   public void setPrice(java.lang.Float price)
   {
      this.price = price;
   }

   public java.lang.Float getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Float amount)
   {
      this.amount = amount;
   }

   public rdaLine(java.lang.String code, java.lang.String description,
         java.lang.Integer quantity, java.lang.Float price,
         java.lang.Float amount)
   {
      this.code = code;
      this.description = description;
      this.quantity = quantity;
      this.price = price;
      this.amount = amount;
   }

}