package Array;
class Arrayexample{
    void demo(){
        int []crr=new int[4];
        int [][]brr=new int[4][4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                brr[i][j]=i+j;
            }
        }
        System.out.println(brr.length);
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(brr[i][j]+" ");
            }
        }
        System.out.println();
        for (int x:crr){
            System.out.println(x);
        }
        System.out.println("this is horizontal line ");
        for (int []row:brr){
            for (int element:row ){
                System.out.print(element+" ");
            }
        }
        System.out.println();

        int k=0;
        while(k<4){
            System.out.print(crr[k]+" ");
            k++;
        }
        System.out.println();
        System.out.println("This is another horizonatl line");
        for (int i=0;i<brr.length;i++){
            for (int j=0;j<brr[i].length;j++){
                System.out.print(brr[i][j]+" ");
            }

        }

    }
}
public class Intro {

    public static void main(String[] args) {
        System.out.println("hello world ");

        Arrayexample a=new Arrayexample();
        a.demo();


    }


}
