package kelyan.protocolloentrata;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ListaDistribuzione implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("email")
   private java.lang.String email;

   @org.kie.api.definition.type.Label(value = "id")
   private java.lang.String id;

   @org.kie.api.definition.type.Label(value = "cognome")
   private java.lang.String cognome;

   @org.kie.api.definition.type.Label(value = "nome")
   private java.lang.String nome;

   public ListaDistribuzione()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.lang.String getCognome()
   {
      return this.cognome;
   }

   public void setCognome(java.lang.String cognome)
   {
      this.cognome = cognome;
   }

   public java.lang.String getNome()
   {
      return this.nome;
   }

   public void setNome(java.lang.String nome)
   {
      this.nome = nome;
   }

   public ListaDistribuzione(java.lang.String email, java.lang.String id,
         java.lang.String cognome, java.lang.String nome)
   {
      this.email = email;
      this.id = id;
      this.cognome = cognome;
      this.nome = nome;
   }

}