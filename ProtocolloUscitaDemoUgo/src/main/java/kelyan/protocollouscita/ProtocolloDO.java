package kelyan.protocollouscita;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProtocolloDO implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Supporto")
   private java.lang.String supporto;

   @org.kie.api.definition.type.Label("Num.Documento")
   private java.lang.String ndoc;

   @org.kie.api.definition.type.Label("Data Arrivo")
   private java.lang.String darrivo;

   @org.kie.api.definition.type.Label("Soggetto")
   private java.lang.String soggetto;

   @org.kie.api.definition.type.Label("Interlocutore")
   private java.lang.String interlocutore;

   @org.kie.api.definition.type.Label("ProtMittente")
   private java.lang.String protMittente;

   @org.kie.api.definition.type.Label("DataDocumento")
   private java.lang.String dataDoc;

   @org.kie.api.definition.type.Label("Oggetto")
   private java.lang.String oggetto;

   @org.kie.api.definition.type.Label("Annotazioni")
   private java.lang.String annotazioni;

   @org.kie.api.definition.type.Label("Altri Soggetti")
   private java.lang.String altriSoggetti;

   @org.kie.api.definition.type.Label("idKfiles")
   private String idKfiles;

   @org.kie.api.definition.type.Label("Data Mittente")
   private java.lang.String dprotMittente;

   public ProtocolloDO()
   {
   }

   public java.lang.String getSupporto()
   {
      return this.supporto;
   }

   public void setSupporto(java.lang.String supporto)
   {
      this.supporto = supporto;
   }

   public java.lang.String getNdoc()
   {
      return this.ndoc;
   }

   public void setNdoc(java.lang.String ndoc)
   {
      this.ndoc = ndoc;
   }

   public java.lang.String getDarrivo()
   {
      return this.darrivo;
   }

   public void setDarrivo(java.lang.String darrivo)
   {
      this.darrivo = darrivo;
   }

   public java.lang.String getSoggetto()
   {
      return this.soggetto;
   }

   public void setSoggetto(java.lang.String soggetto)
   {
      this.soggetto = soggetto;
   }

   public java.lang.String getInterlocutore()
   {
      return this.interlocutore;
   }

   public void setInterlocutore(java.lang.String interlocutore)
   {
      this.interlocutore = interlocutore;
   }

   public java.lang.String getProtMittente()
   {
      return this.protMittente;
   }

   public void setProtMittente(java.lang.String protMittente)
   {
      this.protMittente = protMittente;
   }

   public java.lang.String getOggetto()
   {
      return this.oggetto;
   }

   public void setOggetto(java.lang.String oggetto)
   {
      this.oggetto = oggetto;
   }

   public java.lang.String getAnnotazioni()
   {
      return this.annotazioni;
   }

   public void setAnnotazioni(java.lang.String annotazioni)
   {
      this.annotazioni = annotazioni;
   }

   public java.lang.String getAltriSoggetti()
   {
      return this.altriSoggetti;
   }

   public void setAltriSoggetti(java.lang.String altriSoggetti)
   {
      this.altriSoggetti = altriSoggetti;
   }

   public java.lang.String getDprotMittente()
   {
      return this.dprotMittente;
   }

   public void setDprotMittente(java.lang.String dprotMittente)
   {
      this.dprotMittente = dprotMittente;
   }

   public java.lang.String getDataDoc()
   {
      return this.dataDoc;
   }

   public void setDataDoc(java.lang.String dataDoc)
   {
      this.dataDoc = dataDoc;
   }

   public java.lang.String getIdKfiles()
   {
      return this.idKfiles;
   }

   public void setIdKfiles(java.lang.String idKfiles)
   {
      this.idKfiles = idKfiles;
   }

   public ProtocolloDO(java.lang.String supporto, java.lang.String ndoc,
         java.lang.String darrivo, java.lang.String soggetto,
         java.lang.String interlocutore, java.lang.String protMittente,
         java.lang.String dataDoc, java.lang.String oggetto,
         java.lang.String annotazioni, java.lang.String altriSoggetti,
         java.lang.String idKfiles, java.lang.String dprotMittente)
   {
      this.supporto = supporto;
      this.ndoc = ndoc;
      this.darrivo = darrivo;
      this.soggetto = soggetto;
      this.interlocutore = interlocutore;
      this.protMittente = protMittente;
      this.dataDoc = dataDoc;
      this.oggetto = oggetto;
      this.annotazioni = annotazioni;
      this.altriSoggetti = altriSoggetti;
      this.idKfiles = idKfiles;
      this.dprotMittente = dprotMittente;
   }

}