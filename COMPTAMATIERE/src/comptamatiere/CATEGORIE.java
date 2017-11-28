/***********************************************************************
 * Module:  CATEGORIE.java
 * Author:  OBAM
 * Purpose: Defines the Class CATEGORIE
 ***********************************************************************/
package comptamatiere;

import java.sql.SQLException;

public class CATEGORIE extends COMPTED {
   public int IDCATEGORIE;
   public String LIBCATEGORIE;
   public int DUREEVIE;
   public String codeIcat;
   
   public String getIdDFromC(int idC) throws SQLException{
       return getOneResult("select idcompted from categorie where idcategorie="+idC);
   }
   public String getLibcategorieFromIdC(int idc) throws SQLException{
    return getOneResult("select libcategorie from categorie where idcategorie="+idc);
   }
   
 

}