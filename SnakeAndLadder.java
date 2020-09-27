public class SnakeAndLadder {
public static void main (String args[])
{ int p1=0,p2=0;
int k=0;
int count=1;
while(p1!=100 && p2!=100)
{
if(count%2!=0)
{
System.out.println("PLAYER 1 plays");
count++;
k++;
int i=(int)(Math.random()*6%6)+1;
System.out.println("value on the dice: "+i);
int o =(int)(Math.random()*10%3);
System.out.println("option: "+o);
switch(o)
{
case 1:
{
System.out.println("Ladder");
if(p1+i<101)
{
p1+=+i;
System.out.println("The new position of PLAYER 1 is "+p1);
count--;
}
break;
}
case 2:
{
System.out.println("Snake");
if(p1-i>-1)
{
p1-=i;
System.out.println("The new position of PLAYER 1 is "+p1);
}
else
{
p1=0;
System.out.println("The new position of PLAYER 1 is "+p1);
}
break;
}
default: System.out.println("No Movement");
}
}
else
{  
System.out.println("PLAYER 2 plays");
count++;
k++;
int i=(int)(Math.random()*6%6)+1;
System.out.println("value on the dice: "+i);
int o =(int)(Math.random()*10%3);
System.out.println("option: "+o);
switch(o)
{
case 1:
{
System.out.println("Ladder");
if(p2+i<101)
{
p2+=i;
System.out.println("The new position of PLAYER 2 is "+p2);
count--;
}
break;
}
case 2:
{
System.out.println("Snake");
if(p2-i>-1)
{
p2-=i;
System.out.println("The new position of PLAYER 2 is "+p2);
}
else
{
p2=0;
System.out.println("The new position for PLAYER 2 is "+p2);
}
break;
}
default: System.out.println("No Movement");
}
}
}
System.out.println("The winner of the game is PLAYER "+(count%2+1));
System.out.println("The dice was rolled "+k+" number of times");
}
}