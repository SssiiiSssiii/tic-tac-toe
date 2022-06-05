
package tic.tack.toe;


import java.util.Scanner;
public class TicTackToe {
    
    public static void main(String[] args) {
  
        String arr[][] = new String[3][3];
        int n=0;
         System.out.println(" hello from my first game built in java, \n"
                 + " if you want to choose the cell which contains 1 you should Enter 0 0 and "
                 + "\n if want you to move another column or row you just need to increase 1. ");
        for(int i=0;i<3;i++)
        {
             for(int j=0;j<3;j++)
             {
                 arr[i][j]=n+1+"";
                 ++n;
                  System.out.print(arr[i][j]+" ");
             }
              System.out.println();
             
        }
        
        Scanner sc =new Scanner(System.in);
        
            System.out.println("choose x or o");
            String symbol = new String();
            symbol=sc.next();
              
        int check=0;
        
        //to know who is play
        int b=1;
        while(true)
        {
            if(symbol.equals("o"))
            { b = 2;break;}
            else if(symbol.equals("x"))
                 { b = 1;break;}
            else
            { 
                System.out.println("choose x or o");  symbol=sc.next();
            }
        }
           
        while(true)
        {
            
            //to set position
          int i,j;
          System.out.println("Enter position,(range row<=2 , column<=2)"); 
          i = sc.nextInt();
          j= sc.nextInt();
          
          //to check range
                while(true)
                {
                    if(i>2 || j>2)
                      {
                          System.out.println("Enter position,(range row<=2 , column<=2)");
                           i = sc.nextInt();
                           j= sc.nextInt();
                     }
                    else
                        break;
                }
                
                //to check the pos. is used or no
          if(  arr[i][j].equals("x") == false && arr[i][j].equals("o") == false)
          { 
              
             ++check;
                if(b%2 == 1)
                {
                    ++b;
                    arr[i][j]="x";
                }
                else if(b%2 == 0)
                    {
                        ++b;
                        arr[i][j]="o";
                    }
               
                  for(int v=0;v<3;v++)
                      {
                           for(int k=0;k<3;k++)
                           {
                                System.out.print(arr[v][k]+" ");
                           }
                            System.out.println();

                      }
                  System.out.println();
            }  
         
          else
              System.out.println("Choose another move");
                  
 
              
          if(arr[0][0].equals("x") && arr[0][1].equals("x") && arr[0][2].equals("x"))
          { System.out.print("player x win");break;}
          if(arr[1][0].equals("x") && arr[1][1].equals("x") && arr[1][2].equals("x"))
              { System.out.print("player x win");break;}
            if(arr[2][0].equals("x") && arr[2][1].equals("x") && arr[2][2].equals("x"))
              { System.out.print("player x win");break;}
          
          if(arr[0][0].equals("o") && arr[0][1].equals("o") && arr[0][2].equals("o"))
                 { System.out.print("player o win");break;}
          if(arr[1][0].equals("o") && arr[1][1].equals("o") && arr[1][2].equals("o"))
                 { System.out.print("player o win");break;}
           if(arr[2][0].equals("o") && arr[2][1].equals("o") && arr[2][2].equals("o"))
                 { System.out.print("player o win");break;}
          
          if(arr[0][0].equals("x") && arr[1][0].equals("x") && arr[2][0].equals("x"))
               { System.out.print("player x win");break;}
           if(arr[0][1].equals("x") && arr[1][1].equals("x") && arr[2][1].equals("x"))
                 { System.out.print("player x win");break;}
           if(arr[0][2].equals("x") && arr[1][2].equals("x") && arr[2][2].equals("x"))
                 { System.out.print("player x win");break;}
           
            if(arr[0][0].equals("o") && arr[1][0].equals("o") && arr[2][0].equals("o"))
               { System.out.print("player o win");break;}
           if(arr[0][1].equals("o") && arr[1][1].equals("o") && arr[2][1].equals("o"))
                 { System.out.print("player o win");break;}
            if(arr[0][2].equals("o") && arr[1][2].equals("o") && arr[2][2].equals("o"))
                 { System.out.print("player o win");break;}
            
            //diagonal
          if(arr[0][0].equals("x") && arr[1][1].equals("x") && arr[2][2].equals("x"))
               { System.out.print("player x win");break;}
           if(arr[0][2].equals("x") && arr[1][1].equals("x") && arr[2][0].equals("x"))
               { System.out.print("player x win");break;}
         
           
            if(arr[0][0].equals("o") && arr[1][1].equals("o") && arr[2][2].equals("o"))
               { System.out.print("player o win");break;}
             if(arr[0][2].equals("o") && arr[1][1].equals("o") && arr[2][0].equals("o"))
               { System.out.print("player o win");break;}
             //if there is no more pos. and no winner
         if(check == 9)
              { System.out.print("Draw");break;}
            
        }
        
    }
    
}
