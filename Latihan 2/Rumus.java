public class Rumus {
    
    int a;
    int b;
    int c;
    double determinan;
    double akar1;
    double akar2;

    double getDeterminan(int a,int b,int c)
    {

        determinan = b*b - (4*a*c);
        return determinan;

    }

    double getAkar1(double determinan,int a,int b,int c)
    {

        if(determinan > 0)
        {
            akar1 = (-1*b + Math.sqrt(determinan) ) / (2*a);
        }
        else if (determinan < 0)
        {
            akar1 = (-1*b + Math.sqrt(-1*determinan))/(2*a);
        }
        else if (determinan == 0)
        {
            akar1 = -1*b/(2*a);
        }
        return akar1;

    }
    double getAkar2(double determinan,int a,int b,int c)
    {

        if(determinan > 0)
        {
            akar2 = (-1*b - Math.sqrt(determinan) ) / (2*a);
        }
        else if (determinan < 0)
        {
            akar2 = (-1*b/(2*a) - Math.sqrt(-1*determinan))/ (2*a);
        }
        else if (determinan == 0)
        {
            akar2 = -1*b/(2*a);
        }
        return akar2;

    }
}
