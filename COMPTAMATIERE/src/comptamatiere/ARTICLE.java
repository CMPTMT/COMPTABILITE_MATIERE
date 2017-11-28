
package comptamatiere;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JTable;

public class ARTICLE extends CATEGORIE {
   public long idARTICLE;
   public String LIBARTICLE;
   public String SPECIFICATION;
   public int STOCKINIT;
   public int STOCKACTU;
   public String DATESTOCKINI;
   public int PRIXUNITAIRE;
   public String UNITEMESURE;
    public String numcompte;
   
   public int getStockArticle(int codeArticle) throws SQLException{
      return Integer.parseInt(this.getOneResult("select stockactu from article where idarticle="+codeArticle));
   } 
   public HashMap getArticleInfo(int idarticle) throws SQLException{
        HashMap hm=new HashMap();
        ResultSet rs= this.getResultSet("select * from article where idarticle="+idarticle);
        int i= rs.getMetaData().getColumnCount();
        int j=1;
       rs.next();
       while(j<=i){
            hm.put(rs.getMetaData().getColumnLabel(j), rs.getString(j));
            j++;
           }
       rs.close();
        return hm;
   }
   public ARTICLE getObjetArticle(String idArticle) throws SQLException{
       ResultSet rs = this.getResultSet("select * from article");
        return null;
   }

 public void affichelot(JTable Jt, int idArticle) throws SQLException{
      Statement stm= (Statement) getConnection().createStatement();
      //  ResultSet rs=stm.executeQuery("SELECT MAX(detailinventaire.idinventaire),DATEINVENT FROM detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and idarticle="+idArticle);
      ResultSet rs=stm.executeQuery("SELECT detailinventaire.iddetailinventaire,DATEINVENT FROM detailinventaire,inventaire where inventaire.idinventaire=detailinventaire.idinventaire and iddetailinventaire=( select max(iddetailinventaire) from detailinventaire where detailinventaire.idarticle="+idArticle+")");
      //ResultSet rs=stm.executeQuery("SELECT detailinventaire.idinventaire,DATEINVENT FROM detailinventaire,inventaire where detailinventaire.idinventaire=(select max(idinventaire) from detailinventaire) and inventaire.idinventaire=detailinventaire.idinventaire and idarticle="+idArticle);
      
       if(rs.next()) { 
            Date InvDeja=rs.getDate(2);
            String sql="SELECT iddetailinventaire as Ligne,Qte_Res_StockInv as Qte, PUM as Pu,'Inv' as Type,DATEINVENT as Dates FROM detailinventaire,inventaire WHERE detailinventaire.idinventaire=(select MAX(idinventaire) from inventaire) and detailinventaire.idinventaire=inventaire.idinventaire and detailinventaire.idarticle="+idArticle +" and Qte_Res_StockInv >0 UNION(select idDETAILBON as Ligne ,DETAILBON.QTESTOCK as Qte,DETAILBON.pu as Pu,'BC'as Type,DATEBON from DETAILBON,BON where DETAILBON.idARTICLE="+idArticle+" AND BON.idbon=detailbon.idbon  and bon.DATEBON>'"+InvDeja+"') order by Dates";    
                   this.setRemplirJtable(Jt, sql); 
          }
     
        else{//l article nes pas encore dans inventaire
            
                 String sql="SELECT idarticle as Ligne,Qte_Res_StockInit as Qte,Prixunitaire as Pu,'StkIni' as Type,DATESTOCKINI as Dates from article where idarticle="+idArticle+" and Qte_Res_StockInit>0 UNION(select idDETAILBON,DETAILBON.QTESTOCK ,DETAILBON.pu ,'BC',DATEBON from DETAILBON,BON where DETAILBON.idARTICLE="+
                 idArticle+" and detailbon.idbon=bon.idbon and detailbon.QTESTOCK >0) ";
                 //String sql="SELECT iddetailinventaire as Ligne,Qte_Res_StockInv as Qte, PUM as Pu,'Inv' as Type,DATEINVENT as Dates FROM detailinventaire,inventaire WHERE detailinventaire.idinventaire=(select MAX(idinventaire) from detailinventaire) and detailinventaire.idarticle="+idArticle;
               this.setRemplirJtable(Jt, sql); 
               } 
     
         rs.close();  
}
}