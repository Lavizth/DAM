<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <equipo>    
      <xsl:apply-templates />
  </equipo>
  </xsl:template>
  
  
  <xsl:template match="/Operario">
    <empleado>
      <xsl:value-of select="concat(/cadena_montaje/operario/nombre,  /cadena_montaje/operario/apellidos)"/>
    </empleado>
  </xsl:template> 
</xsl:stylesheet>
