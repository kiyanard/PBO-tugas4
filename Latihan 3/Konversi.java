public class Konversi {
    
    int hari;
    int jam;
    int menit;
    int detik;
    
    int getHari(int detik)
    {
        if(detik>=86400)
        {
            hari = detik/86400;
        }
        else
        {
            hari = 0;
        }
        return hari;
    }

    int getJam(int detik)
    {
        int sisahari = detik%86400;
        if(sisahari>=3600)
        {
            jam = sisahari/3600;
        }
        else
        {
            jam = 0;
        }
        return jam;
    }

    int getMenit(int detik)
    {

        int sisajam= detik%3600;
        if(sisajam>=60)
        {
            menit = sisajam/60;
        }
        else{
            menit = 0;
        }
        return menit;
    }

    int getDetik(int detik)
    {

        detik= detik%60;
       
        return detik;
    }



}

