package muestra;

/**
 *
 * @author PC-GARCIA
 */
public class formulasMuestra {

    //
    public double convertPorcentajeToNivel(int zPorcent) {
        double zNivelConfianza = 0;

        switch (zPorcent) {
            case 99:
            zNivelConfianza = 2.58;    
            break;
            case 98:
            zNivelConfianza = 2.33;    
            break;
            case 97:
            zNivelConfianza = 2.17;    
            break;
            case 96:
            zNivelConfianza = 2.05;    
            break;
            case 95:
            zNivelConfianza = 1.96;    
            break;
            case 94:
            zNivelConfianza = 1.88;    
            break;
            case 93:
            zNivelConfianza = 1.81;    
            break;
            case 92:
            zNivelConfianza = 1.75;    
            break;
            case 91:
            zNivelConfianza = 1.70;    
            break;
            case 90:
            zNivelConfianza = 1.64;    
            break;
        }
        return zNivelConfianza;
    }
   
    //metodo para muestra con Poblacion FINITA sin Desviacion Estandar ----Ecuacion 1
    public double muestraPobFinitaSinDesEstandar( double variN, int varPorcenZ, double variaP, double variaQ, double variError )
    {
        double total = 0;
        double ZNivelConfi=0;
        double numerador =0;
        double denominador=0;
        ZNivelConfi = convertPorcentajeToNivel(varPorcenZ);
          
        numerador =  (variN) *((Math.pow(ZNivelConfi, 2))*(variaP) *(variaQ));
        denominador = ((Math.pow(variError, 2)) * ( variN-1 )) + ((Math.pow(ZNivelConfi, 2)) * (variaP) * (variaQ)) ;
        total = numerador / denominador ;
          
        return Math.round (total);
    
    }
      
    //metodo para muestra con Poblacion INFINITA sin Desviacion Estandar  ---- Ecuacion 2
    public double muestraPobInfinitaSinDevStandar(int varPorcenZ, double variaP, double variaQ, double variError) {
        double total = 0;
        double ZNivelConfi=0;
               
        ZNivelConfi = convertPorcentajeToNivel(varPorcenZ);
        total = ((Math.pow(ZNivelConfi, 2)) * (variaP) * (variaQ)) / Math.pow(variError, 2);
        return  Math.round(total);
    }

    // metodo para muestra con Poblacion Finita con Desviacion Estandar ---- Ecuacion 3
    public double muestraPobFinitaConDevStandar(double variN, int varPorcenZ, double variDE, double variError) {
        double total = 0;
        double numerador = 0;
        double denominador = 0;
        double ZNivelConfi=0;
               
        ZNivelConfi = convertPorcentajeToNivel(varPorcenZ); 
        
        numerador = (variN * Math.pow(ZNivelConfi, 2) * Math.pow(variDE, 2));
        denominador = (Math.pow(variError, 2) * (variN - 1)) + (Math.pow(ZNivelConfi, 2) * Math.pow(variDE, 2));
        total = numerador / denominador;
        return Math.round (total);
    }

    //metodo para muestra con Poblacion inFinita con Desviacion Estandar ---- Ecuacion 4
    
    public double muestraPobInFinitaCnDesvStandar (int varPorcenZ, double  variDE, double variError )
    {
            double total = 0;
            double ZNivelConfi=0; 
            ZNivelConfi = convertPorcentajeToNivel(varPorcenZ); 
            
            total =  Math.pow (((ZNivelConfi * variDE ) / variError),2)  ;
            
            return Math.round (total);
    }
    
}
