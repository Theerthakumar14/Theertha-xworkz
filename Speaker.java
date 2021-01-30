class Speaker
{
static int maxVol = 40;
static boolean isConnected = true;
static int currentVolume =10;
static int minVol =0;
public static void main(String a[])
{
String brandName;
double price;
brandName ="Bose";
price =2000;
System.out.println("brandName="+brandName);
System.out.println("price="+price);
increaseVolume();
decreaseVolume();
}
public static void increaseVolume()
{
if(isConnected)
{
if(currentVolume < maxVol)
{
currentVolume = currentVolume +1;
System.out.println("currentVolume is:"+currentVolume);
}
}
}
public static void decreaseVolume()
{
if(isConnected)
{
if(currentVolume > minVol)
{
currentVolume = currentVolume -1;
System.out.println("currentVolume is:"+currentVolume);
}
}
}
}
