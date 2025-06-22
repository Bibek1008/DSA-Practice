package recursion_8;

public class Keybord_combination {

    static void combination(String s,String kp[],String res){
        //base case
        if(s.length()==0){
            System.out.print(res+" ");//53
            return;
        }
        int currentNum=s.charAt(0)-'0';
        String currChoice=kp[currentNum];

        for(int i=0;i<currChoice.length();i++){     //5->jkl
                                                    //3->def
            combination(s.substring(1),kp,res+currChoice.charAt(i));
        }

        //time complexsity of this problem is o(n 4^n)





    }


    public static void main(String[] args) {

        String s="53";
        String []kp={
                "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };

        combination(s,kp,"");

    }
}
