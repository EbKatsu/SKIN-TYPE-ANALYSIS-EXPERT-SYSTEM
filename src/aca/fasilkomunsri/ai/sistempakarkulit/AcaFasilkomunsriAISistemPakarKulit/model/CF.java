package aca.fasilkomunsri.ai.sistempakarkulit.AcaFasilkomunsriAISistemPakarKulit.model;
public class CF {
    private double BG01, BG02, BG03, BG04, BG05, BG06, BG07, BG08, BG09, BG10, BG11, BG12, BG13, BG14, BG15, BG16, BG17, BG18, BG19, BG20;
    
    public double GKNormal (double R01, double R02, double R03, double R04, double R05, double R06, double R11){
        BG01 = 0.8;
        BG02 = 0.8;
        BG03 = 0.8;
        BG04 = 0.8;
        BG05 = 0.8;
        BG06 = 0.8;
        BG11 = 0.8;
        
        double cf1 = BG01 * R01;
        double cf2 = BG02 * R02;
        double cf3 = BG03 * R03;
        double cf4 = BG04 * R04;
        double cf5 = BG05 * R05;
        double cf6 = BG06 * R06;
        double cf11 = BG11 * R11;
        
        double cfc = cf1 + cf2 * (1 - cf1);
        cfc = cfc + cf3 * (1 - cfc);
        cfc = cfc + cf4 * (1 - cfc);
        cfc = cfc + cf5 * (1 - cfc);
        cfc = cfc + cf6 * (1 - cfc);
        cfc = cfc + cf11 * (1 - cfc);
        
        double persKeyakinan = cfc * 100;
        
        return persKeyakinan;
    }
    
    public double GKBerminyak (double R07, double R08, double R09, double R16){
        BG07 = 0.8;
        BG08 = 0.8;
        BG09 = 0.8;
        BG16 = 0.8;
        
        double cf7 = BG07 * R07;
        double cf8 = BG08 * R08;
        double cf9 = BG09 * R09;
        double cf16 = BG16 * R16;
        
        double cfc = cf7 + cf8 * (1 - cf7);
        cfc = cfc + cf9 * (1 - cfc);
        cfc = cfc + cf16 * (1 - cfc);
        
        double persKeyakinan = cfc * 100;
        
        return persKeyakinan;
    }
    
    public double GKKering (double R01, double R05, double R10, double R11, double R12){
        BG01 = 0.6;
        BG05 = 0.6;
        BG10 = 0.8;
        BG11 = 0.6;
        BG12 = 0.6;
        
        double cf1 = BG01 * R01;
        double cf5 = BG05 * R05;
        double cf10 = BG10 * R10;
        double cf11 = BG11 * R11;
        double cf12 = BG12 * R12;
        
        double cfc = cf1 + cf5 * (1 - cf1);
        cfc = cfc + cf10 * (1 - cfc);
        cfc = cfc + cf11 * (1 - cfc);
        cfc = cfc + cf12 * (1 - cfc);
        
        double persKeyakinan = cfc * 100;
        
        return persKeyakinan;
    }
    
    public double GKKombinasi (double R07, double R14, double R15, double R16, double R17){
        BG07 = 0.6;
        BG14 = 0.4;
        BG15 = 0.6;
        BG16 = 0.4;
        BG17 = 0.6;
        
        double cf7 = BG07 * R07;
        double cf14 = BG14 * R14;
        double cf15 = BG15 * R15;
        double cf16 = BG16 * R16;
        double cf17 = BG17 * R17;
        
        double cfc = cf7 + cf14 * (1 - cf7);
        cfc = cfc + cf15 * (1 - cfc);
        cfc = cfc + cf16 * (1 - cfc);
        cfc = cfc + cf17 * (1 - cfc);
        
        double persKeyakinan = cfc * 100;
        
        return persKeyakinan;
    }
    
    public double GKSensitif (double R12, double R18, double R19, double R20){
        BG12 = 0.8;
        BG18 = 0.8;
        BG19 = 0.8;
        BG20 = 0.8;
        
        double cf12 = BG12 * R12;
        double cf18 = BG18 * R18;
        double cf19 = BG19 * R19;
        double cf20 = BG20 * R20;
        
        double cfc = cf12 + cf18 * (1 - cf12);
        cfc = cfc + cf19 * (1 - cfc);
        cfc = cfc + cf20 * (1 - cfc);
        
        double persKeyakinan = cfc * 100;
        
        return persKeyakinan;
    }
}
