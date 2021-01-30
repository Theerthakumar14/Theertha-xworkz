class Television
{
static int tvChannel = 829;
static int tvVolume = 25;
static int minVolume = 5;
static boolean isConnected = true;
public static void main(String a[])
{
String brandName = "LG";
double price = 35000.00;
System.out.println("LG");
System.out.println("35000.00");
 tvChannel();
tvVolume();
}
public static void tvChannel()
{
if(isConnected)
{
tvChannel=829;
System.out.println("tvChannel is 829");
}
}
public static void tvVolume()
{
if(isConnected)
{
if(tvVolume > minVolume)
{
tvVolume = tvVolume + 5;
System.out.println("tvVolume is" + tvVolume );
}
}
}
}

