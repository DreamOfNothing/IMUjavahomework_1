/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg555;

/**
 *
 * @author admin
 */
public class T4 {
    int[][]board=new int[3][3];;
    public static void main(String[] args) {
        T4 a=new T4();
        for(a.initdata();a.board[0][0]!=9;a.nextdata())
        if(a.check())
            {a.output();System.out.println();}
        a.initdata();
        a.board[0][0]=9;
        for(;a.board[0][0]!=1;a.nextdata())
            if(a.check())
            {a.output();System.out.println();}
    }
    public boolean check(){
        if(!datadifferent())
            return false;
        for(int i=0;i<board.length;i++)
            if((board[0][i]+board[1][i]+board[2][i]!=15)||(board[i][0]+board[i][1]+board[i][2]!=15)||(board[0][0]+board[1][1]+board[2][2]!=15)||(board[2][0]+board[1][1]+board[0][2]!=15))
                return false;
        return true;
    }
    public boolean datadifferent(){
        int[]digit=new int[10];
    for(int i=0;i<board.length;i++)
        for(int j=0;j<board.length;j++)
            digit[board[i][j]]=1;
    int j=0;
    for(int i=0;i<digit.length;i++)
        j+=digit[i];
    if(j==9)
        return (true);
    return (false);
    }
    public void nextdata(){
        for(int i=2;i>=0;i--) 
            for(int j=2;j>=0;j--)
                if(board[i][j]==9)
                    board[i][j]=1;
                else
                {board[i][j]++;return;}
    }
    public void initdata(){
        int i,j,k;
        for(i=0,k=1;i<board.length;i++)
            for(j=0;j<board.length;j++,k++)
                board[i][j]=k;
    }
    public void output(){
        for(int i=0;i<board.length;i++){
            System.out.println("-------");
            int j;
        for(j=0;j<board[i].length;j++)
            System.out.print("|"+board[i][j]);
        System.out.println("|");
        }
        System.out.println("-------");
    }
    
}