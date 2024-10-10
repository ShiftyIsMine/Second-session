package chp10.ex10_1;

public class knight extends Novice{
    int stamina;
    void slash(){
        System.out.printf("%s(HP : %d,Stamina : %d) 칼로 베어요 // \n",name,hp,stamina);
    }
}
