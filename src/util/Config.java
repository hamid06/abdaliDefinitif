/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author moulaYounes
 */
public class Config {
//    private static String cheminJasper="C:\\Users\\moulaYounes\\Documents\\NetBeansProjects\\testJasper1\\src\\report\\list.jasper";
    private static String cheminJasper="C:\\Users\\hamid\\Documents\\NetBeansProjects\\CabinetMedicalIHM\\src\\report\\patients.jasper";
    private static String cheminExport="D:\\patients.pdf";

    public static String getCheminJasper() {
        return cheminJasper;
    }

    public static void setCheminJasper(String cheminJasper) {
        Config.cheminJasper = cheminJasper;
    }

    public static String getCheminExport() {
        return cheminExport;
    }

    public static void setCheminExport(String cheminExport) {
        Config.cheminExport = cheminExport;
    }
    
    
    
}
